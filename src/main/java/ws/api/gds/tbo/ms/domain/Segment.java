package ws.api.gds.tbo.ms.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Segment {
    @JsonProperty("Origin") 
	private String origin;
    @JsonProperty("Destination") 
    private String destination;
    @JsonProperty("PreferredDepartureTime") 
    private String preferredDepartureTime;
    @JsonProperty("PreferredArrivalTime")
    private String preferredArrivalTime;
    
    
	public Segment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Segment(String origin, String destination, String preferredDepartureTime, String preferredArrivalTime) {
		this.origin = origin;
		this.destination = destination;
		this.preferredDepartureTime = preferredDepartureTime;
		this.preferredArrivalTime = preferredArrivalTime;
	}



	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPreferredDepartureTime() {
		return preferredDepartureTime;
	}

	public void setPreferredDepartureTime(String preferredDepartureTime) {
		this.preferredDepartureTime = preferredDepartureTime;
	}

	public String getPreferredArrivalTime() {
		return preferredArrivalTime;
	}

	public void setPreferredArrivalTime(String preferredArrivalTime) {
		this.preferredArrivalTime = preferredArrivalTime;
	}



	@Override
	public String toString() {
		return "Segment [origin=" + origin + ", destination=" + destination + ", preferredDepartureTime="
				+ preferredDepartureTime + ", preferredArrivalTime=" + preferredArrivalTime + "]";
	}





	

	
    
	
	
	
    
}
