package ws.api.gds.tbo.ms.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareRule {
	@JsonProperty("Origin") 
    private String origin;
    @JsonProperty("Destination") 
    private String destination;
    @JsonProperty("Airline") 
    private String airline;
    @JsonProperty("FareRestriction") 
    private String fareRestriction;
    @JsonProperty("FareBasisCode") 
    private String fareBasisCode;
    @JsonProperty("FareFamilyCode") 
    private Object fareFamilyCode;
    @JsonProperty("FareRuleDetail") 
    private String fareRuleDetail;
    @JsonProperty("FareRuleIndex") 
    private Object fareRuleIndex;
    @JsonProperty("DepartureDate") 
    private Date departureDate;
    @JsonProperty("FlightNumber") 
    private String flightNumber;
    @JsonProperty("FreeTextFareRuleDetail") 
    private Object freeTextFareRuleDetail;
    
    
    
	public FareRule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FareRule(String origin, String destination, String airline, String fareRestriction, String fareBasisCode,
			Object fareFamilyCode, String fareRuleDetail, Object fareRuleIndex, Date departureDate, String flightNumber,
			Object freeTextFareRuleDetail) {
		this.origin = origin;
		this.destination = destination;
		this.airline = airline;
		this.fareRestriction = fareRestriction;
		this.fareBasisCode = fareBasisCode;
		this.fareFamilyCode = fareFamilyCode;
		this.fareRuleDetail = fareRuleDetail;
		this.fareRuleIndex = fareRuleIndex;
		this.departureDate = departureDate;
		this.flightNumber = flightNumber;
		this.freeTextFareRuleDetail = freeTextFareRuleDetail;
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






	public String getAirline() {
		return airline;
	}






	public void setAirline(String airline) {
		this.airline = airline;
	}






	public String getFareRestriction() {
		return fareRestriction;
	}






	public void setFareRestriction(String fareRestriction) {
		this.fareRestriction = fareRestriction;
	}






	public String getFareBasisCode() {
		return fareBasisCode;
	}






	public void setFareBasisCode(String fareBasisCode) {
		this.fareBasisCode = fareBasisCode;
	}






	public Object getFareFamilyCode() {
		return fareFamilyCode;
	}






	public void setFareFamilyCode(Object fareFamilyCode) {
		this.fareFamilyCode = fareFamilyCode;
	}






	public String getFareRuleDetail() {
		return fareRuleDetail;
	}






	public void setFareRuleDetail(String fareRuleDetail) {
		this.fareRuleDetail = fareRuleDetail;
	}






	public Object getFareRuleIndex() {
		return fareRuleIndex;
	}






	public void setFareRuleIndex(Object fareRuleIndex) {
		this.fareRuleIndex = fareRuleIndex;
	}






	public Date getDepartureDate() {
		return departureDate;
	}






	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}






	public String getFlightNumber() {
		return flightNumber;
	}






	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}






	public Object getFreeTextFareRuleDetail() {
		return freeTextFareRuleDetail;
	}






	public void setFreeTextFareRuleDetail(Object freeTextFareRuleDetail) {
		this.freeTextFareRuleDetail = freeTextFareRuleDetail;
	}






	@Override
	public String toString() {
		return "FareRule [origin=" + origin + ", destination=" + destination + ", airline=" + airline
				+ ", fareRestriction=" + fareRestriction + ", fareBasisCode=" + fareBasisCode + ", fareFamilyCode="
				+ fareFamilyCode + ", fareRuleDetail=" + fareRuleDetail + ", fareRuleIndex=" + fareRuleIndex
				+ ", departureDate=" + departureDate + ", flightNumber=" + flightNumber + ", freeTextFareRuleDetail="
				+ freeTextFareRuleDetail + "]";
	}






	
	
	
	
    

}
