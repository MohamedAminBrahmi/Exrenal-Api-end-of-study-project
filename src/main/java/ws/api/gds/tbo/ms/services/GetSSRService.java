package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.SSRRequest;
import ws.api.gds.tbo.ms.domain.SSR_LCC_Response;
import ws.api.gds.tbo.ms.domain.SSR_NO_LCC_Response;
import ws.api.gds.tbo.ms.mappingService.ServiceMapGetSSR;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.AvailabilitySSRsRequest;

@Service
public class GetSSRService {

	@Autowired
	ServiceMapGetSSR serviceMapGetSSR;
	@Autowired
	Microservice<SSRRequest, SSR_LCC_Response> lccMicroservice;

	@Autowired
	Microservice<SSRRequest, SSR_NO_LCC_Response> noLccMicroservice;

	public Object getSSR(AvailabilitySSRsRequest model) {

		SSRRequest request = serviceMapGetSSR.SSR_RQ(model);
		System.out.println(request);
		SSR_LCC_Response lccRes = new SSR_LCC_Response();
		SSR_NO_LCC_Response noLccRes = new SSR_NO_LCC_Response();

		SSR_LCC_Response responseLcc = lccMicroservice.postRequest(request, lccRes,
				"https://xmloutapi.tboair.com/api/v1/Detail/GetSSR");
		SSR_NO_LCC_Response responseNoLcc = noLccMicroservice.postRequest(request, noLccRes,
				"https://xmloutapi.tboair.com/api/v1/Detail/GetSSR");
		System.out.println(responseLcc);
		System.out.println(responseNoLcc);

		if (responseLcc.isSuccess()) {
			return responseLcc;
		} else if (responseNoLcc.isSuccess()) {
			return responseNoLcc;
		}
		return "the fare types is null !!!!!!";

	}

}
