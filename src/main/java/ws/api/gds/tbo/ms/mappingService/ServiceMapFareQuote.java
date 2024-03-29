package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.FareQuoteRequest;
import ws.api.gds.tbo.ms.domain.FareQuoteResponse;
import ws.api.gds.tbo.ms.model.AirItineraryPricingInfoModel;
import ws.api.gds.tbo.ms.model.AirRevalidateResponseModel;
import ws.api.gds.tbo.ms.model.ErrorModel;
import ws.api.gds.tbo.ms.model.FlightSegmentModel;
import ws.api.gds.tbo.ms.model.OriginDestinationOptionModel;
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

					
					System.out.println("--------------------->"+airIt.getFareType());
					System.out.println("--------------------->"+airIt.getIsRefundable());
					
					
					result.setAirItineraryPricingInfo(airIt);
					
					
					
					List<OriginDestinationOptionModel>  OriginList = new ArrayList<>();
					
					r.getSegments().forEach(j -> {
						List<FlightSegmentModel> flightSegments = new ArrayList<>();

						j.forEach(k -> {

						
						
						
						
						
						FlightSegmentModel flightSegment = new FlightSegmentModel();

						
						flightSegment.setCabinClassCode(k.getCabinClass());
						System.out.println("--------------------->"+flightSegment.getCabinClassCode());

						flightSegment.setArrivalDateTime(String.valueOf(k.getArrivalTime()));
						flightSegment.setDepartureDateTime(String.valueOf(k.getDepartureDate()));
						flightSegment.setEticket(k.iseTicketEligible());
						
						flightSegment.setFligthDuration(k.getDuration());
						flightSegment.setIsStop(k.isStopOver());
						flightSegment.setStopQuantity(k.getStops());
						flightSegment.setBaggage(k.getIncludedBaggage());
						flightSegment.setAirlinePnr(String.valueOf(k.getAirlinePNR()));
						flightSegment.setArrivalAirportLocationCode(k.getDestination().getAirportCode());
						flightSegment.setArrivalAirportLocation(k.getDestination().getAirportName());
						flightSegment.setDepartureAirportLocationCode(k.getOrigin().getAirportCode());
						flightSegment.setDepartureAirportLocation(k.getOrigin().getAirportName());
						flightSegment.setFlightNumber(k.getAirlineDetails().getFlightNumber());
						flightSegment.setAirlineReservationCode(k.getAirlineDetails().getAirlineCode());
						
						
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
