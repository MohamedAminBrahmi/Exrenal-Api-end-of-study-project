package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;
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
			;

		} else {
			System.err.println("Error: typeSearch is null");
		}

		request.setAdultCount(model.getQteADT());
		request.setChildCount(model.getQteCHD());
		request.setInfantCount(model.getQteINF());

		if (model.getCabinType().equals("C")) {
			request.setFlightCabinClass(FlightCabinClass.Business);
		} else if (model.getCabinType().equals("Y")) {
			request.setFlightCabinClass(FlightCabinClass.Economy);
		} else if (model.getCabinType().equals("W")) {
			request.setFlightCabinClass(FlightCabinClass.PremiumEconomy);
		} else if (model.getCabinType().equals("F")) {
			request.setFlightCabinClass(FlightCabinClass.First);
		}
		;

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

							FlightSegmentModel flightSegment = new FlightSegmentModel();

							flightSegment.setCabinClassCode(k.getCabinClass());
							System.out.println("--------------------->" + flightSegment.getCabinClassCode());

							flightSegment.setArrivalDateTime(String.valueOf(k.getArrivalTime()));
							flightSegment.setDepartureDateTime(String.valueOf(k.getDepartureTime()));
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
							flightSegment.setMarketingAirline(k.getAirlineDetails().getAirlineName());
							flightSegment.setMarketingAirlineCode(k.getAirlineDetails().getAirlineCode());
							flightSegment.setCabinClassText(k.getCabinClass());
							flightSegment.setSeat(k.getCabinBaggage());

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
			});

		}

		return response;
		}else {
			return null;
		}

	}

}
