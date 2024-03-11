package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.BookRequest;
import ws.api.gds.tbo.ms.domain.BookResponse;
import ws.api.gds.tbo.ms.domain.FareQuoteRequest;
import ws.api.gds.tbo.ms.domain.FareQuoteResponse;
import ws.api.gds.tbo.ms.domain.TicketRequest;
import ws.api.gds.tbo.ms.domain.TicketResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapBooking;
import ws.api.gds.tbo.ms.mappingService.ServiceMapTicketed;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.AirRevalidateResponseModel;
import ws.api.gds.tbo.ms.model.BookingRequest;
import ws.api.gds.tbo.ms.model.FlightBookingModel;
import ws.api.gds.tbo.ms.model.TripDetailsResponseModel;

@Service
public class BookingService {
	@Autowired
	ServiceMapBooking serviceMapBooking;
	@Autowired
	ServiceMapTicketed serviceMapTicketed;
	@Autowired
	Microservice<BookRequest, BookResponse> microservice;
	@Autowired
	Microservice<TicketRequest, TicketResponse> microserviceT;

	
	
	public TripDetailsResponseModel booking(FlightBookingModel model) {
		
		//isLcc= False
		if (model.getPricedItinerary().getFareType().equals("GDS")) {
			
			BookRequest request = serviceMapBooking.BookingRQ(model);
			System.out.println(request);
			BookResponse res= new BookResponse();

			BookResponse responseT=microservice.postRequest(request,res,"https://xmloutbookingapi.tboair.com/api/v1/Booking/Book");
			
			if(responseT!=null) {
				TripDetailsResponseModel response= serviceMapBooking.BooknigRS(responseT,model);
				System.out.println(response);
				return response;
			}else {
				return null;

			}
		//isLcc= True
		}else if (model.getPricedItinerary().getFareType().equals("Basic")) {
			
			
			TicketRequest request = serviceMapTicketed.TicketRQ(model);
			System.out.println(request);
			TicketResponse res= new TicketResponse();

			TicketResponse responseT=microserviceT.postRequest(request,res,"https://xmloutbookingapi.tboair.com/api/v1/Booking/Book");
			
			if(responseT!=null) {
				TripDetailsResponseModel response= serviceMapTicketed.TicketRS(responseT,model);
				System.out.println(response);
				return response;
			}else {
				return null;

			}		
			}
		return null;
		
		
		
	}

}
