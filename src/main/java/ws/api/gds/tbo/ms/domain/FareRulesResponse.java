package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareRulesResponse {
	 	@JsonProperty("FareRules") 
	 	private ArrayList<ArrayList<FareRule>> fareRules ;
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
    
	public FareRulesResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FareRulesResponse(ArrayList<ArrayList<FareRule>> fareRules, boolean isSuccess, ArrayList<Error> errors,
			ArrayList<Object> alerts, String tokenId, String trackingId) {
		this.fareRules = fareRules;
		this.isSuccess = isSuccess;
		this.errors = errors;
		this.alerts = alerts;
		this.tokenId = tokenId;
		this.trackingId = trackingId;
	}

	public ArrayList<ArrayList<FareRule>> getFareRules() {
		return fareRules;
	}

	public void setFareRules(ArrayList<ArrayList<FareRule>> fareRules) {
		this.fareRules = fareRules;
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

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	@Override
	public String toString() {
		return "FareRulesResponse [fareRules=" + fareRules + ", isSuccess=" + isSuccess + ", errors=" + errors
				+ ", alerts=" + alerts + ", tokenId=" + tokenId + ", trackingId=" + trackingId + "]";
	}
	
	
    

}
