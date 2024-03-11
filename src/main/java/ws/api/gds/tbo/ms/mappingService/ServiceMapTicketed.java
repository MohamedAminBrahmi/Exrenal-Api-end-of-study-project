package ws.api.gds.tbo.ms.mappingService;

import java.util.ArrayList;

import ws.api.gds.tbo.ms.domain.AirlineDetails;
import ws.api.gds.tbo.ms.domain.Destination;
import ws.api.gds.tbo.ms.domain.FareRule;
import ws.api.gds.tbo.ms.domain.Origin;
import ws.api.gds.tbo.ms.domain.Passenger;
import ws.api.gds.tbo.ms.domain.Segments;
import ws.api.gds.tbo.ms.domain.TicketRequest;
import ws.api.gds.tbo.ms.domain.TicketResponse;
import ws.api.gds.tbo.ms.model.FlightBookingModel;
import ws.api.gds.tbo.ms.model.TripDetailsResponseModel;

public class ServiceMapTicketed {

	public TicketRequest TicketRQ(FlightBookingModel model) {
		TicketRequest request= new TicketRequest();
		request.setiPAddress("182.74.96.82");
		request.setResultId(model.getResultId());
		request.setTokenId(model.getGdsModel().getSessionId());
		request.setTrackingId(model.getTrackingId());
		request.setEndUserBrowserAgent("Mozilla/5.0(Windows NT 6.1");
		request.setpNR(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getAirlinePnr());
		//ConfirmPriceChangeTicket
		request.setUserData("John");
		request.getItinerary().setPointOfSale("ID");
		request.getItinerary().setValidatingAirlineCode(model.getPricedItinerary().getValidatingAirlineCode());
		request.getItinerary().setJourneyType(Integer.parseInt(model.getPricedItinerary().getTicketType()));
		request.getItinerary().setDestination(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getArrivalAirportLocationCode());
		request.getItinerary().setOrigin(model.getPricedItinerary().getOriginDestinationOptions().get(0).getFlightSegment().get(0).getDepartureAirportLocationCode());
		//search Type mapping je n'est pas trouver son equivalent dans model
		//isHoldEligibleForLcc mapping ?
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
				});
				});
		}
		
		request.getItinerary().setSegments(segList);
		
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
		
		request.getItinerary().setPassenger(PList);
		
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
		request.getItinerary().setFareRules(FRList);
			
		

		
		return request;
	}

	public TripDetailsResponseModel TicketRS(TicketResponse responseT, FlightBookingModel model) {
		// TODO Auto-generated method stub
		return null;
	}

}
