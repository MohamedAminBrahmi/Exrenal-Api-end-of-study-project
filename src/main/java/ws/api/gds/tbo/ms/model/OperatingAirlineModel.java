package ws.api.gds.tbo.ms.model;

public class OperatingAirlineModel {

	private String code;
	private String equipment;
	private String flightNumber;

 

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public OperatingAirlineModel() {
		super();
	}

	public OperatingAirlineModel(String code, String equipment, String flightNumber) {
		super();
		this.code = code;
		this.equipment = equipment;
		this.flightNumber = flightNumber;
	}

	

}
