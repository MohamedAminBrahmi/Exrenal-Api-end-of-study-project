package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.FareQuoteRequest;
import ws.api.gds.tbo.ms.domain.FareQuoteResponse;
import ws.api.gds.tbo.ms.model.AirItineraryPricingInfoModel;
import ws.api.gds.tbo.ms.model.AirRevalidateResponseModel;
import ws.api.gds.tbo.ms.model.ErrorModel;
import ws.api.gds.tbo.ms.model.FareModel;
import ws.api.gds.tbo.ms.model.FlightSegmentModel;
import ws.api.gds.tbo.ms.model.ItinTotalFareModel;
import ws.api.gds.tbo.ms.model.OriginDestinationOptionModel;
import ws.api.gds.tbo.ms.model.PTCFareBreakdownModel;
import ws.api.gds.tbo.ms.model.PassengerFareModel;
import ws.api.gds.tbo.ms.model.PassengerTypeQuantityModel;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;


@Service
public class ServiceMapFareQuote {
	
	

	public FareQuoteRequest FareQuoteRQ(PricedItineraryModel model) {
		FareQuoteRequest request= new FareQuoteRequest();
		//new field created in PricedItineraryModel
		System.out.println(model.getGdsModel().getSessionId());
		request.setTokenId(model.getGdsModel().getSessionId());
		request.setIPAddress("192.168.11.92");
		request.setEndUserBrowserAgent("Mozilla/5.0(Windows NT6.1)");
		request.setResultId(model.getResultId());
		request.setTrackingId(model.getTransactionID());
		request.setPointOfSale(model.getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocationCode());
		request.setRequestOrigin(model.getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocation());
		
		return request;
	}
	
	
	public AirRevalidateResponseModel FareQuoteRS(FareQuoteResponse responseGds,PricedItineraryModel model) {
		
		
		if(responseGds != null) {	
			AirRevalidateResponseModel response= new AirRevalidateResponseModel();
			
			
			//mapping des 'fiels' principaux
			
			response.setSuccess(responseGds.isSuccess());
			response.setDepartureCity(responseGds.getResult().get(0).getOrigin());
			response.setDestinationCity(responseGds.getResult().get(0).getDestination());
			response.setAirelines(responseGds.getResult().get(0).getSegments().get(0).get(0).getAirlineDetails().getAirlineName());
			System.out.println(response.getSuccess());
			if (response.getSuccess()==false) {
				
				List<ErrorModel> errors = new ArrayList<>();
				
				responseGds.getErrors().forEach(el -> {
					ErrorModel error = new ErrorModel();
					error.setCode(el.getErrorCode().toString());
					error.setMessage(el.getErrorMessage());
					errors.add(error);
				});
				response.setErrors(errors);
			}
				if (response.getErrors() != null) {
					System.out.println(response.getErrors().get(0).getMessage());
 
					}else{
						System.out.println("the error list is Null !! ");
					};
				
			
			
			
			if(responseGds.getResult()!=null || !responseGds.getResult().isEmpty()) {
				
				List<PricedItineraryModel> pricedItineraryModels = new ArrayList<>();

				responseGds.getResult().forEach(r -> {
						
					
						PricedItineraryModel result = new PricedItineraryModel();
						result.setResultId(r.getResultId());
						//on a fait le mapping du trackingId dans transactionId
						result.setTransactionID(responseGds.getTrackingId());
						
						//neww fieldss******
						result.setNbStop(r.getSegments().get(0).get(0).getStops());
						result.setCodeGds(model.getGdsModel().getCodeGds());
						result.setIdGds(model.getGdsModel().getIdGds());
						result.setOfficeId(model.getGdsModel().getOfficeId());
						result.setGdsModel(model.getGdsModel());
						result.setCabinClass(r.getSegments().get(0).get(0).getCabinClass().charAt(0));
						String baggage=r.getSegments().get(0).get(0).getIncludedBaggage();
						if(baggage != null) {
							result.setBaggageAllowance(true);
						}else {
							result.setBaggageAllowance(false);
						}
						result.setGdsTimeZone(model.getGdsModel().getGdsTimeZone());
						result.setGdsNotification(model.getGdsModel().getGdsNotification());
						result.setGdsDisplayNotif(model.getGdsModel().getDisplayNotif());
						result.setGdsDevise(model.getGdsModel().getCodeDevise());
						
						//****
					
					AirItineraryPricingInfoModel airIt = new AirItineraryPricingInfoModel();

					if(r.isLcc()==true) {
						airIt.setFareType("Basic");
					}else {
						airIt.setFareType("GDS");

					}
					
					if(r.isNonRefundable()==true) {
						airIt.setIsRefundable("N");
					}else {
						airIt.setIsRefundable("O");

					}
					/*
					 * Start mapping PTCFareBreakdownModel
					 */
					List<PTCFareBreakdownModel> ptcFareBreakdowns = new ArrayList<>();
					r.getFareBreakdown().forEach(f -> {

						PTCFareBreakdownModel ptcFareBreakdown = new PTCFareBreakdownModel();
						// mapping PassengerTypeQuantityModel
						PassengerTypeQuantityModel passengerTypeQuantityModel = new PassengerTypeQuantityModel();
						passengerTypeQuantityModel.setQuantity(f.getPassengerCount());
						passengerTypeQuantityModel.setCode(f.getPassengerType() == 1 ? "AHD" : f.getPassengerType() ==2 ? "CHD" : "INF");
						ptcFareBreakdown.setPassengerTypeQuantity(passengerTypeQuantityModel);

						// mapping PassengerFareModel
						PassengerFareModel passengerFareModel = new PassengerFareModel();
						// mapping totalFare
						FareModel totalFare = new FareModel();
						totalFare.setAmount(Double.toString(f.getTotalFare()));
						totalFare.setCurrencyCode(f.getCurrency());
						totalFare.setDecimalPlaces(2);
						// mapping baseFare
						FareModel baseFare = new FareModel();
						baseFare.setAmount(Double.toString(f.getBaseFare()));
						baseFare.setCurrencyCode(f.getCurrency());
						baseFare.setDecimalPlaces(2);

						// mapping tax
						FareModel tax = new FareModel();
						tax.setAmount(Double.toString(f.getTax()));
						tax.setCurrencyCode(f.getCurrency());
						tax.setDecimalPlaces(2);

						passengerFareModel.setTotalFare(totalFare);
						passengerFareModel.setBaseFare(baseFare);
						passengerFareModel.setTax(tax);
						ptcFareBreakdown.setPassengerFare(passengerFareModel);
						ptcFareBreakdowns.add(ptcFareBreakdown);

					});
					/*
					 * End mapping PTCFareBreakdownModel
					 */
					
					/*
					 * Start mapping ItinTotalFareModel
					 */
					ItinTotalFareModel itinTotalFare = new ItinTotalFareModel();
					if(r.getFare()!= null) {
						// mapping totalFare
						FareModel totalFare = new FareModel();
						totalFare.setAmount(Double.toString(r.getFare().getTotalFare()));
						totalFare.setCurrencyCode(r.getFare().getAgentPreferredCurrency());
						totalFare.setDecimalPlaces(2);
						// mapping baseFare
						FareModel baseFare = new FareModel();
						baseFare.setAmount(Double.toString(r.getFare().getBaseFare()));
						baseFare.setCurrencyCode(r.getFare().getAgentPreferredCurrency());
						baseFare.setDecimalPlaces(2);

						// mapping tax
						FareModel tax = new FareModel();
						tax.setAmount(Double.toString(r.getFare().getTax()));
						tax.setCurrencyCode(r.getFare().getAgentPreferredCurrency());
						tax.setDecimalPlaces(2);
						itinTotalFare.setBaseFare(baseFare);
						itinTotalFare.setTotaleFare((float) r.getFare().getTotalFare());
						itinTotalFare.setTotalFare(totalFare);
						itinTotalFare.setTotalTax(tax);
						

					}

					
					System.out.println("--------------------->"+airIt.getFareType());
					System.out.println("--------------------->"+airIt.getIsRefundable());
					
					
					result.setAirItineraryPricingInfo(airIt);
					
					
					
					List<OriginDestinationOptionModel>  OriginList = new ArrayList<>();
					
					r.getSegments().forEach(j -> {
						List<FlightSegmentModel> flightSegments = new ArrayList<>();

						j.forEach(k -> {

						
						
						
						
						
						FlightSegmentModel flightSegment = new FlightSegmentModel();

						
						
						flightSegment.setCabinClassCode(k.getCabinClass());
						System.out.println("--------------------->" + flightSegment.getCabinClassCode());

						flightSegment.setArrivalDateTime( k.getArrivalTime());
						flightSegment.setDepartureDateTime( k.getDepartureTime());
						
						flightSegment.setDepartureDateModel(k.getDepartureTime().substring(0, Math.min(k.getArrivalTime().length(), 10)));
						flightSegment.setDepartureTimeModel(k.getDepartureTime().substring(11, k.getDepartureTime().length()));
						
						flightSegment.setArrivalDateModel(k.getArrivalTime().substring(0, Math.min(k.getArrivalTime().length(), 10)));
						flightSegment.setArrivalTimeModel(k.getArrivalTime().substring(11, k.getArrivalTime().length()));
						
						
						
						flightSegment.setEticket(k.iseTicketEligible());
						
						flightSegment.setFligthDuration(k.getDuration());
						flightSegment.setIsStop(k.isStopOver());
						flightSegment.setStopQuantity(k.getStops());
						flightSegment.setBaggage(k.getIncludedBaggage());
						flightSegment.setAirlinePnr(String.valueOf(k.getAirlinePNR()));
						flightSegment.setArrivalAirportLocationCode(k.getDestination().getAirportCode());
						System.out.println("name "+k.getDestination().getAirportName());
						System.out.println("code "+k.getDestination().getAirportCode());

						flightSegment.setArrivalAirportLocation(k.getDestination().getAirportName());
						flightSegment.setDepartureAirportLocationCode(k.getDestination().getAirportCode());
						
						flightSegment.setDepartureAirportLocation(k.getOrigin().getAirportName());
						flightSegment.setFlightNumber(k.getAirlineDetails().getFlightNumber());
						flightSegment.setAirlineReservationCode(k.getAirlineDetails().getAirlineCode());
						flightSegment.setMarketingAirline(k.getAirlineDetails().getAirlineName());
						flightSegment.setMarketingAirlineCode(k.getAirlineDetails().getAirlineCode());
						flightSegment.setCabinClassText(k.getCabinClass());
						flightSegment.setCabinClassCode(k.getCabinClass());
						flightSegment.setSeat(String.valueOf(k.getNoOfSeatAvailable()));
						flightSegment.setStopoverTime(String.valueOf(k.getStops()));
						//flightSegment.setJourneyDuration(Integer.valueOf(k.getDuration()));
						
						
						flightSegments.add(flightSegment);
						
						
					});
						
						OriginDestinationOptionModel Origin = new OriginDestinationOptionModel();
						Origin.setFlightSegment(flightSegments);

					    OriginList.add(Origin);
						
					});
					
					result.setOriginDestinationOptions(OriginList);

					
					pricedItineraryModels.add(result);
					response.setPricedItineraries(pricedItineraryModels);	
				});
				
				
			}
			
			
			
		
		
		
		
		
		
		
		
		
		return response;
		}else {
			return null;
		}
	}

}
