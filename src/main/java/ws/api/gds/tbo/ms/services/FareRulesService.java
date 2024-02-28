package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.FareRulesRequest;
import ws.api.gds.tbo.ms.domain.FareRulesResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapFareRules;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.FareRulesResponseModel;
import ws.api.gds.tbo.ms.model.PricedItineraryModel;


@Service
public class FareRulesService {
	
	
	@Autowired
	ServiceMapFareRules serviceMapFareRules;
	@Autowired
	Microservice<FareRulesRequest, FareRulesResponse> microservice;

	public FareRulesResponseModel fareRules(PricedItineraryModel model) {
		
			
		FareRulesRequest request = serviceMapFareRules.FareRulesRQ(model);
			System.out.println(request);
			FareRulesResponse res= new FareRulesResponse();
			FareRulesResponse responseT=microservice.postRequest(request,res,"https://xmloutapi.tboair.com/api/v1/Detail/FareRule");
	
			if(responseT!=null) {
				FareRulesResponseModel response= serviceMapFareRules.FareRulesRS(responseT,model);
				System.out.println(response);
				return response;
			}else {
				return null;

			}
	}

}
