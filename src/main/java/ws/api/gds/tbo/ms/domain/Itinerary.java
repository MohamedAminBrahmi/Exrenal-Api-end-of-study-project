package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Itinerary {
	public enum SearchType {OneWay,Return,MultiCity};

	@JsonProperty("IsHoldEligibleForLcc") 
    private boolean isHoldEligibleForLcc;
    @JsonProperty("Segments") 
    private ArrayList<Segments> segments;
    @JsonProperty("Passenger") 
    private ArrayList<Passenger> passenger;
    @JsonProperty("FareRules") 
    private ArrayList<FareRule> fareRules;
    @JsonProperty("ValidatingAirlineCode") 
    private String validatingAirlineCode;
    @JsonProperty("ResponseTime") 
    private String responseTime;
    @JsonProperty("JourneyType") 
    private int journeyType;
    @JsonProperty("Destination") 
    private String destination;
    @JsonProperty("Origin") 
    private String origin;
    @JsonProperty("LastTicketDate") 
    private String lastTicketDate;
    @JsonProperty("TravelDate") 
    private String travelDate;
    @JsonProperty("CreatedOn") 
    private String createdOn;
    @JsonProperty("SearchType") 
    private SearchType searchType;
    @JsonProperty("NonRefundable") 
    private boolean nonRefundable;
    @JsonProperty("AgentRefNo") 
    private Object agentRefNo;
    @JsonProperty("IsDomestic") 
    private boolean isDomestic;
    @JsonProperty("IsLcc") 
    private boolean isLcc;
    @JsonProperty("AirlineRemark") 
    private String airlineRemark;
    @JsonProperty("EarnedLoyaltyPoints") 
    private String earnedLoyaltyPoints;
    @JsonProperty("StaffRemarks") 
    private String staffRemarks;
    @JsonProperty("PointOfSale") 
    private String pointOfSale;
    @JsonProperty("RequestOrigin") 
    private String requestOrigin;
    @JsonProperty("EndUserBrowserAgent") 
    private String endUserBrowserAgent;
    @JsonProperty("UserData") 
    private String userData;
    
    
    
    @JsonProperty("Ticketed") 
    private boolean ticketed;
    @JsonProperty("AirlineCode") 
    private Object airlineCode;
    @JsonProperty("PNR") 
    private String pNR;
    
    
    
	public Itinerary() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Itinerary(boolean isHoldEligibleForLcc, ArrayList<Segments> segments, String validatingAirlineCode,
			String responseTime, int journeyType, String destination, String origin, String lastTicketDate,
			String travelDate, String createdOn, SearchType searchType, boolean nonRefundable, Object agentRefNo,
			boolean isDomestic, boolean isLcc, String airlineRemark, String earnedLoyaltyPoints, String staffRemarks,
			String pointOfSale, String requestOrigin, String endUserBrowserAgent, String userData) {
		this.isHoldEligibleForLcc = isHoldEligibleForLcc;
		this.segments = segments;
		this.validatingAirlineCode = validatingAirlineCode;
		this.responseTime = responseTime;
		this.journeyType = journeyType;
		this.destination = destination;
		this.origin = origin;
		this.lastTicketDate = lastTicketDate;
		this.travelDate = travelDate;
		this.createdOn = createdOn;
		this.searchType = searchType;
		this.nonRefundable = nonRefundable;
		this.agentRefNo = agentRefNo;
		this.isDomestic = isDomestic;
		this.isLcc = isLcc;
		this.airlineRemark = airlineRemark;
		this.earnedLoyaltyPoints = earnedLoyaltyPoints;
		this.staffRemarks = staffRemarks;
		this.pointOfSale = pointOfSale;
		this.requestOrigin = requestOrigin;
		this.endUserBrowserAgent = endUserBrowserAgent;
		this.userData = userData;
	}


	public boolean isHoldEligibleForLcc() {
		return isHoldEligibleForLcc;
	}


	public void setHoldEligibleForLcc(boolean isHoldEligibleForLcc) {
		this.isHoldEligibleForLcc = isHoldEligibleForLcc;
	}


	public ArrayList<Segments> getSegments() {
		return segments;
	}


	public void setSegments(ArrayList<Segments> segments) {
		this.segments = segments;
	}


	public String getValidatingAirlineCode() {
		return validatingAirlineCode;
	}


	public void setValidatingAirlineCode(String validatingAirlineCode) {
		this.validatingAirlineCode = validatingAirlineCode;
	}


	public String getResponseTime() {
		return responseTime;
	}


	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}


	public int getJourneyType() {
		return journeyType;
	}


	public void setJourneyType(int journeyType) {
		this.journeyType = journeyType;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getLastTicketDate() {
		return lastTicketDate;
	}


	public void setLastTicketDate(String lastTicketDate) {
		this.lastTicketDate = lastTicketDate;
	}


	public String getTravelDate() {
		return travelDate;
	}


	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}


	public String getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}


	public SearchType getSearchType() {
		return searchType;
	}


	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}


	public boolean isNonRefundable() {
		return nonRefundable;
	}


	public void setNonRefundable(boolean nonRefundable) {
		this.nonRefundable = nonRefundable;
	}


	public Object getAgentRefNo() {
		return agentRefNo;
	}


	public void setAgentRefNo(Object agentRefNo) {
		this.agentRefNo = agentRefNo;
	}


	public boolean isDomestic() {
		return isDomestic;
	}


	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}


	public boolean isLcc() {
		return isLcc;
	}


	public void setLcc(boolean isLcc) {
		this.isLcc = isLcc;
	}


	public String getAirlineRemark() {
		return airlineRemark;
	}


	public void setAirlineRemark(String airlineRemark) {
		this.airlineRemark = airlineRemark;
	}


	public String getEarnedLoyaltyPoints() {
		return earnedLoyaltyPoints;
	}


	public void setEarnedLoyaltyPoints(String earnedLoyaltyPoints) {
		this.earnedLoyaltyPoints = earnedLoyaltyPoints;
	}


	public String getStaffRemarks() {
		return staffRemarks;
	}


	public void setStaffRemarks(String staffRemarks) {
		this.staffRemarks = staffRemarks;
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


	public String getEndUserBrowserAgent() {
		return endUserBrowserAgent;
	}


	public void setEndUserBrowserAgent(String endUserBrowserAgent) {
		this.endUserBrowserAgent = endUserBrowserAgent;
	}


	public String getUserData() {
		return userData;
	}


	public void setUserData(String userData) {
		this.userData = userData;
	}
	
	

	public ArrayList<Passenger> getPassenger() {
		return passenger;
	}


	public void setPassenger(ArrayList<Passenger> passenger) {
		this.passenger = passenger;
	}


	public ArrayList<FareRule> getFareRules() {
		return fareRules;
	}


	public void setFareRules(ArrayList<FareRule> fareRules) {
		this.fareRules = fareRules;
	}


	public boolean isTicketed() {
		return ticketed;
	}


	public void setTicketed(boolean ticketed) {
		this.ticketed = ticketed;
	}


	public Object getAirlineCode() {
		return airlineCode;
	}


	public void setAirlineCode(Object airlineCode) {
		this.airlineCode = airlineCode;
	}


	public String getpNR() {
		return pNR;
	}


	public void setpNR(String pNR) {
		this.pNR = pNR;
	}


	@Override
	public String toString() {
		return "Itinerary [isHoldEligibleForLcc=" + isHoldEligibleForLcc + ", segments=" + segments
				+ ", validatingAirlineCode=" + validatingAirlineCode + ", responseTime=" + responseTime
				+ ", journeyType=" + journeyType + ", destination=" + destination + ", origin=" + origin
				+ ", lastTicketDate=" + lastTicketDate + ", travelDate=" + travelDate + ", createdOn=" + createdOn
				+ ", searchType=" + searchType + ", nonRefundable=" + nonRefundable + ", agentRefNo=" + agentRefNo
				+ ", isDomestic=" + isDomestic + ", isLcc=" + isLcc + ", airlineRemark=" + airlineRemark
				+ ", earnedLoyaltyPoints=" + earnedLoyaltyPoints + ", staffRemarks=" + staffRemarks + ", pointOfSale="
				+ pointOfSale + ", requestOrigin=" + requestOrigin + ", endUserBrowserAgent=" + endUserBrowserAgent
				+ ", userData=" + userData + "]";
	}


    

}
