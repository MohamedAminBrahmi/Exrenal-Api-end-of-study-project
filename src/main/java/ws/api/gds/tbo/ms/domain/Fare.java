package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fare {
	@JsonProperty("TotalFare") 
	private double totalFare;
    @JsonProperty("FareType") 
    private String fareType;
    @JsonProperty("AgentMarkup") 
    private double agentMarkup;
    @JsonProperty("OtherCharges") 
    private double otherCharges;
    @JsonProperty("AgentPreferredCurrency") 
    private String agentPreferredCurrency;
    @JsonProperty("ServiceFee") 
    private double serviceFee;
    @JsonProperty("BaseFare") 
    private double baseFare;
    @JsonProperty("Tax") 
    private double tax;
    
	public Fare() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Fare(double totalFare, String fareType, double agentMarkup, double otherCharges,
			String ogentPreferredCurrency, double serviceFee, double baseFare, double tax) {
		this.totalFare = totalFare;
		this.fareType = fareType;
		this.agentMarkup = agentMarkup;
		this.otherCharges = otherCharges;
		this.serviceFee = serviceFee;
		this.baseFare = baseFare;
		this.tax = tax;
	}



	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public double getAgentMarkup() {
		return agentMarkup;
	}

	public void setAgentMarkup(double agentMarkup) {
		this.agentMarkup = agentMarkup;
	}

	public double getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(double otherCharges) {
		this.otherCharges = otherCharges;
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
		return "Fare [totalFare=" + totalFare + ", fareType=" + fareType + ", agentMarkup=" + agentMarkup
				+ ", otherCharges=" + otherCharges + ", ogentPreferredCurrency=" + ", serviceFee=" + serviceFee + ", baseFare=" + baseFare + ", tax=" + tax + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
    

}
