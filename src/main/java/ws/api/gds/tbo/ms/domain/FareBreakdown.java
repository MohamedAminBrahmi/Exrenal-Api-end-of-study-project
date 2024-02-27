package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareBreakdown {
	@JsonProperty("Currency") 
	private String currency;
    @JsonProperty("PassengerType") 
    private int passengerType;
    @JsonProperty("PassengerCount") 
    private int passengerCount;
    @JsonProperty("TotalFare") 
    private double totalFare;
    @JsonProperty("OtherCharges") 
    private double otherCharges;
    @JsonProperty("AgentMarkup") 
    private double agentMarkup;
    @JsonProperty("ServiceFee") 
    private double serviceFee;
    @JsonProperty("BaseFare") 
    private double baseFare;
    @JsonProperty("Tax") 
    private double tax;
    
    
	public FareBreakdown() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FareBreakdown(String currency, int passengerType, int passengerCount, double totalFare, double otherCharges,
			double agentMarkup, double serviceFee, double baseFare, double tax) {
		this.currency = currency;
		this.passengerType = passengerType;
		this.passengerCount = passengerCount;
		this.totalFare = totalFare;
		this.otherCharges = otherCharges;
		this.agentMarkup = agentMarkup;
		this.serviceFee = serviceFee;
		this.baseFare = baseFare;
		this.tax = tax;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(int passengerType) {
		this.passengerType = passengerType;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public double getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(double otherCharges) {
		this.otherCharges = otherCharges;
	}
	public double getAgentMarkup() {
		return agentMarkup;
	}
	public void setAgentMarkup(double agentMarkup) {
		this.agentMarkup = agentMarkup;
	}
	public double getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}
	public double getBaseFare() {
		return baseFare;
	}
	public void setBaseFare(double baseFare) {
		this.baseFare = baseFare;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "FareBreakdown [currency=" + currency + ", passengerType=" + passengerType + ", passengerCount="
				+ passengerCount + ", totalFare=" + totalFare + ", otherCharges=" + otherCharges + ", agentMarkup="
				+ agentMarkup + ", serviceFee=" + serviceFee + ", baseFare=" + baseFare + ", tax=" + tax + "]";
	}
	
	
    
    
    

}
