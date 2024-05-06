package ws.api.gds.tbo.ms.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ws.api.gds.tbo.ms.domain.SearchRequest;
import ws.api.gds.tbo.ms.domain.SearchResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapSearch;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.AirLowFareSearchResultModel;
import ws.api.gds.tbo.ms.model.CommisionModelResponse;
import ws.api.gds.tbo.ms.model.CommisionRequest;
import ws.api.gds.tbo.ms.model.FlightSearchModel;
import ws.api.gds.tbo.ms.openfeign.util.FeignCommissionCalculatorUtil;

@Service
public class SearchService {

	@Autowired
	ServiceMapSearch serviceMapSearch;
	@Autowired
	Microservice<SearchRequest, SearchResponse> microservice;
	@Autowired
	FeignCommissionCalculatorUtil feignCommissionCalculatorUtil;

	public AirLowFareSearchResultModel search(FlightSearchModel model) throws IOException {

		SearchRequest request = serviceMapSearch.SearchRQ(model);
		System.out.println(request);
		SearchResponse res = new SearchResponse();

		SearchResponse responseT = microservice.postRequest(request, res,model.getGdsModel().getUrl()+"/api/v1/Search/Search");
		if(responseT!=null) {
			AirLowFareSearchResultModel response = serviceMapSearch.SearchRS(responseT, model);
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
