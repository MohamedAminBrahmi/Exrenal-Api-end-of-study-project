package ws.api.gds.tbo.ms.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.FareQuoteRequest;
import ws.api.gds.tbo.ms.domain.FareQuoteResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapFareQuote;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.AirRevalidateResponseModel;
import ws.api.gds.tbo.ms.model.CommisionModelResponse;
import ws.api.gds.tbo.ms.model.CommisionRequest;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;
import ws.api.gds.tbo.ms.openfeign.util.FeignCommissionCalculatorUtil;

@Service
public class FareQuoteService {
	
	@Autowired
	ServiceMapFareQuote serviceMapFareQuote;
	@Autowired
	Microservice<FareQuoteRequest, FareQuoteResponse> microservice;
	@Autowired
	FeignCommissionCalculatorUtil feignCommissionCalculatorUtil;


	public AirRevalidateResponseModel fareQuote(PricedItineraryModel model) throws IOException {
		
		FareQuoteRequest request = serviceMapFareQuote.FareQuoteRQ(model);
		System.out.println(request);
		FareQuoteResponse res= new FareQuoteResponse();

		FareQuoteResponse responseT=microservice.postRequest(request,res,"https://xmloutapi.tboair.com/api/v1/Detail/FareQuote");
		
		if(responseT!=null) {
			AirRevalidateResponseModel response= serviceMapFareQuote.FareQuoteRS(responseT,model);
			System.out.println(response);
			CommisionRequest commisionRequest = new CommisionRequest();
			

			commisionRequest.setGds(model.getGdsModel());
			commisionRequest.setPricedItineraries(response.getPricedItineraries());
			CommisionModelResponse result = feignCommissionCalculatorUtil.commissionCalculator(commisionRequest);
			response.setPricedItineraries(result.getPricedItineraries());
	
			return response;
		}else {
			return null;

		}
	}


}
