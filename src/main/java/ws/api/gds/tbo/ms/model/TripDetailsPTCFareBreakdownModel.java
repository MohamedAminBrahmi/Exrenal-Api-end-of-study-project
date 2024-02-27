package ws.api.gds.tbo.ms.model;

 
  
 
public class TripDetailsPTCFareBreakdownModel {

	private PassengerTypeQuantityModel passengerTypeQuantity;
	private TripDetailsPassengerFareModel tripDetailsPassengerFare;
	private TripDetailsPassengerFareModel tripDetailsAPassengerFare;
	//private AirFeeType pricesAirArabiaBaggage;

	 
	public TripDetailsPTCFareBreakdownModel() {
		super();
	}

	 

	public TripDetailsPTCFareBreakdownModel(PassengerTypeQuantityModel passengerTypeQuantity,
			TripDetailsPassengerFareModel tripDetailsPassengerFare) {
		super();
		this.passengerTypeQuantity = passengerTypeQuantity;
		this.tripDetailsPassengerFare = tripDetailsPassengerFare;
	}
 
	 
	
 
 
	

	public PassengerTypeQuantityModel getPassengerTypeQuantity() {
		return passengerTypeQuantity;
	}

	public void setPassengerTypeQuantity(PassengerTypeQuantityModel passengerTypeQuantity) {
		this.passengerTypeQuantity = passengerTypeQuantity;
	}

	public TripDetailsPassengerFareModel getTripDetailsPassengerFare() {
		return tripDetailsPassengerFare;
	}

	public void setTripDetailsPassengerFare(TripDetailsPassengerFareModel tripDetailsPassengerFare) {
		this.tripDetailsPassengerFare = tripDetailsPassengerFare;
	}

	public TripDetailsPassengerFareModel getTripDetailsAPassengerFare() {
		return tripDetailsAPassengerFare;
	}

	public void setTripDetailsAPassengerFare(TripDetailsPassengerFareModel tripDetailsAPassengerFare) {
		this.tripDetailsAPassengerFare = tripDetailsAPassengerFare;
	}

	

	@Override
	public String toString() {
		return "TripDetailsPTCFareBreakdownModel [passengerTypeQuantity=" + passengerTypeQuantity
				+ ", tripDetailsPassengerFare=" + tripDetailsPassengerFare + ", tripDetailsAPassengerFare="
				+ tripDetailsAPassengerFare + "]";
	}

	

}
