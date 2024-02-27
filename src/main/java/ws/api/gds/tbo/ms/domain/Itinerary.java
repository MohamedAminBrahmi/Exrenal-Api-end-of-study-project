package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Itinerary {
	@JsonProperty("IsHoldEligibleForLcc") 
	private boolean isHoldEligibleForLcc;
    @JsonProperty("Segments") 
    private ArrayList<Segments> segments;
    
    
	public Itinerary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Itinerary(boolean isHoldEligibleForLcc, ArrayList<Segments> segments) {
		this.isHoldEligibleForLcc = isHoldEligibleForLcc;
		this.segments = segments;
	}
	public boolean isHoldEligibleForLcc() {
		return isHoldEligibleForLcc;
	}
	public void setHoldEligibleForLcc(boolean isHoldEligibleForLcc) {
		this.isHoldEligibleForLcc = isHoldEligibleForLcc;
	}
	public ArrayList<Segments> getSegments() {
		return segments;
	}
	public void setSegments(ArrayList<Segments> segments) {
		this.segments = segments;
	}
	@Override
	public String toString() {
		return "Itinerary [isHoldEligibleForLcc=" + isHoldEligibleForLcc + ", segments=" + segments + "]";
	}
    
    

}
