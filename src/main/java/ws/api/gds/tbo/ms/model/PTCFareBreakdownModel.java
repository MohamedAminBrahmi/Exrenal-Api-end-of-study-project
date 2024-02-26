package ws.api.gds.tbo.ms.model;



   
  
public class PTCFareBreakdownModel implements Cloneable {

	private PassengerFareModel passengerFare;
	private PassengerTypeQuantityModel passengerTypeQuantity;
	public PTCFareBreakdownModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PTCFareBreakdownModel(PassengerFareModel passengerFare, PassengerTypeQuantityModel passengerTypeQuantity) {
		this.passengerFare = passengerFare;
		this.passengerTypeQuantity = passengerTypeQuantity;
	}
	public PassengerFareModel getPassengerFare() {
		return passengerFare;
	}
	public void setPassengerFare(PassengerFareModel passengerFare) {
		this.passengerFare = passengerFare;
	}
	public PassengerTypeQuantityModel getPassengerTypeQuantity() {
		return passengerTypeQuantity;
	}
	public void setPassengerTypeQuantity(PassengerTypeQuantityModel passengerTypeQuantity) {
		this.passengerTypeQuantity = passengerTypeQuantity;
	}
	@Override
	public String toString() {
		return "PTCFareBreakdownModel [passengerFare=" + passengerFare + ", passengerTypeQuantity="
				+ passengerTypeQuantity + "]";
	}

	
}
