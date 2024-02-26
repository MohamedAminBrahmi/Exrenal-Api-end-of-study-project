package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class City {
	
	@JsonProperty("CountryCode") 
	private String countryCode;
    @JsonProperty("CityCode") 
    private String cityCode;
    @JsonProperty("CityName") 
    private String cityName;
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	public City(String countryCode, String cityCode, String cityName) {
		this.countryCode = countryCode;
		this.cityCode = cityCode;
		this.cityName = cityName;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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
	@Override
	public String toString() {
		return "City [countryCode=" + countryCode + ", cityCode=" + cityCode + ", cityName=" + cityName + "]";
	}
    
    
}
