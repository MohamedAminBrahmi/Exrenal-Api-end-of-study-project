package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {
	@JsonProperty("Results") 
    private ArrayList<ArrayList<Result>> results;
    @JsonProperty("IsDomestic") 
    private boolean isDomestic;
    @JsonProperty("LocalCurrency") 
    private String localCurrency;
    @JsonProperty("LocalCurrencyROE") 
    private double localCurrencyROE;
    @JsonProperty("IsSuccess") 
    private boolean isSuccess;
    @JsonProperty("Errors") 
    private ArrayList<Error> errors;
    @JsonProperty("Alerts") 
    private ArrayList<Object> alerts;
    @JsonProperty("TokenId") 
    private String tokenId;
    @JsonProperty("TrackingId") 
    private String trackingId;
    
    
	public SearchResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchResponse(ArrayList<ArrayList<Result>> results, boolean isDomestic, String localCurrency,
			double localCurrencyROE, boolean isSuccess, ArrayList<Error> errors, ArrayList<Object> alerts,
			String tokenId, String trackingId) {
		this.results = results;
		this.isDomestic = isDomestic;
		this.localCurrency = localCurrency;
		this.localCurrencyROE = localCurrencyROE;
		this.isSuccess = isSuccess;
		this.errors = errors;
		this.alerts = alerts;
		this.tokenId = tokenId;
		this.trackingId = trackingId;
	}
	public ArrayList<ArrayList<Result>> getResults() {
		return results;
	}
	public void setResults(ArrayList<ArrayList<Result>> results) {
		this.results = results;
	}
	public boolean isDomestic() {
		return isDomestic;
	}
	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}
	public String getLocalCurrency() {
		return localCurrency;
	}
	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}
	public double getLocalCurrencyROE() {
		return localCurrencyROE;
	}
	public void setLocalCurrencyROE(double localCurrencyROE) {
		this.localCurrencyROE = localCurrencyROE;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public ArrayList<Error> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}
	public ArrayList<Object> getAlerts() {
		return alerts;
	}
	public void setAlerts(ArrayList<Object> alerts) {
		this.alerts = alerts;
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
	@Override
	public String toString() {
		return "SearchResponse [results=" + results + ", isDomestic=" + isDomestic + ", localCurrency=" + localCurrency
				+ ", localCurrencyROE=" + localCurrencyROE + ", isSuccess=" + isSuccess + ", errors=" + errors
				+ ", alerts=" + alerts + ", tokenId=" + tokenId + ", trackingId=" + trackingId + "]";
	}
    
    
    
    

}
