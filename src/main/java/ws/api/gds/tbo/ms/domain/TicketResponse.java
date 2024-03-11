package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketResponse {
	
	@JsonProperty("PNR") 
	private String pNR;
    @JsonProperty("Status") 
    private int status;
    @JsonProperty("ChangeInItinerary") 
    private Object changeInItinerary;
    @JsonProperty("Itinerary") 
    private Itinerary itinerary;
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
    
	public TicketResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketResponse(String pNR, int status, Object changeInItinerary, Itinerary itinerary, boolean isSuccess,
			ArrayList<Error> errors, ArrayList<Object> alerts, String tokenId, String trackingId) {
		this.pNR = pNR;
		this.status = status;
		this.changeInItinerary = changeInItinerary;
		this.itinerary = itinerary;
		this.isSuccess = isSuccess;
		this.errors = errors;
		this.alerts = alerts;
		this.tokenId = tokenId;
		this.trackingId = trackingId;
	}
	public String getpNR() {
		return pNR;
	}
	public void setpNR(String pNR) {
		this.pNR = pNR;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getChangeInItinerary() {
		return changeInItinerary;
	}
	public void setChangeInItinerary(Object changeInItinerary) {
		this.changeInItinerary = changeInItinerary;
	}
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
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
		return "TicketResponse [pNR=" + pNR + ", status=" + status + ", changeInItinerary=" + changeInItinerary
				+ ", itinerary=" + itinerary + ", isSuccess=" + isSuccess + ", errors=" + errors + ", alerts=" + alerts
				+ ", tokenId=" + tokenId + ", trackingId=" + trackingId + "]";
	}
    
    
    

}
