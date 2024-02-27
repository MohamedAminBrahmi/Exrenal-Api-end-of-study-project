package ws.api.gds.tbo.ms.model; 




  
public class TripDetailsPassengerFareModel {

	private String airportTaxBreakUp;
	private FareModel equiFare;
	private FareModel serviceTaxAgence;
	private FareModel serviceTaxWs;
	private FareModel tax;
	private FareModel totalFare;
	private CommissionPerCompagnieModel compagnieService;

	 
	 

	public TripDetailsPassengerFareModel(String airportTaxBreakUp, FareModel equiFare, FareModel serviceTax,
			FareModel tax, FareModel totalFare) {
		super();
		this.airportTaxBreakUp = airportTaxBreakUp;
		this.equiFare = equiFare;
		this.serviceTaxAgence = serviceTax;
		this.tax = tax;
		this.totalFare = totalFare;
	}

	public TripDetailsPassengerFareModel() {
		super();
	}

	 
	 

	public TripDetailsPassengerFareModel(PassengerFareModel passengerFare) {
		this.equiFare = passengerFare.getBaseFare();
		this.totalFare = passengerFare.getTotalFare();
		this.tax = passengerFare.getTax();
	}

	 

	 

	public TripDetailsPassengerFareModel(TripDetailsPassengerFareModel tripDetailsPassengerFare) {
		this.totalFare = tripDetailsPassengerFare.getTotalFare();
		this.equiFare = tripDetailsPassengerFare.getEquiFare();
		this.tax = tripDetailsPassengerFare.getTax();
	}
 
	

	

	public String getAirportTaxBreakUp() {
		return airportTaxBreakUp;
	}

	public void setAirportTaxBreakUp(String airportTaxBreakUp) {
		this.airportTaxBreakUp = airportTaxBreakUp;
	}

	public FareModel getEquiFare() {
		return equiFare;
	}

	public void setEquiFare(FareModel equiFare) {
		this.equiFare = equiFare;
	}

	public FareModel getServiceTaxAgence() {
		return serviceTaxAgence;
	}

	public void setServiceTaxAgence(FareModel serviceTax) {
		this.serviceTaxAgence = serviceTax;
	}

	public FareModel getTax() {
		return tax;
	}

	public void setTax(FareModel tax) {
		this.tax = tax;
	}

	public FareModel getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(FareModel totalFare) {
		this.totalFare = totalFare;
	}

	public FareModel getServiceTaxWs() {
		return serviceTaxWs;
	}

	public void setServiceTaxWs(FareModel serviceTaxWs) {
		this.serviceTaxWs = serviceTaxWs;
	}

	

	@Override
	public String toString() {
		return "TripDetailsPassengerFareModel [airportTaxBreakUp=" + airportTaxBreakUp + ", equiFare=" + equiFare
				+ ", serviceTaxAgence=" + serviceTaxAgence + ", serviceTaxWs=" + serviceTaxWs + ", tax=" + tax
				+ ", totalFare=" + totalFare + "]";
	}

	public CommissionPerCompagnieModel getCompagnieService() {
		return compagnieService;
	}

	public void setCompagnieService(CommissionPerCompagnieModel compagnieService) {
		this.compagnieService = compagnieService;
	}

	

	

}
