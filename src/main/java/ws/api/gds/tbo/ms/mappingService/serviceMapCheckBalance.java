package ws.api.gds.tbo.ms.mappingService;

import org.springframework.stereotype.Service;

import ws.api.gds.tbo.ms.domain.AuthenticationResponse;
import ws.api.gds.tbo.ms.domain.CheckBalanceRequest;
import ws.api.gds.tbo.ms.model.GdsSessionModel;

@Service
public class serviceMapCheckBalance {
	public CheckBalanceRequest CheckRQ(GdsSessionModel gds) {
		
		try {
			
			CheckBalanceRequest request= new CheckBalanceRequest();
			request.setTokenId(gds.getSessionId());
			System.out.println(request);
			
			return request;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		}
	
	
	public String CheckRS(AuthenticationResponse response) {
		String result ;
		if(response != null) {
			if (response.isSuccess()==false) {
				if (response.getErrors() != null) {
					result =response.getErrors().get(0).getErrorMessage();
					return result;
					}else {
						return  "the error list is Null !! ";
					}
				
			}else {
				result = String.valueOf(response.getAgency().getTotalAailableLimit())+" "+response.getAgency().getCurrency();
		    return result;
		}
		
	}
		return  "the response is Null !! ";
	}

}
