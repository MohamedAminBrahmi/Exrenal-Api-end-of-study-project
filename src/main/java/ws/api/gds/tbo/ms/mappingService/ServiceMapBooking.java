package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.AirlineDetails;
import ws.api.gds.tbo.ms.domain.BookRequest;
import ws.api.gds.tbo.ms.domain.BookResponse;
import ws.api.gds.tbo.ms.domain.Destination;
import ws.api.gds.tbo.ms.domain.FareRule;
import ws.api.gds.tbo.ms.domain.Itinerary;
import ws.api.gds.tbo.ms.domain.Origin;
import ws.api.gds.tbo.ms.domain.Passenger;
import ws.api.gds.tbo.ms.domain.Segments;
import ws.api.gds.tbo.ms.domain.SearchRequest.JourneyType;
import ws.api.gds.tbo.ms.model.BaggageInfoModel;
import ws.api.gds.tbo.ms.model.ErrorModel;
import ws.api.gds.tbo.ms.model.FareRuleModel;
import ws.api.gds.tbo.ms.model.FareRulesResponseModel;
import ws.api.gds.tbo.ms.model.FlightBookingModel;
import ws.api.gds.tbo.ms.model.FlightSegmentModel;
import ws.api.gds.tbo.ms.model.OperatingAirlineModel;
import ws.api.gds.tbo.ms.model.OriginDestinationOptionModel;
import ws.api.gds.tbo.ms.model.PassengerFlightBookingModel;
import ws.api.gds.tbo.ms.model.RuleDetailModel;
import ws.api.gds.tbo.ms.model.SeatsRemainingModel;
import ws.api.gds.tbo.ms.model.TripDetailsResponseModel;

@Service
public class ServiceMapBooking {

	public BookRequest BookingRQ(FlightBookingModel model) {
		BookRequest request= new BookRequest();
		request.setiPAddress("182.74.96.82");
		request.setResultId(model.getResultId());
		request.setTokenId(model.getGdsModel().getSessionId());
		request.setTrackingId(model.getTrackingId());
		request.getItinerary().setValidatingAirlineCode(model.getPricedItinerary().getValidatingAirlineCode());
		request.getItinerary().setJourneyType(Integer.parseInt(model.getPricedItinerary().getTicketType()));
		request.getItinerary().setDestination(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getArrivalAirportLocationCode());
		request.getItinerary().setOrigin(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocationCode());
		//search Type mapping je n'est pas trouver son equivalent dans model
		if (model.getPricedItinerary().getAirItineraryPricingInfo().getIsRefundable().equals("N")) {
			request.getItinerary().setNonRefundable(true);
		} else {
			request.getItinerary().setNonRefundable(false);
		}
		request.getItinerary().setDomestic(model.getPricedItinerary().getIsDomestic());
		if (model.getPricedItinerary().getFareType().equals("Basic")) {
			request.getItinerary().setLcc(true);
		} else {
			request.getItinerary().setLcc(false);
		}
		request.getItinerary().setPointOfSale("ID");
		request.getItinerary().setEndUserBrowserAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36");
		
		//isHoldEligibleForLcc mapping ?
		//request.getItinerary().setHoldEligibleForLcc(model.get);
		ArrayList<Segments> segList=new ArrayList<>();
		if(model.getPricedItinerary()!=null) {
			model.getPricedItinerary().getOriginDestinationOptions().forEach(s->{
				s.getFlightSegment().forEach(r->{
					Segments seg =new Segments();
					seg.setNoOfSeatAvailable(r.getSeatsRemaining().getNumber());
					seg.setOperatingCarrier(r.getOperatingAirline().getCode());
					seg.setFlightNumber(r.getFlightNumber());
					seg.setDepartureTime(r.getDepartureDateTime());
					seg.setArrivalTime(r.getArrivalDateTime());
					seg.seteTicketEligible(r.getEticket());
					seg.setAirlinePNR(r.getAirlinePnr());
					seg.setStopOver(r.getIsStop());
					seg.setStops(r.getStopQuantity());
					seg.setIncludedBaggage(r.getBaggage());
					seg.setCabinClass(r.getCabinClassText());
					seg.setAirlineName(r.getMarketingAirline());
					
					
					Origin origin =new Origin();
					origin.setAirportCode(r.getDepartureAirportLocationCode());
					origin.setAirportName(r.getDepartureAirportLocation());
					seg.setOrigin(origin);
					
					Destination dest =new Destination();
					dest.setAirportCode(r.getArrivalAirportLocationCode());
					dest.setAirportName(r.getArrivalAirportLocation());
					seg.setDestination(dest);
					
					AirlineDetails ad =new AirlineDetails();
					ad.setAirlineCode(r.getMarketingAirlineCode());
					ad.setAirlineName(r.getMarketingAirline());
					ad.setFlightNumber(r.getFlightNumber())	;
					ad.setOperatingCarrier(r.getOperatingAirline().getCode());
					seg.setAirlineDetails(ad);

					
					
					ArrayList<Passenger> PList=new ArrayList<>();

					if(model.getAdults()!=null) {
						
						model.getAdults().forEach(i->{
							Passenger pass=new Passenger();
							pass.setTitle(i.getPassengerTitle());
							pass.setFirstName(i.getFirstName());
							pass.setLastName(i.getLastName());
							//type mapping
							//gender mapping
							pass.setPassportNo(i.getPassportNumber());
							pass.setPassportExpiry(i.getExpiryDate());
							//airline
							pass.getNationality().setCountryCode(i.getNationality());
							pass.getCountry().setCountryCode(i.getCountry());
							pass.getMeal().setCode(i.getMealPreference());
							pass.getSeat().setCode(i.getSeatPreference());
							pass.setMobile1(i.getTel());
							pass.setMobile1CountryCode(i.getCountryTel());
							pass.setEmail(i.getMail());
							//isLeadPax mapping
							//fare mapping "flous"
							PList.add(pass);
							
						});
					
					}else {
						System.out.println("Adults List is null !!!");
					}
					
					if(model.getChilds()!=null) {
						
						model.getChilds().forEach(i->{
							Passenger pass=new Passenger();
							pass.setTitle(i.getPassengerTitle());
							pass.setFirstName(i.getFirstName());
							pass.setLastName(i.getLastName());
							//type mapping
							//gender mapping
							pass.setPassportNo(i.getPassportNumber());
							pass.setPassportExpiry(i.getExpiryDate());
							//airline
							pass.getNationality().setCountryCode(i.getNationality());
							pass.getCountry().setCountryCode(i.getCountry());
							pass.getMeal().setCode(i.getMealPreference());
							pass.getSeat().setCode(i.getSeatPreference());
							pass.setMobile1(i.getTel());
							pass.setMobile1CountryCode(i.getCountryTel());
							pass.setEmail(i.getMail());
							//isLeadPax mapping
							//fare mapping "flous"
							PList.add(pass);
							
						});
					
					}else {
						System.out.println("Childs List is null !!!");
					}
					if(model.getInfants()!=null) {
						
						model.getInfants().forEach(i->{
							Passenger pass=new Passenger();
							pass.setTitle(i.getPassengerTitle());
							pass.setFirstName(i.getFirstName());
							pass.setLastName(i.getLastName());
							//type mapping
							//gender mapping
							pass.setPassportNo(i.getPassportNumber());
							pass.setPassportExpiry(i.getExpiryDate());
							//airline
							pass.getNationality().setCountryCode(i.getNationality());
							pass.getCountry().setCountryCode(i.getCountry());
							pass.getMeal().setCode(i.getMealPreference());
							pass.getSeat().setCode(i.getSeatPreference());
							pass.setMobile1(i.getTel());
							pass.setMobile1CountryCode(i.getCountryTel());
							pass.setEmail(i.getMail());
							//isLeadPax mapping
							//fare mapping "flous"
							PList.add(pass);
							
						});
					
					}else {
						System.out.println("Infants List is null !!!");
					}
					
					if(model.getStudents()!=null) {
						
						model.getStudents().forEach(i->{
							Passenger pass=new Passenger();
							pass.setTitle(i.getPassengerTitle());
							pass.setFirstName(i.getFirstName());
							pass.setLastName(i.getLastName());
							//type mapping
							//gender mapping
							pass.setPassportNo(i.getPassportNumber());
							pass.setPassportExpiry(i.getExpiryDate());
							//airline
							pass.getNationality().setCountryCode(i.getNationality());
							pass.getCountry().setCountryCode(i.getCountry());
							pass.getMeal().setCode(i.getMealPreference());
							pass.getSeat().setCode(i.getSeatPreference());
							pass.setMobile1(i.getTel());
							pass.setMobile1CountryCode(i.getCountryTel());
							pass.setEmail(i.getMail());
							//isLeadPax mapping
							//fare mapping "flous"
							PList.add(pass);
							
						});
					
					}else {
						System.out.println("Students List is null !!!");
					}
					if(model.getSeniors()!=null) {
						
						model.getSeniors().forEach(i->{
							Passenger pass=new Passenger();
							pass.setTitle(i.getPassengerTitle());
							pass.setFirstName(i.getFirstName());
							pass.setLastName(i.getLastName());
							//type mapping
							//gender mapping
							pass.setPassportNo(i.getPassportNumber());
							pass.setPassportExpiry(i.getExpiryDate());
							//airline
							pass.getNationality().setCountryCode(i.getNationality());
							pass.getCountry().setCountryCode(i.getCountry());
							pass.getMeal().setCode(i.getMealPreference());
							pass.getSeat().setCode(i.getSeatPreference());
							pass.setMobile1(i.getTel());
							pass.setMobile1CountryCode(i.getCountryTel());
							pass.setEmail(i.getMail());
							//isLeadPax mapping
							//fare mapping "flous"
							PList.add(pass);
							
						});
					
					}else {
						System.out.println("Seniors List is null !!!");
					}
					
					if(model.getSeamans()!=null) {
						
						model.getSeamans().forEach(i->{
							Passenger pass=new Passenger();
							pass.setTitle(i.getPassengerTitle());
							pass.setFirstName(i.getFirstName());
							pass.setLastName(i.getLastName());
							//type mapping
							//gender mapping
							pass.setPassportNo(i.getPassportNumber());
							pass.setPassportExpiry(i.getExpiryDate());
							//airline
							pass.getNationality().setCountryCode(i.getNationality());
							pass.getCountry().setCountryCode(i.getCountry());
							pass.getMeal().setCode(i.getMealPreference());
							pass.getSeat().setCode(i.getSeatPreference());
							pass.setMobile1(i.getTel());
							pass.setMobile1CountryCode(i.getCountryTel());
							pass.setEmail(i.getMail());
							//isLeadPax mapping
							//fare mapping "flous"
							PList.add(pass);
							
						});
					
					}else {
						System.out.println("Seamans List is null !!!");
					}
					
					seg.setPassenger(PList);
					
					ArrayList<FareRule> FRList=new ArrayList<>();
					if(model.getFareRules()!=null) {
						model.getFareRules().forEach(f->{
							FareRule fareR=new FareRule();
							fareR.setOrigin(f.getBaggageInfos().get(0).getDeparture());
							fareR.setDestination(f.getBaggageInfos().get(0).getArrival());
							fareR.setAirline(f.getFareRules().get(0).getAirline());
							fareR.setFareBasisCode(f.getFareRules().get(0).getFareBasis());
							fareR.setFareRuleDetail(f.getFareRules().get(0).getRuleDetails().get(0).getRules());
							fareR.setFlightNumber(f.getBaggageInfos().get(0).getFlightNo());
							
							FRList.add(fareR);
						});
					}else {
						System.out.println("Fare Rules List is null !!!");
					}
					
						
					

					
				segList.add(seg);
				});
			});
		}else {
			System.out.println("PricedItinerary is null !!!");
		}
		
		request.getItinerary().setSegments(segList);
		
				
		return request;
	}

	public TripDetailsResponseModel BooknigRS(BookResponse responseGds, FlightBookingModel model) {
		if (responseGds!=null) {
			TripDetailsResponseModel response=new TripDetailsResponseModel();
			List<OriginDestinationOptionModel> originList = new ArrayList<>();
			OriginDestinationOptionModel origin= new OriginDestinationOptionModel();
			//SSRdenied
			//SSRMessage
			//Status
			response.setSuccess(responseGds.isSuccess());
			response.setOfficeIdPnr(responseGds.getpNR());
			
			
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
			
			
			if (responseGds.getItinerary() != null) {
				response.getFlightBooking().getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).setAirlinePnr(responseGds.getpNR());
				response.getFlightBooking().getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).setArrivalAirportLocationCode(responseGds.getItinerary().getDestination());
				response.getFlightBooking().getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).setDepartureAirportLocationCode(responseGds.getItinerary().getOrigin());
				response.getFlightBooking().getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).setMarketingAirlineCode(responseGds.getItinerary().getValidatingAirlineCode());
				if (responseGds.getItinerary().isLcc() == true) {
					response.getFlightBooking().getPricedItinerary().getAirItineraryPricingInfo().setFareType("Basic");
				} else {
					response.getFlightBooking().getPricedItinerary().getAirItineraryPricingInfo().setFareType("GDS");

				}

				if (responseGds.getItinerary().isNonRefundable() == true) {
					response.getFlightBooking().getPricedItinerary().getAirItineraryPricingInfo().setIsRefundable("N");
				} else {
					response.getFlightBooking().getPricedItinerary().getAirItineraryPricingInfo().setIsRefundable("O");

				}
				List<FlightSegmentModel> flightSegments = new ArrayList<>();
				responseGds.getItinerary().getSegments().forEach(s->{
					FlightSegmentModel flightSegment = new FlightSegmentModel();
					flightSegment.setAirlinePnr(s.getAirlinePNR());
					flightSegment.setArrivalAirportLocationCode(s.getDestination().getAirportCode());
					flightSegment.setArrivalAirportLocation(s.getDestination().getAirportName());
					flightSegment.setDepartureAirportLocationCode(s.getOrigin().getAirportCode());
					flightSegment.setDepartureAirportLocation(s.getAirlineName());
					flightSegment.setFlightNumber(s.getFlightNumber());
					flightSegment.setEticket(s.iseTicketEligible());
					flightSegment.setStopQuantity(s.getStops());
					flightSegment.setBaggage(s.getIncludedBaggage());
					flightSegment.setCabinClassCode(s.getBookingClass());
					flightSegment.setCabinClassText(s.getCabinClass());
					flightSegment.setMarketingAirline(s.getAirlineName());
					
					
					SeatsRemainingModel seat =new SeatsRemainingModel();
					seat.setNumber(s.getNoOfSeatAvailable());
					flightSegment.setSeatsRemaining(seat);
					
					OperatingAirlineModel operating=new OperatingAirlineModel();
					operating.setCode(s.getOperatingCarrier());
					flightSegment.setOperatingAirline(operating);
					
					
					List<PassengerFlightBookingModel> passengerList  = new ArrayList<>();
					if(s.getPassenger()!=null) {
						s.getPassenger().forEach(p->{
							PassengerFlightBookingModel passenger = new PassengerFlightBookingModel();
							passenger.setPassengerTitle(p.getTitle());
							passenger.setFirstName(p.getFirstName());
							passenger.setLastName(p.getLastName());
							passenger.setTel(p.getMobile1());
							passenger.setCountryTel(p.getMobile1CountryCode());
							//isLeadPax
							//type
							passenger.setPassportNumber(p.getPassportNo());
							passenger.setMail(p.getEmail());
							//Fare mapping 
							
							
							
							passengerList.add(passenger);
						});
						
						
						
						
						response.getFlightBooking().setAdults(passengerList);					
				
					}else {
						System.out.println("Passenger List is null");
					}
					
					
					List<FareRulesResponseModel> fareRules  = new ArrayList<>();
					if(s.getFareRules()!=null) {
						List<BaggageInfoModel> infoList  = new ArrayList<>();
						List<FareRuleModel> fareRuleMList  = new ArrayList<>();
						List<RuleDetailModel> ruleDetail  = new ArrayList<>();

						s.getFareRules().forEach(f->{
							FareRulesResponseModel fareRule=new FareRulesResponseModel();
							
							BaggageInfoModel info=new BaggageInfoModel();
							info.setDeparture(f.getOrigin());
							info.setArrival(f.getDestination());
							info.setAireline(f.getAirline());
							info.setFlightNo(f.getFlightNumber());
							infoList.add(info);
							
							

							FareRuleModel fRule=new FareRuleModel();
							fRule.setFareBasis(f.getFareBasisCode());
							RuleDetailModel rule=new RuleDetailModel();
							rule.setRules(f.getFareRuleDetail());
							ruleDetail.add(rule);
							fRule.setRuleDetails(ruleDetail);
							
							fareRule.setBaggageInfos(infoList);
							fareRule.setFareRules(fareRuleMList);
							
							fareRules.add(fareRule);
						});
						
					}else {
						System.out.println("FareRules List is null");

					}
					response.getFlightBooking().setFareRules(fareRules);
	
					
					
					flightSegments.add(flightSegment);
				});
				origin.setFlightSegment(flightSegments);
				originList.add(origin);
				response.getFlightBooking().getPricedItinerary().setOriginDestinationOptions(originList);
				
				
					

				
			}else {
				System.out.println("Itinerary is null!!!");
			}
			
			
			
			
			
			
			
			
			
			
			return response;

		}else {
			
			
			System.out.println("GDS response is null !!!");
			return null;
		}
		
		
		
		
	}

	

}
