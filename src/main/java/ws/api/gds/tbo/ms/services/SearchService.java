package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.SearchRequest;
import ws.api.gds.tbo.ms.domain.SearchResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapSearch;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.AirLowFareSearchResultModel;
import ws.api.gds.tbo.ms.model.FlightSearchModel;

@Service
public class SearchService {
	
	@Autowired
	ServiceMapSearch serviceMapSearch;
	@Autowired
	Microservice<SearchRequest, SearchResponse> microservice;
	
	public AirLowFareSearchResultModel search(FlightSearchModel model) {
		
		SearchRequest request = serviceMapSearch.SearchRQ(model);
		System.out.println(request);
		SearchResponse res= new SearchResponse();

		SearchResponse responseT=microservice.postRequest(request,res,"https://xmloutapi.tboair.com/api/v1/Search/Search");
		AirLowFareSearchResultModel response= serviceMapSearch.SearchRS(responseT,model);
		System.out.println(response);


		


		
		return response;
	}

}
