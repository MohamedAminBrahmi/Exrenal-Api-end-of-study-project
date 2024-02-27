package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareQuoteRequest {
	@JsonProperty("IPAddress")
	private String iPAddress;
	@JsonProperty("EndUserBrowserAgent") 
	private String endUserBrowserAgent;
    @JsonProperty("PointOfSale") 
    private String pointOfSale;
    @JsonProperty("RequestOrigin") 
    private String requestOrigin;
    @JsonProperty("ResultId") 
    private String resultId;
    @JsonProperty("TokenId") 
    private String tokenId;
    @JsonProperty("TrackingId") 
    private String trackingId;
    
	public FareQuoteRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FareQuoteRequest(String iPAddress, String endUserBrowserAgent, String pointOfSale, String requestOrigin,
			String resultId, String tokenId, String trackingId) {
		super();
		this.iPAddress = iPAddress;
		this.endUserBrowserAgent = endUserBrowserAgent;
		this.pointOfSale = pointOfSale;
		this.requestOrigin = requestOrigin;
		this.resultId = resultId;
		this.tokenId = tokenId;
		this.trackingId = trackingId;
	}
	public String getEndUserBrowserAgent() {
		return endUserBrowserAgent;
	}
	public void setEndUserBrowserAgent(String endUserBrowserAgent) {
		this.endUserBrowserAgent = endUserBrowserAgent;
	}
	public String getPointOfSale() {
		return pointOfSale;
	}
	public void setPointOfSale(String pointOfSale) {
		this.pointOfSale = pointOfSale;
	}
	public String getRequestOrigin() {
		return requestOrigin;
	}
	public void setRequestOrigin(String requestOrigin) {
		this.requestOrigin = requestOrigin;
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
	public String getIPAddress() {
		return iPAddress;
	}
	public void setIPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}
	@Override
	public String toString() {
		return "FaireQuoteRequest [IPAddress=" + iPAddress + ", endUserBrowserAgent=" + endUserBrowserAgent
				+ ", pointOfSale=" + pointOfSale + ", requestOrigin=" + requestOrigin + ", resultId=" + resultId
				+ ", tokenId=" + tokenId + ", trackingId=" + trackingId + "]";
	}
	
    
    

}
