package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.SearchRequest;
import ws.api.gds.tbo.ms.domain.SearchRequest.FlightCabinClass;
import ws.api.gds.tbo.ms.domain.SearchRequest.JourneyType;
import ws.api.gds.tbo.ms.domain.SearchResponse;
import ws.api.gds.tbo.ms.domain.Segment;
import ws.api.gds.tbo.ms.model.AirItineraryPricingInfoModel;
import ws.api.gds.tbo.ms.model.AirLowFareSearchResultModel;
import ws.api.gds.tbo.ms.model.ErrorModel;
import ws.api.gds.tbo.ms.model.FareModel;
import ws.api.gds.tbo.ms.model.FlightSearchModel;
import ws.api.gds.tbo.ms.model.FlightSegmentModel;
import ws.api.gds.tbo.ms.model.ItinTotalFareModel;
import ws.api.gds.tbo.ms.model.OriginDestinationOptionModel;
import ws.api.gds.tbo.ms.model.PTCFareBreakdownModel;
import ws.api.gds.tbo.ms.model.PassengerFareModel;
import ws.api.gds.tbo.ms.model.PassengerTypeQuantityModel;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;

@Service
public class ServiceMapSearch {

	public SearchRequest SearchRQ(FlightSearchModel model) {
		SearchRequest request = new SearchRequest();
		request.setiPAddress("192.168.11.92");
		request.setTokenId(model.getGdsModel().getSessionId());// getting the token id from the GdsSessionModel
		request.setEndUserBrowserAgent(
				"Mozilla/5.0(Windows NT 6.1; Win64; x64) AppleWebKit/537.36(KHTML, likeGecko) Chrome/70.0.3538.110 Safari/537.36");
		request.setPointOfSale(model.getSessionId());
		request.setUserData(null);

		if (model.getTypeSearch() != null) {
			int intValue = model.getTypeSearch().intValue();
			if (intValue == 1) {
				request.setJourneyType(JourneyType.OneWay);
			} else if (intValue == 2) {
				request.setJourneyType(JourneyType.Return);

			} else if (intValue == 3) {
				request.setJourneyType(JourneyType.MultiCity);
			}
			

		} else {
			System.err.println("Error: typeSearch is null");
		}

		request.setAdultCount(model.getQteADT());
		request.setChildCount(model.getQteCHD());
		request.setInfantCount(model.getQteINF());

		if (model.getClasse().equals("C")) {
			request.setFlightCabinClass(FlightCabinClass.Business);
		} else if (model.getClasse().equals("Y")) {
			request.setFlightCabinClass(FlightCabinClass.Economy);
		} else if (model.getClasse().equals("W")) {
			request.setFlightCabinClass(FlightCabinClass.PremiumEconomy);
		} else if (model.getClasse().equals("F")) {
			request.setFlightCabinClass(FlightCabinClass.First);
		}

		ArrayList<Segment> segments = new ArrayList<>();
		if (model.getTypeSearch() == 1 && model.getDepartVol1() != null && model.getDestinationVol1() != null) {
			Segment seg = new Segment(model.getDepartVol1(), model.getDestinationVol1(), model.getDepartleVol1(),
					model.getDepartleVol1());
			segments.add(seg);
		}
		if (model.getTypeSearch() == 2 && model.getDepartVol1() != null && model.getDestinationVol1() != null
				&& model.getDepartVol2() != null && model.getDestinationVol2() != null) {
			
			Segment seg = new Segment(model.getDepartVol1(), model.getDestinationVol1(), model.getDepartleVol1(),
					model.getDepartleVol2());
			segments.add(seg);
			
			Segment seg1 = new Segment(model.getDepartVol2(), model.getDestinationVol2(), model.getDepartleVol2(),
					model.getRetourleVol1());
			segments.add(seg1);
			
		}
		if (model.getTypeSearch() == 3 && model.getDepartVol1() != null && model.getDestinationVol1() != null
				&& model.getDepartVol2() != null && model.getDestinationVol2() != null && model.getDepartVol3() != null
				&& model.getDestinationVol3() != null) {
			
			Segment seg = new Segment(model.getDepartVol1(), model.getDestinationVol1(), model.getDepartleVol1(),
					model.getDepartleVol2());
			segments.add(seg);
			Segment seg1 = new Segment(model.getDepartVol2(), model.getDestinationVol2(), model.getDepartleVol2(),
					model.getDepartleVol3());
			segments.add(seg1);
			Segment seg2 = new Segment(model.getDepartVol3(), model.getDestinationVol3(), model.getDepartleVol3(),
					model.getRetourleVol1());
			segments.add(seg2);
		}
		;

		request.setSegment(segments);

		return request;
	}

	@SuppressWarnings("unused")
	public AirLowFareSearchResultModel SearchRS(SearchResponse responseGds, FlightSearchModel model) {
		

		if (responseGds != null) {
			AirLowFareSearchResultModel response = new AirLowFareSearchResultModel();

			response.setSuccess(responseGds.isSuccess());
			response.setNbPassenger(model.getQteADT() + model.getQteCHD() + model.getQteINF());
			response.setDepartDate(model.getDepartleVol1());
			response.setReturnDate(model.getRetourleVol1());
			response.setNbAdt(model.getQteADT());
			response.setNbChd(model.getQteCHD());
			response.setNbInf(model.getQteINF());

			
			System.out.println(responseGds.isDomestic());
			System.out.println(response.getSuccess());
			if (response.getSuccess() == false) {

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

			} else {
				System.out.println("the error list is Null !! ");
			}		
		
		if (responseGds.getResults() != null || !responseGds.getResults().isEmpty()) {
			

			List<PricedItineraryModel> pricedItineraryModels = new ArrayList<>();
			System.out.println(responseGds.getResults().get(0).get(0).getJourneyType());

			if(responseGds.getResults().get(0).get(0).getJourneyType()==1) {
				responseGds.getResults().forEach(r -> {
					r.forEach(i -> {

						PricedItineraryModel result = new PricedItineraryModel();
						result.setResultId(i.getResultId());
						//neww fieldss******
						result.setNbStop(r.get(0).getSegments().get(0).get(0).getStops());
						result.setCodeGds(model.getGdsModel().getCodeGds());
						result.setIdGds(model.getGdsModel().getIdGds());
						result.setOfficeId(model.getGdsModel().getOfficeId());
						result.setGdsModel(model.getGdsModel());
						result.setCabinClass(r.get(0).getSegments().get(0).get(0).getCabinClass().charAt(0));
						String baggage=r.get(0).getSegments().get(0).get(0).getIncludedBaggage();
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
						// on a fait le mapping du trackingId dans transactionId
						result.setTransactionID(responseGds.getTrackingId());

						AirItineraryPricingInfoModel airIt = new AirItineraryPricingInfoModel();

						if (i.isLcc() == true) {
							airIt.setFareType("Basic");
						} else {
							airIt.setFareType("GDS");

						}
						System.out.println("airIt fareType "+airIt.getFareType());

						if (i.isNonRefundable() == true) {
							airIt.setIsRefundable("N");
						} else {
							airIt.setIsRefundable("O");

						}
						/*
						 * Start mapping PTCFareBreakdownModel
						 */
						List<PTCFareBreakdownModel> ptcFareBreakdowns = new ArrayList<>();
						i.getFareBreakdown().forEach(f -> {

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
						if(i.getFare()!= null) {
							// mapping totalFare
							FareModel totalFare = new FareModel();
							totalFare.setAmount(Double.toString(i.getFare().getTotalFare()));
							totalFare.setCurrencyCode(i.getFare().getAgentPreferredCurrency());
							totalFare.setDecimalPlaces(2);
							// mapping baseFare
							FareModel baseFare = new FareModel();
							baseFare.setAmount(Double.toString(i.getFare().getBaseFare()));
							baseFare.setCurrencyCode(i.getFare().getAgentPreferredCurrency());
							baseFare.setDecimalPlaces(2);

							// mapping tax
							FareModel tax = new FareModel();
							tax.setAmount(Double.toString(i.getFare().getTax()));
							tax.setCurrencyCode(i.getFare().getAgentPreferredCurrency());
							tax.setDecimalPlaces(2);
							itinTotalFare.setBaseFare(baseFare);
							itinTotalFare.setTotaleFare((float) i.getFare().getTotalFare());
							itinTotalFare.setTotalFare(totalFare);
							itinTotalFare.setTotalTax(tax);
							

						}
						airIt.setPtcFareBreakdowns(ptcFareBreakdowns);
						airIt.setItinTotalFare(itinTotalFare);
						System.out.println("itinTotalFare "+itinTotalFare.toString());
						
						
						System.out.println("--------------------->" + airIt.getFareType());
						System.out.println("--------------------->" + airIt.getIsRefundable());

						result.setAirItineraryPricingInfos( Arrays.asList(airIt) );
						System.out.println("airIt "+result.getAirItineraryPricingInfos());
						List<OriginDestinationOptionModel> OriginList = new ArrayList<>();

						i.getSegments().forEach(j -> {
							List<FlightSegmentModel> flightSegments = new ArrayList<>();

							j.forEach(k -> {

								FlightSegmentModel flightSegment = new FlightSegmentModel();

								response.setDepartAirelines(k.getAirlineDetails().getAirlineName());
								response.setDepartAirelinesIata(k.getAirlineDetails().getAirlineCode());
								
								response.setDestinationAirelines(k.getAirlineDetails().getAirlineName());
								response.setDestinationAirelinesIata(k.getAirlineDetails().getAirlineCode());

								
								
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
							System.out.println(Origin.toString());

						});

						result.setOriginDestinationOptions(OriginList);

						pricedItineraryModels.add(result);
						response.setPricedItineraries(pricedItineraryModels);
					});
				});
			}else if(responseGds.getResults().get(0).get(0).getJourneyType()==2){
				responseGds.getResults().forEach(r -> {
					r.forEach(i -> {

						PricedItineraryModel result = new PricedItineraryModel();
						result.setResultId(i.getResultId());
						

						// on a fait le mapping du trackingId dans transactionId
						result.setTransactionID(responseGds.getTrackingId());

						AirItineraryPricingInfoModel airIt = new AirItineraryPricingInfoModel();

						if (i.isLcc() == true) {
							airIt.setFareType("Basic");
						} else {
							airIt.setFareType("GDS");

						}

						if (i.isNonRefundable() == true) {
							airIt.setIsRefundable("N");
						} else {
							airIt.setIsRefundable("O");

						}
						/*
						 * Start mapping PTCFareBreakdownModel
						 */
						List<PTCFareBreakdownModel> ptcFareBreakdowns = new ArrayList<>();
						i.getFareBreakdown().forEach(f -> {

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
						if(i.getFare()!= null) {
							// mapping totalFare
							FareModel totalFare = new FareModel();
							totalFare.setAmount(Double.toString(i.getFare().getTotalFare()));
							totalFare.setCurrencyCode(i.getFare().getAgentPreferredCurrency());
							totalFare.setDecimalPlaces(2);
							// mapping baseFare
							FareModel baseFare = new FareModel();
							baseFare.setAmount(Double.toString(i.getFare().getBaseFare()));
							baseFare.setCurrencyCode(i.getFare().getAgentPreferredCurrency());
							baseFare.setDecimalPlaces(2);

							// mapping tax
							FareModel tax = new FareModel();
							tax.setAmount(Double.toString(i.getFare().getTax()));
							tax.setCurrencyCode(i.getFare().getAgentPreferredCurrency());
							tax.setDecimalPlaces(2);
							itinTotalFare.setBaseFare(baseFare);
							itinTotalFare.setTotaleFare((float) i.getFare().getTotalFare());
							itinTotalFare.setTotalFare(totalFare);
							itinTotalFare.setTotalTax(tax);
							

						}
						airIt.setPtcFareBreakdowns(ptcFareBreakdowns);
						airIt.setItinTotalFare(itinTotalFare);

						
						System.out.println("--------------------->" + airIt.getFareType());
						System.out.println("--------------------->" + airIt.getIsRefundable());

						result.setAirItineraryPricingInfo(airIt);

						List<OriginDestinationOptionModel> OriginList = new ArrayList<>();

						i.getSegments().forEach(j -> {
							List<FlightSegmentModel> flightSegments = new ArrayList<>();

							j.forEach(k -> {

								FlightSegmentModel flightSegment1 = new FlightSegmentModel();

								flightSegment1.setCabinClassCode(k.getCabinClass());
								System.out.println("--------------------->" + flightSegment1.getCabinClassCode());

								flightSegment1.setArrivalDateTime(String.valueOf(k.getArrivalDateTime()));
								flightSegment1.setDepartureDateTime(String.valueOf(k.getDepartureDateTime()));
								flightSegment1.setDepartureTimeModel(k.getDepartureTime());
								flightSegment1.setArrivalTimeModel(k.getArrivalTime());
								flightSegment1.setDepartureDateModel(String.valueOf(k.getDepartureDate()));
								flightSegment1.setArrivalDateModel(String.valueOf(k.getArrivalDate()));
								
								
								
								flightSegment1.setEticket(k.iseTicketEligible());
								
								flightSegment1.setFligthDuration(k.getDuration());
								flightSegment1.setIsStop(k.isStopOver());
								flightSegment1.setStopQuantity(k.getStops());
								flightSegment1.setBaggage(k.getIncludedBaggage());
								flightSegment1.setAirlinePnr(String.valueOf(k.getAirlinePNR()));
								flightSegment1.setArrivalAirportLocationCode(k.getDestination().getAirportCode());
								flightSegment1.setArrivalAirportLocation(k.getDestination().getAirportName());
								flightSegment1.setDepartureAirportLocationCode(k.getOrigin().getAirportCode());
								flightSegment1.setDepartureAirportLocation(k.getOrigin().getAirportName());
								flightSegment1.setFlightNumber(k.getAirlineDetails().getFlightNumber());
								flightSegment1.setAirlineReservationCode(k.getAirlineDetails().getAirlineCode());
								flightSegment1.setMarketingAirline(k.getAirlineDetails().getAirlineName());
								flightSegment1.setMarketingAirlineCode(k.getAirlineDetails().getAirlineCode());
								flightSegment1.setCabinClassText(k.getCabinClass());
								flightSegment1.setCabinClassCode(k.getCabinClass());
								flightSegment1.setSeat(k.getCabinBaggage());
								flightSegment1.setStopoverTime(String.valueOf(k.getStops()));
								flightSegment1.setJourneyDuration(Integer.valueOf(k.getDuration()));

								flightSegments.add(flightSegment1);
								
								
								
								FlightSegmentModel flightSegment2 = new FlightSegmentModel();

								flightSegment2.setCabinClassCode(k.getCabinClass());
								System.out.println("--------------------->" + flightSegment2.getCabinClassCode());

								flightSegment2.setArrivalDateTime(String.valueOf(k.getArrivalDateTime()));
								flightSegment2.setDepartureDateTime(String.valueOf(k.getDepartureDateTime()));
								flightSegment2.setDepartureTimeModel(k.getDepartureTime());
								flightSegment2.setArrivalTimeModel(k.getArrivalTime());
								flightSegment2.setDepartureDateModel(String.valueOf(k.getDepartureDate()));
								flightSegment2.setArrivalDateModel(String.valueOf(k.getArrivalDate()));
								
								
								
								flightSegment2.setEticket(k.iseTicketEligible());
								
								flightSegment2.setFligthDuration(k.getDuration());
								flightSegment2.setIsStop(k.isStopOver());
								flightSegment2.setStopQuantity(k.getStops());
								flightSegment2.setBaggage(k.getIncludedBaggage());
								flightSegment2.setAirlinePnr(String.valueOf(k.getAirlinePNR()));
								flightSegment2.setArrivalAirportLocationCode(k.getDestination().getAirportCode());
								flightSegment2.setArrivalAirportLocation(k.getDestination().getAirportName());
								flightSegment2.setDepartureAirportLocationCode(k.getOrigin().getAirportCode());
								flightSegment2.setDepartureAirportLocation(k.getOrigin().getAirportName());
								flightSegment2.setFlightNumber(k.getAirlineDetails().getFlightNumber());
								flightSegment2.setAirlineReservationCode(k.getAirlineDetails().getAirlineCode());
								flightSegment2.setMarketingAirline(k.getAirlineDetails().getAirlineName());
								flightSegment2.setMarketingAirlineCode(k.getAirlineDetails().getAirlineCode());
								flightSegment2.setCabinClassText(k.getCabinClass());
								flightSegment2.setCabinClassCode(k.getCabinClass());
								flightSegment2.setSeat(String.valueOf(k.getNoOfSeatAvailable()));
								flightSegment2.setStopoverTime(String.valueOf(k.getStops()));
								flightSegment2.setJourneyDuration(Integer.valueOf(k.getDuration()));

								flightSegments.add(flightSegment2);

							});

							OriginDestinationOptionModel Origin = new OriginDestinationOptionModel();
							Origin.setFlightSegment(flightSegments);

							OriginList.add(Origin);

						});

						result.setOriginDestinationOptions(OriginList);

						pricedItineraryModels.add(result);
						response.setPricedItineraries(pricedItineraryModels);
					});
				});
			}
			

		}

		return response;
		}else {
			return null;
		}

	}

}
