package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookRequest {
	
	@JsonProperty("ResultId") 
	private String resultId;
    @JsonProperty("TokenId") 
    private String tokenId;
    @JsonProperty("TrackingId") 
    private String trackingId;
    @JsonProperty("IPAddress") 
    private String iPAddress;
    @JsonProperty("Itinerary") 
    private Itinerary itinerary;
	public BookRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookRequest(String resultId, String tokenId, String trackingId, String iPAddress, Itinerary itinerary) {
		this.resultId = resultId;
		this.tokenId = tokenId;
		this.trackingId = trackingId;
		this.iPAddress = iPAddress;
		this.itinerary = itinerary;
	}
	public String getResultId() {
		return resultId;
	}
	public void setResultId(String resultId) {
		this.resultId = resultId;
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
	public String getiPAddress() {
		return iPAddress;
	}
	public void setiPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}
	public Itinerary getItinerary() {
		return itinerary;
	}
	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	@Override
	public String toString() {
		return "BookRequest [resultId=" + resultId + ", tokenId=" + tokenId + ", trackingId=" + trackingId
				+ ", iPAddress=" + iPAddress + ", itinerary=" + itinerary + "]";
	}
    
    
    

}
