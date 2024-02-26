package ws.api.gds.tbo.ms.model;
 

public class PricerCalendarCase {

	private String price;
	private String goingsDt;
	private String comingsDt;
	private String airlineCode;

	public PricerCalendarCase() {
		super();
	}

	public PricerCalendarCase(String price, String goingsDt, String comingsDt, String airlineCode) {
		super();
		this.price = price;
		this.goingsDt = goingsDt;
		this.comingsDt = comingsDt;
		this.airlineCode = airlineCode;
	}

	public PricerCalendarCase(String goingsDt, String comingsDt) {
		this.goingsDt = goingsDt;
		this.comingsDt = comingsDt;
	}
	public PricerCalendarCase(PricerCalendarCase pricerCalendarCase) {
		this.price = pricerCalendarCase.getPrice();
		this.goingsDt = pricerCalendarCase.getGoingsDt();
		this.comingsDt = pricerCalendarCase.getComingsDt();
		this.airlineCode = pricerCalendarCase.getAirlineCode();
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGoingsDt() {
		return goingsDt;
	}

	public void setGoingsDt(String goingsDt) {
		this.goingsDt = goingsDt;
	}

	public String getComingsDt() {
		return comingsDt;
	}

	public void setComingsDt(String comingsDt) {
		this.comingsDt = comingsDt;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	@Override
	public String toString() {
		return "PricerCalendarCase [price=" + price + ", goingsDt=" + goingsDt + ", comingsDt=" + comingsDt
				+ ", airlineCode=" + airlineCode + "]";
	}

}
