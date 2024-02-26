package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirlineDetails {
	@JsonProperty("AirlineCode") 
    private String airlineCode;
    @JsonProperty("FlightNumber") 
    private String flightNumber;
    @JsonProperty("Craft") 
    private String craft;
    @JsonProperty("AirlineName") 
    private String airlineName;
    @JsonProperty("OperatingCarrier") 
    private Object operatingCarrier;
    @JsonProperty("AllianceInfo") 
    private Object allianceInfo;
    
    
    
	public AirlineDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AirlineDetails(String airlineCode, String flightNumber, String craft, String airlineName,
			Object operatingCarrier, Object allianceInfo) {
		this.airlineCode = airlineCode;
		this.flightNumber = flightNumber;
		this.craft = craft;
		this.airlineName = airlineName;
		this.operatingCarrier = operatingCarrier;
		this.allianceInfo = allianceInfo;
	}



	public String getAirlineCode() {
		return airlineCode;
	}



	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}



	public String getFlightNumber() {
		return flightNumber;
	}



	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}



	public String getCraft() {
		return craft;
	}



	public void setCraft(String craft) {
		this.craft = craft;
	}



	public String getAirlineName() {
		return airlineName;
	}



	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}



	public Object getOperatingCarrier() {
		return operatingCarrier;
	}



	public void setOperatingCarrier(Object operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}



	public Object getAllianceInfo() {
		return allianceInfo;
	}



	public void setAllianceInfo(Object allianceInfo) {
		this.allianceInfo = allianceInfo;
	}



	@Override
	public String toString() {
		return "AirlineDetails [airlineCode=" + airlineCode + ", flightNumber=" + flightNumber + ", craft=" + craft
				+ ", airlineName=" + airlineName + ", operatingCarrier=" + operatingCarrier + ", allianceInfo="
				+ allianceInfo + "]";
	}



	
	
    
	
    

}
