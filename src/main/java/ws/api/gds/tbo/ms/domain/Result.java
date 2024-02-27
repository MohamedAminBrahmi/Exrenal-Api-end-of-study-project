package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
	@JsonProperty("ResultId") 
	private String resultId;
    @JsonProperty("Origin") 
    private String origin;
    @JsonProperty("Destination") 
    private String destination;
    @JsonProperty("IsLcc") 
    private boolean isLcc;
    @JsonProperty("NonRefundable") 
    private boolean nonRefundable;
    @JsonProperty("AirlineRemark") 
    private String airlineRemark;
    @JsonProperty("Fare") 
    private Fare fare;
    @JsonProperty("FareBreakdown") 
    private ArrayList<FareBreakdown> fareBreakdown;
    @JsonProperty("LastTicketDate") 
    private Object lastTicketDate;
    @JsonProperty("TicketAdvisory") 
    private Object ticketAdvisory;
    @JsonProperty("Segments") 
    private ArrayList<ArrayList<Segments>> segments;
    @JsonProperty("FareRules") 
    private ArrayList<FareRule> fareRules;
    @JsonProperty("ValidatingAirline") 
    private String validatingAirline;
    @JsonProperty("TripIndicator") 
    private int tripIndicator;
    @JsonProperty("ResponseTime") 
    private Date responseTime;
    @JsonProperty("JourneyType") 
    private int journeyType;
    
    
    
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Result(String resultId, String origin, String destination, boolean isLcc, boolean nonRefundable,
			String airlineRemark, Fare fare, ArrayList<FareBreakdown> fareBreakdown, Object lastTicketDate,
			Object ticketAdvisory, ArrayList<ArrayList<Segments>> segments, ArrayList<FareRule> fareRules,
			String validatingAirline, int tripIndicator, Date responseTime, int journeyType) {
		this.resultId = resultId;
		this.origin = origin;
		this.destination = destination;
		this.isLcc = isLcc;
		this.nonRefundable = nonRefundable;
		this.airlineRemark = airlineRemark;
		this.fare = fare;
		this.fareBreakdown = fareBreakdown;
		this.lastTicketDate = lastTicketDate;
		this.ticketAdvisory = ticketAdvisory;
		this.segments = segments;
		this.fareRules = fareRules;
		this.validatingAirline = validatingAirline;
		this.tripIndicator = tripIndicator;
		this.responseTime = responseTime;
		this.journeyType = journeyType;
	}



	public String getResultId() {
		return resultId;
	}



	public void setResultId(String resultId) {
		this.resultId = resultId;
	}



	public String getOrigin() {
		return origin;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public boolean isLcc() {
		return isLcc;
	}



	public void setLcc(boolean isLcc) {
		this.isLcc = isLcc;
	}



	public boolean isNonRefundable() {
		return nonRefundable;
	}



	public void setNonRefundable(boolean nonRefundable) {
		this.nonRefundable = nonRefundable;
	}



	public String getAirlineRemark() {
		return airlineRemark;
	}



	public void setAirlineRemark(String airlineRemark) {
		this.airlineRemark = airlineRemark;
	}



	public Fare getFare() {
		return fare;
	}



	public void setFare(Fare fare) {
		this.fare = fare;
	}



	public ArrayList<FareBreakdown> getFareBreakdown() {
		return fareBreakdown;
	}



	public void setFareBreakdown(ArrayList<FareBreakdown> fareBreakdown) {
		this.fareBreakdown = fareBreakdown;
	}



	public Object getLastTicketDate() {
		return lastTicketDate;
	}



	public void setLastTicketDate(Object lastTicketDate) {
		this.lastTicketDate = lastTicketDate;
	}



	public Object getTicketAdvisory() {
		return ticketAdvisory;
	}



	public void setTicketAdvisory(Object ticketAdvisory) {
		this.ticketAdvisory = ticketAdvisory;
	}



	public ArrayList<ArrayList<Segments>> getSegments() {
		return segments;
	}



	public void setSegments(ArrayList<ArrayList<Segments>> segments) {
		this.segments = segments;
	}



	public ArrayList<FareRule> getFareRules() {
		return fareRules;
	}



	public void setFareRules(ArrayList<FareRule> fareRules) {
		this.fareRules = fareRules;
	}



	public String getValidatingAirline() {
		return validatingAirline;
	}



	public void setValidatingAirline(String validatingAirline) {
		this.validatingAirline = validatingAirline;
	}



	public int getTripIndicator() {
		return tripIndicator;
	}



	public void setTripIndicator(int tripIndicator) {
		this.tripIndicator = tripIndicator;
	}



	public Date getResponseTime() {
		return responseTime;
	}



	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}



	public int getJourneyType() {
		return journeyType;
	}



	public void setJourneyType(int journeyType) {
		this.journeyType = journeyType;
	}



	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", origin=" + origin + ", destination=" + destination + ", isLcc="
				+ isLcc + ", nonRefundable=" + nonRefundable + ", airlineRemark=" + airlineRemark + ", fare=" + fare
				+ ", fareBreakdown=" + fareBreakdown + ", lastTicketDate=" + lastTicketDate + ", ticketAdvisory="
				+ ticketAdvisory + ", segments=" + segments + ", fareRules=" + fareRules + ", validatingAirline="
				+ validatingAirline + ", tripIndicator=" + tripIndicator + ", responseTime=" + responseTime
				+ ", journeyType=" + journeyType + "]";
	}



	
	
	
	
    
    

}
