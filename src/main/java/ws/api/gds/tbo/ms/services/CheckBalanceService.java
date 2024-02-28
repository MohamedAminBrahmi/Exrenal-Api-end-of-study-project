package ws.api.gds.tbo.ms.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.AuthenticationResponse;
import ws.api.gds.tbo.ms.domain.CheckBalanceRequest;
import ws.api.gds.tbo.ms.mappingService.serviceMapCheckBalance;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.GdsSessionModel;

@Service
public class CheckBalanceService {
	@Autowired
	serviceMapCheckBalance serviceMapCheck;
	@Autowired
	Microservice<CheckBalanceRequest, AuthenticationResponse> microservice;
	
	public String getBalance(GdsSessionModel gds) {
		CheckBalanceRequest request = serviceMapCheck.CheckRQ(gds);
		AuthenticationResponse response=new AuthenticationResponse();

		AuthenticationResponse responseT=microservice.postRequest(request,response,"https://xmloutapi.tboair.com/API/V1//Wallet/GetAvailableBalance");
		
			
			if(responseT!=null) {
				String result = serviceMapCheck.CheckRS(responseT);
			return result;
			}else {
				return null;

			}
		}

}
