package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SSRRequest {
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
	    private Object userData;
	    
		public SSRRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SSRRequest(String resultId, String tokenId, String trackingId, String iPAddress,
				String endUserBrowserAgent, String pointOfSale, String requestOrigin, Object userData) {
			this.resultId = resultId;
			this.tokenId = tokenId;
			this.trackingId = trackingId;
			this.iPAddress = iPAddress;
			this.endUserBrowserAgent = endUserBrowserAgent;
			this.pointOfSale = pointOfSale;
			this.requestOrigin = requestOrigin;
			this.userData = userData;
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
		public Object getUserData() {
			return userData;
		}
		public void setUserData(Object userData) {
			this.userData = userData;
		}
		@Override
		public String toString() {
			return "SSRRequest [resultId=" + resultId + ", tokenId=" + tokenId + ", trackingId=" + trackingId
					+ ", iPAddress=" + iPAddress + ", endUserBrowserAgent=" + endUserBrowserAgent + ", pointOfSale="
					+ pointOfSale + ", requestOrigin=" + requestOrigin + ", userData=" + userData + "]";
		}
	    
	    
	    
	    

}
