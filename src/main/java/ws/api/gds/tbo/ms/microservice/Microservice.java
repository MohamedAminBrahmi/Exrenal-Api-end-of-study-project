package ws.api.gds.tbo.ms.microservice;

public interface Microservice<Q,R>{
	public R getRequest(Q request,R response,String url);
	public R postRequest(Q request,R response,String url);


}
