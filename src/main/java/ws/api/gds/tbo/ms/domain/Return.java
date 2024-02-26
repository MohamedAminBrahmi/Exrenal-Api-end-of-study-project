package ws.api.gds.tbo.ms.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Return {
	
	@JsonProperty("Code") 
	private String code;
    @JsonProperty("Description") 
    private int description;
    @JsonProperty("Price") 
    private double price;
    @JsonProperty("Weight") 
    private int weight;
    @JsonProperty("Text") 
    private String text;
    @JsonProperty("WayTypeField") 
    private int wayTypeField;
    @JsonProperty("Origin") 
    private String origin;
    @JsonProperty("Destination") 
    private String destination;
    @JsonProperty("Currency") 
    private String currency;
    @JsonProperty("FlightNumber") 
    private String flightNumber;
    @JsonProperty("DepartureTime") 
    private Date departureTime;
    @JsonProperty("AirlineCode") 
    private String airlineCode;
    @JsonProperty("BaggageKey") 
    private Object baggageKey;
    @JsonProperty("AirlineDescription") 
    private String airlineDescription;
    @JsonProperty("Quantity") 
    private int quantity;
    @JsonProperty("MealKey") 
    private Object mealKey;
	public Return() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Return(String code, int description, double price, int weight, String text, int wayTypeField, String origin,
			String destination, String currency, String flightNumber, Date departureTime, String airlineCode,
			Object baggageKey, String airlineDescription, int quantity, Object mealKey) {
		this.code = code;
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.text = text;
		this.wayTypeField = wayTypeField;
		this.origin = origin;
		this.destination = destination;
		this.currency = currency;
		this.flightNumber = flightNumber;
		this.departureTime = departureTime;
		this.airlineCode = airlineCode;
		this.baggageKey = baggageKey;
		this.airlineDescription = airlineDescription;
		this.quantity = quantity;
		this.mealKey = mealKey;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getWayTypeField() {
		return wayTypeField;
	}
	public void setWayTypeField(int wayTypeField) {
		this.wayTypeField = wayTypeField;
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public String getAirlineCode() {
		return airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	public Object getBaggageKey() {
		return baggageKey;
	}
	public void setBaggageKey(Object baggageKey) {
		this.baggageKey = baggageKey;
	}
	public String getAirlineDescription() {
		return airlineDescription;
	}
	public void setAirlineDescription(String airlineDescription) {
		this.airlineDescription = airlineDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Object getMealKey() {
		return mealKey;
	}
	public void setMealKey(Object mealKey) {
		this.mealKey = mealKey;
	}
	@Override
	public String toString() {
		return "Return [code=" + code + ", description=" + description + ", price=" + price + ", weight=" + weight
				+ ", text=" + text + ", wayTypeField=" + wayTypeField + ", origin=" + origin + ", destination="
				+ destination + ", currency=" + currency + ", flightNumber=" + flightNumber + ", departureTime="
				+ departureTime + ", airlineCode=" + airlineCode + ", baggageKey=" + baggageKey
				+ ", airlineDescription=" + airlineDescription + ", quantity=" + quantity + ", mealKey=" + mealKey
				+ "]";
	}
    
    

}
