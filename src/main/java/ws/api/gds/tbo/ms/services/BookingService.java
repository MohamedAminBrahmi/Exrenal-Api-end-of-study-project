package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.BookRequest;
import ws.api.gds.tbo.ms.domain.BookResponse;
import ws.api.gds.tbo.ms.domain.FareQuoteRequest;
import ws.api.gds.tbo.ms.domain.FareQuoteResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapBooking;
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
	Microservice<BookRequest, BookResponse> microservice;
	
	
	public TripDetailsResponseModel booking(FlightBookingModel model) {
		if() {
			
		}
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
		
	}

}
