package ws.api.gds.tbo.ms.mappingService;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.AuthenticationRequest;
import ws.api.gds.tbo.ms.domain.AuthenticationResponse;
import ws.api.gds.tbo.ms.model.GdsSessionModel;

@Service
public class ServiceMapAuth {
	public AuthenticationRequest TokenRQ(GdsSessionModel gds) {

		try {

			AuthenticationRequest request = new AuthenticationRequest();
			request.setUserName(gds.getLogin());
			request.setPassword(gds.getPassword());
			request.setBookingMode("API");
			request.setiPAddress("192.16910. 22");
			System.out.println(request);

			return request;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public String TokenRS(AuthenticationResponse response) {
		String result;
		if (response != null) {
			if (response.isSuccess() == false) {
				if (response.getErrors() != null) {
					result = response.getErrors().get(0).getErrorMessage();
					return result;
				} else {
					return "the error list is Null !! ";
				}

			} else {
				result = response.getTokenId();
				return result;
			}

		}
		return "the response is Null !! ";
	}

}
