package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Segments {
	@JsonProperty("NoOfSeatAvailable") 
    private int noOfSeatAvailable;
    @JsonProperty("AllianceInfo") 
    private Object allianceInfo;
    @JsonProperty("OperatingCarrier") 
    private Object operatingCarrier;
    @JsonProperty("SegmentIndicator") 
    private int segmentIndicator;
    @JsonProperty("Airline") 
    private String airline;
    @JsonProperty("Origin") 
    private Origin origin;
    @JsonProperty("Destination") 
    private Destination destination;
    @JsonProperty("FlightNumber") 
    private String flightNumber;
    @JsonProperty("DepartureTime") 
    private Date departureTime;
    @JsonProperty("ArrivalTime") 
    private Date arrivalTime;
    @JsonProperty("BookingClass") 
    private String bookingClass;
    @JsonProperty("FlightStatus") 
    private int flightStatus;
    @JsonProperty("Status") 
    private Object status;
    @JsonProperty("MealType") 
    private Object mealType;
    @JsonProperty("ETicketEligible") 
    private boolean eTicketEligible;
    @JsonProperty("AirlinePNR") 
    private Object airlinePNR;
    @JsonProperty("Craft") 
    private String craft;
    @JsonProperty("StopOver") 
    private boolean stopOver;
    @JsonProperty("Stops") 
    private int stops;
    @JsonProperty("Mile") 
    private int mile;
    @JsonProperty("Duration") 
    private String duration;
    @JsonProperty("GroundTime") 
    private String groundTime;
    @JsonProperty("AccumulatedDuration") 
    private String accumulatedDuration;
    @JsonProperty("StopPoint") 
    private Object stopPoint;
    @JsonProperty("StopPointArrivalTime") 
    private Date stopPointArrivalTime;
    @JsonProperty("StopPointDepartureTime") 
    private Date stopPointDepartureTime;
    @JsonProperty("IncludedBaggage") 
    private String includedBaggage;
    @JsonProperty("CabinBaggage") 
    private String cabinBaggage;
    @JsonProperty("CabinClass") 
    private String cabinClass;
    @JsonProperty("AdditionalBaggage") 
    private Object additionalBaggage;
    @JsonProperty("AirlineDetails") 
    private AirlineDetails airlineDetails;
    @JsonProperty("AirlineName") 
    private String airlineName;
    @JsonProperty("DepartureDateTime") 
    private Object departureDateTime;
    @JsonProperty("DepartureDate") 
    private Object departureDate;
    @JsonProperty("ArrivalDateTime") 
    private Object arrivalDateTime;
    @JsonProperty("ArrivalDate") 
    private Object arrivalDate;
    @JsonProperty("LayoverText") 
    private Object layoverText;
    @JsonProperty("InFlightServices") 
    private Object inFlightServices;
    @JsonProperty("Passenger") 
    private ArrayList<Passenger> passenger;
    @JsonProperty("FareRules") 
    private ArrayList<FareRule> fareRules;
    @JsonProperty("ValidatingAirlineCode") 
    private String validatingAirlineCode;
    @JsonProperty("ResponseTime") 
    private Date responseTime;
    @JsonProperty("JourneyType") 
    private int journeyType;
    @JsonProperty("LastTicketDate") 
    private String lastTicketDate;
    @JsonProperty("TravelDate") 
    private Date travelDate;
    @JsonProperty("CreatedOn") 
    private String createdOn;
    @JsonProperty("SearchType") 
    private int searchType;
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
	public Segments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Segments(int noOfSeatAvailable, Object allianceInfo, Object operatingCarrier, int segmentIndicator,
			String airline, Origin origin, Destination destination, String flightNumber, Date departureTime,
			Date arrivalTime, String bookingClass, int flightStatus, Object status, Object mealType,
			boolean eTicketEligible, Object airlinePNR, String craft, boolean stopOver, int stops, int mile,
			String duration, String groundTime, String accumulatedDuration, Object stopPoint, Date stopPointArrivalTime,
			Date stopPointDepartureTime, String includedBaggage, String cabinBaggage, String cabinClass,
			Object additionalBaggage, AirlineDetails airlineDetails, String airlineName, Object departureDateTime,
			Object departureDate, Object arrivalDateTime, Object arrivalDate, Object layoverText,
			Object inFlightServices, ArrayList<Passenger> passenger, ArrayList<FareRule> fareRules,
			String validatingAirlineCode, Date responseTime, int journeyType, String lastTicketDate, Date travelDate,
			String createdOn, int searchType, boolean nonRefundable, Object agentRefNo, boolean isDomestic,
			boolean isLcc, String airlineRemark, String earnedLoyaltyPoints, String staffRemarks, String pointOfSale,
			String requestOrigin, String endUserBrowserAgent, String userData) {
		this.noOfSeatAvailable = noOfSeatAvailable;
		this.allianceInfo = allianceInfo;
		this.operatingCarrier = operatingCarrier;
		this.segmentIndicator = segmentIndicator;
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.bookingClass = bookingClass;
		this.flightStatus = flightStatus;
		this.status = status;
		this.mealType = mealType;
		this.eTicketEligible = eTicketEligible;
		this.airlinePNR = airlinePNR;
		this.craft = craft;
		this.stopOver = stopOver;
		this.stops = stops;
		this.mile = mile;
		this.duration = duration;
		this.groundTime = groundTime;
		this.accumulatedDuration = accumulatedDuration;
		this.stopPoint = stopPoint;
		this.stopPointArrivalTime = stopPointArrivalTime;
		this.stopPointDepartureTime = stopPointDepartureTime;
		this.includedBaggage = includedBaggage;
		this.cabinBaggage = cabinBaggage;
		this.cabinClass = cabinClass;
		this.additionalBaggage = additionalBaggage;
		this.airlineDetails = airlineDetails;
		this.airlineName = airlineName;
		this.departureDateTime = departureDateTime;
		this.departureDate = departureDate;
		this.arrivalDateTime = arrivalDateTime;
		this.arrivalDate = arrivalDate;
		this.layoverText = layoverText;
		this.inFlightServices = inFlightServices;
		this.passenger = passenger;
		this.fareRules = fareRules;
		this.validatingAirlineCode = validatingAirlineCode;
		this.responseTime = responseTime;
		this.journeyType = journeyType;
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
	public int getNoOfSeatAvailable() {
		return noOfSeatAvailable;
	}
	public void setNoOfSeatAvailable(int noOfSeatAvailable) {
		this.noOfSeatAvailable = noOfSeatAvailable;
	}
	public Object getAllianceInfo() {
		return allianceInfo;
	}
	public void setAllianceInfo(Object allianceInfo) {
		this.allianceInfo = allianceInfo;
	}
	public Object getOperatingCarrier() {
		return operatingCarrier;
	}
	public void setOperatingCarrier(Object operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}
	public int getSegmentIndicator() {
		return segmentIndicator;
	}
	public void setSegmentIndicator(int segmentIndicator) {
		this.segmentIndicator = segmentIndicator;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public Origin getOrigin() {
		return origin;
	}
	public void setOrigin(Origin origin) {
		this.origin = origin;
	}
	public Destination getDestination() {
		return destination;
	}
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getBookingClass() {
		return bookingClass;
	}
	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}
	public int getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(int flightStatus) {
		this.flightStatus = flightStatus;
	}
	public Object getStatus() {
		return status;
	}
	public void setStatus(Object status) {
		this.status = status;
	}
	public Object getMealType() {
		return mealType;
	}
	public void setMealType(Object mealType) {
		this.mealType = mealType;
	}
	public boolean iseTicketEligible() {
		return eTicketEligible;
	}
	public void seteTicketEligible(boolean eTicketEligible) {
		this.eTicketEligible = eTicketEligible;
	}
	public Object getAirlinePNR() {
		return airlinePNR;
	}
	public void setAirlinePNR(Object airlinePNR) {
		this.airlinePNR = airlinePNR;
	}
	public String getCraft() {
		return craft;
	}
	public void setCraft(String craft) {
		this.craft = craft;
	}
	public boolean isStopOver() {
		return stopOver;
	}
	public void setStopOver(boolean stopOver) {
		this.stopOver = stopOver;
	}
	public int getStops() {
		return stops;
	}
	public void setStops(int stops) {
		this.stops = stops;
	}
	public int getMile() {
		return mile;
	}
	public void setMile(int mile) {
		this.mile = mile;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGroundTime() {
		return groundTime;
	}
	public void setGroundTime(String groundTime) {
		this.groundTime = groundTime;
	}
	public String getAccumulatedDuration() {
		return accumulatedDuration;
	}
	public void setAccumulatedDuration(String accumulatedDuration) {
		this.accumulatedDuration = accumulatedDuration;
	}
	public Object getStopPoint() {
		return stopPoint;
	}
	public void setStopPoint(Object stopPoint) {
		this.stopPoint = stopPoint;
	}
	public Date getStopPointArrivalTime() {
		return stopPointArrivalTime;
	}
	public void setStopPointArrivalTime(Date stopPointArrivalTime) {
		this.stopPointArrivalTime = stopPointArrivalTime;
	}
	public Date getStopPointDepartureTime() {
		return stopPointDepartureTime;
	}
	public void setStopPointDepartureTime(Date stopPointDepartureTime) {
		this.stopPointDepartureTime = stopPointDepartureTime;
	}
	public String getIncludedBaggage() {
		return includedBaggage;
	}
	public void setIncludedBaggage(String includedBaggage) {
		this.includedBaggage = includedBaggage;
	}
	public String getCabinBaggage() {
		return cabinBaggage;
	}
	public void setCabinBaggage(String cabinBaggage) {
		this.cabinBaggage = cabinBaggage;
	}
	public String getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	public Object getAdditionalBaggage() {
		return additionalBaggage;
	}
	public void setAdditionalBaggage(Object additionalBaggage) {
		this.additionalBaggage = additionalBaggage;
	}
	public AirlineDetails getAirlineDetails() {
		return airlineDetails;
	}
	public void setAirlineDetails(AirlineDetails airlineDetails) {
		this.airlineDetails = airlineDetails;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public Object getDepartureDateTime() {
		return departureDateTime;
	}
	public void setDepartureDateTime(Object departureDateTime) {
		this.departureDateTime = departureDateTime;
	}
	public Object getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Object departureDate) {
		this.departureDate = departureDate;
	}
	public Object getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(Object arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public Object getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Object arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Object getLayoverText() {
		return layoverText;
	}
	public void setLayoverText(Object layoverText) {
		this.layoverText = layoverText;
	}
	public Object getInFlightServices() {
		return inFlightServices;
	}
	public void setInFlightServices(Object inFlightServices) {
		this.inFlightServices = inFlightServices;
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
	public String getValidatingAirlineCode() {
		return validatingAirlineCode;
	}
	public void setValidatingAirlineCode(String validatingAirlineCode) {
		this.validatingAirlineCode = validatingAirlineCode;
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
	public String getLastTicketDate() {
		return lastTicketDate;
	}
	public void setLastTicketDate(String lastTicketDate) {
		this.lastTicketDate = lastTicketDate;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public int getSearchType() {
		return searchType;
	}
	public void setSearchType(int searchType) {
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
	@Override
	public String toString() {
		return "Segments [noOfSeatAvailable=" + noOfSeatAvailable + ", allianceInfo=" + allianceInfo
				+ ", operatingCarrier=" + operatingCarrier + ", segmentIndicator=" + segmentIndicator + ", airline="
				+ airline + ", origin=" + origin + ", destination=" + destination + ", flightNumber=" + flightNumber
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", bookingClass=" + bookingClass
				+ ", flightStatus=" + flightStatus + ", status=" + status + ", mealType=" + mealType
				+ ", eTicketEligible=" + eTicketEligible + ", airlinePNR=" + airlinePNR + ", craft=" + craft
				+ ", stopOver=" + stopOver + ", stops=" + stops + ", mile=" + mile + ", duration=" + duration
				+ ", groundTime=" + groundTime + ", accumulatedDuration=" + accumulatedDuration + ", stopPoint="
				+ stopPoint + ", stopPointArrivalTime=" + stopPointArrivalTime + ", stopPointDepartureTime="
				+ stopPointDepartureTime + ", includedBaggage=" + includedBaggage + ", cabinBaggage=" + cabinBaggage
				+ ", cabinClass=" + cabinClass + ", additionalBaggage=" + additionalBaggage + ", airlineDetails="
				+ airlineDetails + ", airlineName=" + airlineName + ", departureDateTime=" + departureDateTime
				+ ", departureDate=" + departureDate + ", arrivalDateTime=" + arrivalDateTime + ", arrivalDate="
				+ arrivalDate + ", layoverText=" + layoverText + ", inFlightServices=" + inFlightServices
				+ ", passenger=" + passenger + ", fareRules=" + fareRules + ", validatingAirlineCode="
				+ validatingAirlineCode + ", responseTime=" + responseTime + ", journeyType=" + journeyType
				+ ", lastTicketDate=" + lastTicketDate + ", travelDate=" + travelDate + ", createdOn=" + createdOn
				+ ", searchType=" + searchType + ", nonRefundable=" + nonRefundable + ", agentRefNo=" + agentRefNo
				+ ", isDomestic=" + isDomestic + ", isLcc=" + isLcc + ", airlineRemark=" + airlineRemark
				+ ", earnedLoyaltyPoints=" + earnedLoyaltyPoints + ", staffRemarks=" + staffRemarks + ", pointOfSale="
				+ pointOfSale + ", requestOrigin=" + requestOrigin + ", endUserBrowserAgent=" + endUserBrowserAgent
				+ ", userData=" + userData + "]";
	}
    
    
	
    
  


	

	

	
	
	
    
    

}
