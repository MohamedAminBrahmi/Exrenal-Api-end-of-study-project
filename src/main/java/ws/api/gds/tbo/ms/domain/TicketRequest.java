package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TicketRequest {
	 	@JsonProperty("ResultId") 
	    private String resultId;
	    @JsonProperty("TokenId") 
	    private String tokenId;
	    @JsonProperty("TrackingId") 
	    private String trackingId;
	    @JsonProperty("IPAddress") 
	    private String iPAddress;
	    @JsonProperty("EndUserBrowserAgent") 
	    private String endUserBrowserAgent;
	    @JsonProperty("PointOfSale") 
	    private String pointOfSale;
	    @JsonProperty("RequestOrigin") 
	    private String requestOrigin;
	    @JsonProperty("UserData") 
	    private String userData;
	    @JsonProperty("Itinerary") 
	    private Itinerary itinerary;
	    @JsonProperty("PNR") 
	    private String pNR;
	    @JsonProperty("ConfirmPriceChangeTicket") 
	    private boolean confirmPriceChangeTicket;
	    
	    
		public TicketRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public TicketRequest(String resultId, String tokenId, String trackingId, String iPAddress,
				String endUserBrowserAgent, String pointOfSale, String requestOrigin, String userData,
				Itinerary itinerary, String pNR, boolean confirmPriceChangeTicket) {
			this.resultId = resultId;
			this.tokenId = tokenId;
			this.trackingId = trackingId;
			this.iPAddress = iPAddress;
			this.endUserBrowserAgent = endUserBrowserAgent;
			this.pointOfSale = pointOfSale;
			this.requestOrigin = requestOrigin;
			this.userData = userData;
			this.itinerary = itinerary;
			this.pNR = pNR;
			this.confirmPriceChangeTicket = confirmPriceChangeTicket;
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
		public String getUserData() {
			return userData;
		}
		public void setUserData(String userData) {
			this.userData = userData;
		}
		public Itinerary getItinerary() {
			return itinerary;
		}
		public void setItinerary(Itinerary itinerary) {
			this.itinerary = itinerary;
		}
		public String getpNR() {
			return pNR;
		}
		public void setpNR(String pNR) {
			this.pNR = pNR;
		}
		public boolean isConfirmPriceChangeTicket() {
			return confirmPriceChangeTicket;
		}
		public void setConfirmPriceChangeTicket(boolean confirmPriceChangeTicket) {
			this.confirmPriceChangeTicket = confirmPriceChangeTicket;
		}
		@Override
		public String toString() {
			return "TicketRequest [resultId=" + resultId + ", tokenId=" + tokenId + ", trackingId=" + trackingId
					+ ", iPAddress=" + iPAddress + ", endUserBrowserAgent=" + endUserBrowserAgent + ", pointOfSale="
					+ pointOfSale + ", requestOrigin=" + requestOrigin + ", userData=" + userData + ", itinerary="
					+ itinerary + ", pNR=" + pNR + ", confirmPriceChangeTicket=" + confirmPriceChangeTicket + "]";
		}
	    
	    
	    
	    
	     
	

}
