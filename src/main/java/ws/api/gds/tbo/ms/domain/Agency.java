package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agency {
	@JsonProperty("TotalAailableLimit")
    private double totalAailableLimit;
	@JsonProperty("Currency")
    private String currency;
	@JsonProperty("LocalCurrency")
    private String localCurrency;
	@JsonProperty("LocalCurrencyROE")
    private double localCurrencyROE;
    
    
    
	public Agency() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agency(double totalAailableLimit, String currency, String localCurrency, double localCurrencyROE) {
		super();
		this.totalAailableLimit = totalAailableLimit;
		this.currency = currency;
		this.localCurrency = localCurrency;
		this.localCurrencyROE = localCurrencyROE;
	}
	public double getTotalAailableLimit() {
		return totalAailableLimit;
	}
	public void setTotalAailableLimit(double totalAailableLimit) {
		this.totalAailableLimit = totalAailableLimit;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	@Override
	public String toString() {
		return "Agency [totalAailableLimit=" + totalAailableLimit + ", currency=" + currency + ", localCurrency="
				+ localCurrency + ", localCurrencyROE=" + localCurrencyROE + "]";
	}
    
    

}
