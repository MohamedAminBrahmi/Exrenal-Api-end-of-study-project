package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Destination {
	@JsonProperty("AirportCode") 
	private String airportCode;
    @JsonProperty("AirportName") 
    private String airportName;
    @JsonProperty("CityCode") 
    private String cityCode;
    @JsonProperty("CityName") 
    private String cityName;
    @JsonProperty("CountryCode") 
    private String countryCode;
    @JsonProperty("CountryName") 
    private String countryName;
    @JsonProperty("Terminal") 
    private String terminal;
	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Destination(String airportCode, String airportName, String cityCode, String cityName, String countryCode,
			String countryName, String terminal) {
		this.airportCode = airportCode;
		this.airportName = airportName;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.terminal = terminal;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	@Override
	public String toString() {
		return "Destination [airportCode=" + airportCode + ", airportName=" + airportName + ", cityCode=" + cityCode
				+ ", cityName=" + cityName + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ ", terminal=" + terminal + "]";
	}
    
    
    

}
