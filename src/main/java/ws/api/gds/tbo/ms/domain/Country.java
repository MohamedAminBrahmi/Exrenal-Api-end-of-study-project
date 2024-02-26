package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
	@JsonProperty("CountryCode") 
	private String countryCode;
    @JsonProperty("CountryName") 
    private String countryName;
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
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
	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}
    
    

}
