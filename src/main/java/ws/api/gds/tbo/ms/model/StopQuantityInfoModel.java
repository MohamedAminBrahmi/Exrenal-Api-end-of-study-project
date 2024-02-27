package ws.api.gds.tbo.ms.model;
 
public class StopQuantityInfoModel {

	private String arrivalDateTime;
	private String departureDateTime;
	private Integer duration;
	private String locationCode;
	private String stopOverEquipment;

 

	public StopQuantityInfoModel(String arrivalDateTime, String departureDateTime, Integer duration,
			String locationCode, String stopOverEquipment) {
		super();
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
		this.duration = duration;
		this.locationCode = locationCode;
		this.stopOverEquipment = stopOverEquipment;
	}

	public String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getStopOverEquipment() {
		return stopOverEquipment;
	}

	public void setStopOverEquipment(String stopOverEquipment) {
		this.stopOverEquipment = stopOverEquipment;
	}

	public StopQuantityInfoModel() {
		super();
	}

}
