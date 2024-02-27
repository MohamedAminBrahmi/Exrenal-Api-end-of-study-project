package ws.api.gds.tbo.ms.model;

 


 
  
 
public class PassengerFareModel implements Cloneable {

	private FareModel baseFare;
	private FareModel tax;
	private FareModel totalFare;
	private FareModel adminFee;
	private FareModel voidFee;
	private FareModel refundFee;
//	private FareModel agenceComm;

	 
	
	
	
	 
	public PassengerFareModel() {
		super();
	}

	 
	 
	
	public FareModel getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(FareModel baseFare) {
		this.baseFare = baseFare;
	}

	public FareModel getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(FareModel totalFare) {
		this.totalFare = totalFare;
	}

	public FareModel getTax() {
		return tax;
	}

	public void setTax(FareModel tax) {
		this.tax = tax;
	}

	

	@Override
	public String toString() {
		return "PassengerFareModel [baseFare=" + baseFare + ", tax=" + tax + ", totalFare=" + totalFare + "]";
	}


	

	public FareModel getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(FareModel adminFee) {
		this.adminFee = adminFee;
	}

	public FareModel getVoidFee() {
		return voidFee;
	}

	public void setVoidFee(FareModel voidFee) {
		this.voidFee = voidFee;
	}

	public FareModel getRefundFee() {
		return refundFee;
	}

	public void setRefundFee(FareModel refundFee) {
		this.refundFee = refundFee;
	}

	
}
