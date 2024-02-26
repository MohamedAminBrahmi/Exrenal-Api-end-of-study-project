package ws.api.gds.tbo.ms.model;

public class AvailabilityRequest {
	private FlightSearchModel flightSearchModel;
	private GdsSessionModel gds;
	
	public FlightSearchModel getFlightSearchModel() {
		return flightSearchModel;
	}
	public void setFlightSearchModel(FlightSearchModel flightSearchModel) {
		this.flightSearchModel = flightSearchModel;
	}
	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	
}
