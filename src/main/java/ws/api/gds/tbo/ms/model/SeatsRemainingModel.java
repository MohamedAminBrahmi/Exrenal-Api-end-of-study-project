package ws.api.gds.tbo.ms.model;

 

 
public class SeatsRemainingModel {
	private Boolean belowMinimum;
	private Integer number;
 
	public SeatsRemainingModel(Boolean belowMinimum, Integer number) {
		super();
		this.belowMinimum = belowMinimum;
		this.number = number;
	}

	public Boolean getBelowMinimum() {
		return belowMinimum;
	}

	public void setBelowMinimum(Boolean belowMinimum) {
		this.belowMinimum = belowMinimum;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public SeatsRemainingModel() {
		super();
	}

}
