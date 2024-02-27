package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticationResponse {
	 
	@JsonProperty("Agency")
	private Agency agency;
	@JsonProperty("IsSuccess")
    private boolean isSuccess;
	@JsonProperty("Errors")
    private ArrayList<Error> errors;
	@JsonProperty("Alerts")
    private ArrayList<Object> alerts;
	@JsonProperty("TokenId")
    private String tokenId;
	@JsonProperty("TrackingId")
    private String trackingId;
    
	
	public AuthenticationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public AuthenticationResponse(Agency agency, boolean isSuccess, ArrayList<Error> errors, ArrayList<Object> alerts,
			String tokenId, String trackingId) {
		super();
		this.agency = agency;
		this.isSuccess = isSuccess;
		this.errors = errors;
		this.alerts = alerts;
		this.tokenId = tokenId;
		this.trackingId = trackingId;
	}




	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}

	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public ArrayList<Error> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}
	public ArrayList<Object> getAlerts() {
		return alerts;
	}
	public void setAlerts(ArrayList<Object> alerts) {
		this.alerts = alerts;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public Object getTrackingId() {
		return trackingId;
	}
	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	@Override
	public String toString() {
		return "AuthenticationResponse [agency=" + agency + ", isSuccess=" + isSuccess + ", errors=" + errors
				+ ", alerts=" + alerts + ", tokenId=" + tokenId + ", trackingId=" + trackingId + "]";
	}
	
    
	

}
