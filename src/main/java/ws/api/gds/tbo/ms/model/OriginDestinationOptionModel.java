package ws.api.gds.tbo.ms.model;

import java.util.List;

public class OriginDestinationOptionModel implements Cloneable {
	
	private List<FlightSegmentModel> flightSegment;
	
	
  
	
	public OriginDestinationOptionModel(List<FlightSegmentModel> flightSegment) {
		this.flightSegment = flightSegment;
	}




	public OriginDestinationOptionModel() {
		super();
	}

	
	
	
	public List<FlightSegmentModel> getFlightSegment() {
		return flightSegment;
	}

	public void setFlightSegment(List<FlightSegmentModel> flightSegment) {
		this.flightSegment = flightSegment;
	}

	

	
	@Override
	public String toString() {
		return "OriginDestinationOptionModel [flightSegment=" + flightSegment + "]";
	}
}
