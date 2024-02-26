package ws.api.gds.tbo.ms.microservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MicroserviceImpl<Q, R> implements Microservice<Q, R> {

	@Autowired
	RestTemplate restTemplate;

	@Override
	public R postRequest(Q request, R response, String url) {
		try {
			return (R) restTemplate.postForEntity(url, request, response.getClass()).getBody();			
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public R getRequest(Q request, R response, String url) {
		try {
		return (R) restTemplate.getForEntity(url, response.getClass()).getBody();
		} catch (Exception e) {
			return null;
		}
	}
}
