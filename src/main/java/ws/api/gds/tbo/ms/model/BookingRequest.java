package ws.api.gds.tbo.ms.model;

public class BookingRequest {
	private FlightBookingModel flightBooking;
	private GdsSessionModel gds;
	public FlightBookingModel getFlightBooking() {
		return flightBooking;
	}
	public void setFlightBooking(FlightBookingModel flightBooking) {
		this.flightBooking = flightBooking;
	}
	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	
	
}
