package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.FareQuoteRequest;
import ws.api.gds.tbo.ms.domain.FareQuoteResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapFareQuote;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.AirRevalidateResponseModel;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;

@Service
public class FareQuoteService {
	
	@Autowired
	ServiceMapFareQuote serviceMapFareQuote;
	@Autowired
	Microservice<FareQuoteRequest, FareQuoteResponse> microservice;


	public AirRevalidateResponseModel fareQuote(PricedItineraryModel model) {
		
		FareQuoteRequest request = serviceMapFareQuote.FareQuoteRQ(model);
		System.out.println(request);
		FareQuoteResponse res= new FareQuoteResponse();

		FareQuoteResponse responseT=microservice.postRequest(request,res,"https://xmloutapi.tboair.com/api/v1/Detail/FareQuote");
		
		if(responseT!=null) {
			AirRevalidateResponseModel response= serviceMapFareQuote.FareQuoteRS(responseT,model);
			System.out.println(response);
			return response;
		}else {
			return null;

		}
	}


}
