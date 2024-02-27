package ws.api.gds.tbo.ms.model;


import java.math.BigDecimal;
import java.util.List; 
public class ItineraryPricingModel {

	private FareModel clientMarkup;
	private FareModel equiFare;
	private FareModel customerCharge;
	private FareModel serviceTax;
	private FareModel tax;
	private FareModel totalFare;
	private FareModel extraServiceFare;
	private FareModel taxCC;
	
	private FareModel serviceTaxAgence;

	 
	 
	public ItineraryPricingModel() {
		super();
	}

	public ItineraryPricingModel(FareModel clientMarkup, FareModel equiFare, FareModel extraServiceCharges,
			FareModel serviceTax, FareModel tax, FareModel totalFare) {
		super();
		this.clientMarkup = clientMarkup;
		this.equiFare = equiFare;
		this.customerCharge = extraServiceCharges;
		this.serviceTax = serviceTax;
		this.tax = tax;
		this.totalFare = totalFare;
	}

	 
 
	public ItineraryPricingModel(List<TripDetailsPTCFareBreakdownModel> tripDetailsPTCFareBreakdowns) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ItineraryPricingModel [clientMarkup=" + clientMarkup + ", equiFare=" + equiFare + ", customerCharge="
				+ customerCharge + ", serviceTax=" + serviceTax + ", tax=" + tax + ", totalFare=" + totalFare
				+ ", extraServiceFare=" + extraServiceFare + "]";
	}

	public FareModel getClientMarkup() {
		return clientMarkup;
	}

	public void setClientMarkup(FareModel clientMarkup) {
		this.clientMarkup = clientMarkup;
	}

	public FareModel getEquiFare() {
		return equiFare;
	}

	public void setEquiFare(FareModel equiFare) {
		this.equiFare = equiFare;
	}

	public FareModel getCustomerCharges() {
		return customerCharge;
	}

	public void setCustomerCharges(FareModel extraServiceCharges) {
		this.customerCharge = extraServiceCharges;
	}

	public FareModel getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(FareModel serviceTax) {
		this.serviceTax = serviceTax;
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

	public FareModel getExtraServiceFare() {
		return extraServiceFare;
	}

	public void setExtraServiceFare(FareModel extraServiceFare) {
		this.extraServiceFare = extraServiceFare;
	}

	public void setDeviseAndCommission(BigDecimal txChange, BigDecimal codeDevise, String nbChiffre,
			BigDecimal mntCommGSA, BigDecimal txCommission, BigDecimal mntCommWS, BigDecimal wsTauxComm) {
		// TODO Auto-generated method stub

	}

 
	public FareModel getTaxCC() {
		return taxCC;
	}

	public void setTaxCC(FareModel taxCC) {
		this.taxCC = taxCC;
	}

	public FareModel getServiceTaxAgence() {
		return serviceTaxAgence;
	}

	public void setServiceTaxAgence(FareModel serviceTaxAgence) {
		this.serviceTaxAgence = serviceTaxAgence;
	}

}
