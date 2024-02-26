package ws.api.gds.tbo.ms.model;

public class BookingToSearch {

	private String ref;
	private String numPnr;
	private String ticketNumber;
	private String passenger;
	private String travelDateFrom;
	private String travelDateTo;
	private String bookingDateFrom;
	private String bookingDateTo;
	private String etat;
	private String airline;
	private String domestic;
	private String gds;
	private Boolean ticketsForToday;

	public BookingToSearch() {
		super();
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getPassenger() {
		return passenger;
	}

	public void setPassenger(String passenger) {
		this.passenger = passenger;
	}

	public String getTravelDateFrom() {
		return travelDateFrom;
	}

	public void setTravelDateFrom(String travelDateFrom) {
		this.travelDateFrom = travelDateFrom;
	}

	public String getTravelDateTo() {
		return travelDateTo;
	}

	public void setTravelDateTo(String travelDateTo) {
		this.travelDateTo = travelDateTo;
	}

	public String getBookingDateFrom() {
		return bookingDateFrom;
	}

	public void setBookingDateFrom(String bookingDateFrom) {
		this.bookingDateFrom = bookingDateFrom;
	}

	public String getBookingDateTo() {
		return bookingDateTo;
	}

	public void setBookingDateTo(String bookingDateTo) {
		this.bookingDateTo = bookingDateTo;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNumPnr() {
		return numPnr;
	}

	public void setNumPnr(String numPnr) {
		this.numPnr = numPnr;
	}

	@Override
	public String toString() {
		return "BookingToSearch [ref=" + ref + ", numPnr=" + numPnr + ", ticketNumber=" + ticketNumber + ", passenger="
				+ passenger + ", travelDateFrom=" + travelDateFrom + ", travelDateTo=" + travelDateTo
				+ ", bookingDateFrom=" + bookingDateFrom + ", bookingDateTo=" + bookingDateTo + ", etat=" + etat
				+ ", airline=" + airline + ", domestic=" + domestic + "]";
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDomestic() {
		return domestic;
	}

	public void setDomestic(String domestic) {
		this.domestic = domestic;
	}

	public String getGds() {
		return gds;
	}

	public void setGds(String gds) {
		this.gds = gds;
	}

	public Boolean getTicketsForToday() {
		return ticketsForToday;
	}

	public void setTicketsForToday(Boolean ticketsForToday) {
		this.ticketsForToday = ticketsForToday;
	}

}
