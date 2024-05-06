package ws.api.gds.tbo.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.AuthenticationRequest;
import ws.api.gds.tbo.ms.domain.AuthenticationResponse;
import ws.api.gds.tbo.ms.mappingService.ServiceMapAuth;
import ws.api.gds.tbo.ms.microservice.Microservice;
import ws.api.gds.tbo.ms.model.GdsSessionModel;


@Service
public class AuthenticationService {

	@Autowired
	ServiceMapAuth serviceMapAuth;
	@Autowired
	Microservice<AuthenticationRequest, AuthenticationResponse> microservice;

	public String getToken(GdsSessionModel gds) {
		AuthenticationRequest request = serviceMapAuth.TokenRQ(gds);
		AuthenticationResponse response = new AuthenticationResponse();

		AuthenticationResponse responseT = microservice.postRequest(request, response,
				gds.getUrl() + "/api/v1/Authenticate/ValidateAgency");
		
		if(responseT!=null) {
			String token = serviceMapAuth.TokenRS(responseT);

		return token;
		}else {
			return null;

		}
	}

}
