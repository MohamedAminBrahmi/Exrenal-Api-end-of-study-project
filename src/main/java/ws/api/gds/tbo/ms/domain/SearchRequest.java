package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRequest {
	
	public enum JourneyType {OneWay,Return,MultiCity};
	public enum FlightCabinClass {AllClass,Economy,PremiumEconomy,Business,PremiumBusiness,First};

	@JsonProperty("IPAddress")
	private String iPAddress;
    @JsonProperty("TokenId") 
    private String tokenId;
    @JsonProperty("EndUserBrowserAgent")
    private String endUserBrowserAgent;
    @JsonProperty("PointOfSale")
    private String pointOfSale;
    @JsonProperty("RequestOrigin")
    private String requestOrigin;
    @JsonProperty("UserData")
    private Object userData;
    @JsonProperty("JourneyType") 
    private JourneyType journeyType;
    @JsonProperty("AdultCount")
    private int adultCount;
    @JsonProperty("ChildCount")
    private int childCount;
    @JsonProperty("InfantCount")
    private int infantCount;
    @JsonProperty("FlightCabinClass")
    private FlightCabinClass flightCabinClass;
    @JsonProperty("Segment") 
    private ArrayList<Segment> segment; 
    @JsonProperty("PreferredAirlines") 
    public ArrayList<Object> preferredAirlines;
    
    
	public SearchRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SearchRequest(String iPAddress, String tokenId, String endUserBrowserAgent, String pointOfSale,
			String requestOrigin, Object userData, JourneyType journeyType, int adultCount, int childCount,
			int infantCount, FlightCabinClass flightCabinClass, ArrayList<Segment> segment,
			ArrayList<Object> preferredAirlines) {
		this.iPAddress = iPAddress;
		this.tokenId = tokenId;
		this.endUserBrowserAgent = endUserBrowserAgent;
		this.pointOfSale = pointOfSale;
		this.requestOrigin = requestOrigin;
		this.userData = userData;
		this.journeyType = journeyType;
		this.adultCount = adultCount;
		this.childCount = childCount;
		this.infantCount = infantCount;
		this.flightCabinClass = flightCabinClass;
		this.segment = segment;
		this.preferredAirlines = preferredAirlines;
	}


	public String getiPAddress() {
		return iPAddress;
	}
	public void setiPAddress(String iPAddress) {
		this.iPAddress = iPAddress;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
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
	
	public JourneyType getJourneyType() {
		return journeyType;
	}
	public void setJourneyType(JourneyType journeyType) {
		this.journeyType = journeyType;
	}
	public int getAdultCount() {
		return adultCount;
	}
	public void setAdultCount(int adultCount) {
		this.adultCount = adultCount;
	}
	public int getChildCount() {
		return childCount;
	}
	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}
	public int getInfantCount() {
		return infantCount;
	}
	public void setInfantCount(int infantCount) {
		this.infantCount = infantCount;
	}
	
	public FlightCabinClass getFlightCabinClass() {
		return flightCabinClass;
	}
	public void setFlightCabinClass(FlightCabinClass flightCabinClass) {
		this.flightCabinClass = flightCabinClass;
	}
	public ArrayList<Segment> getSegment() {
		return segment;
	}
	public void setSegment(ArrayList<Segment> segment) {
		this.segment = segment;
	}


	public ArrayList<Object> getPreferredAirlines() {
		return preferredAirlines;
	}


	public void setPreferredAirlines(ArrayList<Object> preferredAirlines) {
		this.preferredAirlines = preferredAirlines;
	}


	@Override
	public String toString() {
		return "SearchRequest [iPAddress=" + iPAddress + ", tokenId=" + tokenId + ", endUserBrowserAgent="
				+ endUserBrowserAgent + ", pointOfSale=" + pointOfSale + ", requestOrigin=" + requestOrigin
				+ ", userData=" + userData + ", journeyType=" + journeyType + ", adultCount=" + adultCount
				+ ", childCount=" + childCount + ", infantCount=" + infantCount + ", flightCabinClass="
				+ flightCabinClass + ", segment=" + segment + ", preferredAirlines=" + preferredAirlines + "]";
	}
	
	
	
	
    
    

}
