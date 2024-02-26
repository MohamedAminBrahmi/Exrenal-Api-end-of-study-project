package ws.api.gds.tbo.ms.model;


public class BaggageInfoModel {

	private String arrival;
	private String baggage;
	private String departure;
	private String flightNo;
	private String aireline;

	 
	public BaggageInfoModel(String arrival, String baggage, String departure, String flightNo) {
		super();
		this.arrival = arrival;
		this.baggage = baggage;
		this.departure = departure;
		this.flightNo = flightNo;
	}

	public BaggageInfoModel() {
		super();
	}
 
	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getAireline() {
		return aireline;
	}

	public void setAireline(String aireline) {
		this.aireline = aireline;
	}

	@Override
	protected BaggageInfoModel clone() throws CloneNotSupportedException {
		return (BaggageInfoModel) super.clone();
	}
}
