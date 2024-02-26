package ws.api.gds.tbo.ms.model;


 

public class ItinTotalFareModel implements Cloneable {
	private FareModel actualFare;
	private FareModel baseFare;
	private FareModel equivFare;
	private FareModel serviceTax;
	private FareModel totalFare;
	private FareModel avgTotalFare;
	private FareModel totalTax;
	private float totaleFare;
	private String ccFee;
	private String totalFareCC;
	private float agenceComm; 
  
	public ItinTotalFareModel(FareModel actualFare, FareModel baseFare, FareModel equivFare, FareModel serviceTax,
			FareModel totalFare, FareModel totalTax) {
		super();
		this.actualFare = actualFare;
		this.baseFare = baseFare;
		this.equivFare = equivFare;
		this.serviceTax = serviceTax;
		this.totalFare = totalFare;
		this.totalTax = totalTax;
	}

	public ItinTotalFareModel() {
		super();
	}

 
	
	

	public FareModel getActualFare() {
		return actualFare;
	}

	public void setActualFare(FareModel actualFare) {
		this.actualFare = actualFare;
	}

	public FareModel getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(FareModel baseFare) {
		this.baseFare = baseFare;
	}

	public FareModel getEquivFare() {
		return equivFare;
	}

	public void setEquivFare(FareModel equivFare) {
		this.equivFare = equivFare;
	}

	public FareModel getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(FareModel serviceTax) {
		this.serviceTax = serviceTax;
	}

	public FareModel getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(FareModel totalFare) {
		this.totalFare = totalFare;
	}

	public FareModel getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(FareModel totalTax) {
		this.totalTax = totalTax;
	}

	public FareModel getAvgTotalFare() {
		return avgTotalFare;
	}

	public void setAvgTotalFare(FareModel avgTotalFare) {
		this.avgTotalFare = avgTotalFare;
	}

	public float getTotaleFare() {
		return totaleFare;
	}

	public void setTotaleFare(float totaleFare) {
		this.totaleFare = totaleFare;
	}

	@Override
	public String toString() {
		return "ItinTotalFareModel [actualFare=" + actualFare + ", baseFare=" + baseFare + ", equivFare=" + equivFare
				+ ", serviceTax=" + serviceTax + ", totalFare=" + totalFare + ", avgTotalFare=" + avgTotalFare
				+ ", totalTax=" + totalTax + ", totaleFare=" + totaleFare + "]";
	}

	public String getCcFee() {
		return ccFee;
	}

	public void setCcFee(String ccFee) {
		this.ccFee = ccFee;
	}

	public String getTotalFareCC() {
		return totalFareCC;
	}

	public void setTotalFareCC(String totalFareCC) {
		this.totalFareCC = totalFareCC;
	}


	



	public float getAgenceComm() {
		return agenceComm;
	}

	public void setAgenceComm(float agenceComm) {
		this.agenceComm = agenceComm;
	}

}
