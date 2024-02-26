package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;


public class AvailabilitySSRsRequest {
	private PricedItineraryModel pricedItinerary;
	private GdsSessionModel gds;
	private String transactionID;
	private BigDecimal idEntite;
	private String deviseConnecte;
	private BigDecimal nbChiffreDevise;
	private FlightBookingModel flightBooking;
	
	
	
	
	public AvailabilitySSRsRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AvailabilitySSRsRequest(PricedItineraryModel pricedItinerary, GdsSessionModel gds, String transactionID,
			BigDecimal idEntite, String deviseConnecte, BigDecimal nbChiffreDevise, FlightBookingModel flightBooking) {
		super();
		this.pricedItinerary = pricedItinerary;
		this.gds = gds;
		this.transactionID = transactionID;
		this.idEntite = idEntite;
		this.deviseConnecte = deviseConnecte;
		this.nbChiffreDevise = nbChiffreDevise;
		this.flightBooking = flightBooking;
	}
	public PricedItineraryModel getPricedItinerary() {
		return pricedItinerary;
	}
	public void setPricedItinerary(PricedItineraryModel pricedItinerary) {
		this.pricedItinerary = pricedItinerary;
	}
	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public BigDecimal getIdEntite() {
		return idEntite;
	}
	public void setIdEntite(BigDecimal idEntite) {
		this.idEntite = idEntite;
	}
	public String getDeviseConnecte() {
		return deviseConnecte;
	}
	public void setDeviseConnecte(String deviseConnecte) {
		this.deviseConnecte = deviseConnecte;
	}
	public BigDecimal getNbChiffreDevise() {
		return nbChiffreDevise;
	}
	public void setNbChiffreDevise(BigDecimal nbChiffreDevise) {
		this.nbChiffreDevise = nbChiffreDevise;
	}
	public FlightBookingModel getFlightBooking() {
		return flightBooking;
	}
	public void setFlightBooking(FlightBookingModel flightBooking) {
		this.flightBooking = flightBooking;
	}
	@Override
	public String toString() {
		return "AvailabilitySSRsRequest [pricedItinerary=" + pricedItinerary + ", gds=" + gds + ", transactionID="
				+ transactionID + ", idEntite=" + idEntite + ", deviseConnecte=" + deviseConnecte + ", nbChiffreDevise="
				+ nbChiffreDevise + ", flightBooking=" + flightBooking + "]";
	}
 

	
}
