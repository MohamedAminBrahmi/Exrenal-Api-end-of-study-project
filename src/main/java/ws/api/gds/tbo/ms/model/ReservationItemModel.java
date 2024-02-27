package ws.api.gds.tbo.ms.model;
 
import java.util.List;
 
 

public class ReservationItemModel {

	private String airEquipmentType;
	private String airlinePNR;
	private String arrivalAirportLocationCode;
	private String arrivalAirportLocation;
	private String arrivalDateTime;
	private String arrivalTerminal;
	private String baggage;
	private String cabinClassText;
	private String departureAirportLocationCode;
	private String departureAirportLocation;
	private String departureDateTime;
	private String departureTerminal;
	private String flightNumber;
	private Integer itemRPH;
	private String journeyDuration;
	private String duration;
	private String marketingAirlineCode;
	private String marketingAirline;
	private Integer numberInParty;
	private String operatingAirlineCode;
	private String resBookDesigCode;
	private String resBookDesigText;
	private Integer stopQuantity;
	private List<StopQuantityInfoModel> stopQuantityInformations;
	private String airlineReservationCode;
	private String baggAllowINF;
 

	 	public ReservationItemModel() {
		super();
	}

	public ReservationItemModel(String airEquipmentType, String airlinePNR, String arrivalAirportLocationCode,
			String arrivalDateTime, String arrivalTerminal, String baggage, String cabinClassText,
			String departureAirportLocationCode, String departureDateTime, String departureTerminal,
			String flightNumber, Integer itemRPH, String journeyDuration, String marketingAirlineCode,
			Integer numberInParty, String operatingAirlineCode, String resBookDesigCode, String resBookDesigText,
			Integer stopQuantity, List<StopQuantityInfoModel> stopQuantityInformations) {
		super();
		this.airEquipmentType = airEquipmentType;
		this.airlinePNR = airlinePNR;
		this.arrivalAirportLocationCode = arrivalAirportLocationCode;
		this.arrivalDateTime = arrivalDateTime;
		this.arrivalTerminal = arrivalTerminal;
		this.baggage = baggage;
		this.cabinClassText = cabinClassText;
		this.departureAirportLocationCode = departureAirportLocationCode;
		this.departureDateTime = departureDateTime;
		this.departureTerminal = departureTerminal;
		this.flightNumber = flightNumber;
		this.itemRPH = itemRPH;
		this.journeyDuration = journeyDuration;
		this.marketingAirlineCode = marketingAirlineCode;
		this.numberInParty = numberInParty;
		this.operatingAirlineCode = operatingAirlineCode;
		this.resBookDesigCode = resBookDesigCode;
		this.resBookDesigText = resBookDesigText;
		this.stopQuantity = stopQuantity;
		this.stopQuantityInformations = stopQuantityInformations;
	}

	 

	public String getAirEquipmentType() {
		return airEquipmentType;
	}

	public void setAirEquipmentType(String airEquipmentType) {
		this.airEquipmentType = airEquipmentType;
	}

	public String getAirlinePNR() {
		return airlinePNR;
	}

	public void setAirlinePNR(String airlinePNR) {
		this.airlinePNR = airlinePNR;
	}

	public String getArrivalAirportLocationCode() {
		return arrivalAirportLocationCode;
	}

	public void setArrivalAirportLocationCode(String arrivalAirportLocationCode) {
		this.arrivalAirportLocationCode = arrivalAirportLocationCode;
	}

	public String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public String getArrivalTerminal() {
		return arrivalTerminal;
	}

	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getCabinClassText() {
		return cabinClassText;
	}

	public void setCabinClassText(String cabinClassText) {
		this.cabinClassText = cabinClassText;
	}

	public String getDepartureAirportLocationCode() {
		return departureAirportLocationCode;
	}

	public void setDepartureAirportLocationCode(String departureAirportLocationCode) {
		this.departureAirportLocationCode = departureAirportLocationCode;
	}

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public String getDepartureTerminal() {
		return departureTerminal;
	}

	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Integer getItemRPH() {
		return itemRPH;
	}

	public void setItemRPH(Integer itemRPH) {
		this.itemRPH = itemRPH;
	}

	public String getJourneyDuration() {
		return journeyDuration;
	}

	public void setJourneyDuration(String journeyDuration) {
		this.journeyDuration = journeyDuration;
	}

	public String getMarketingAirlineCode() {
		return marketingAirlineCode;
	}

	public void setMarketingAirlineCode(String marketingAirlineCode) {
		this.marketingAirlineCode = marketingAirlineCode;
	}

	public Integer getNumberInParty() {
		return numberInParty;
	}

	public void setNumberInParty(Integer numberInParty) {
		this.numberInParty = numberInParty;
	}

	public String getOperatingAirlineCode() {
		return operatingAirlineCode;
	}

	public void setOperatingAirlineCode(String operatingAirlineCode) {
		this.operatingAirlineCode = operatingAirlineCode;
	}

	public String getResBookDesigCode() {
		return resBookDesigCode;
	}

	public void setResBookDesigCode(String resBookDesigCode) {
		this.resBookDesigCode = resBookDesigCode;
	}

	public String getResBookDesigText() {
		return resBookDesigText;
	}

	public void setResBookDesigText(String resBookDesigText) {
		this.resBookDesigText = resBookDesigText;
	}

	public Integer getStopQuantity() {
		return stopQuantity;
	}

	public void setStopQuantity(Integer stopQuantity) {
		this.stopQuantity = stopQuantity;
	}

	public List<StopQuantityInfoModel> getStopQuantityInformations() {
		return stopQuantityInformations;
	}

	public void setStopQuantityInformations(List<StopQuantityInfoModel> stopQuantityInformations) {
		this.stopQuantityInformations = stopQuantityInformations;
	}

	public String getMarketingAirline() {
		return marketingAirline;
	}

	public void setMarketingAirline(String marketingAirline) {
		this.marketingAirline = marketingAirline;
	}

	public String getDepartureAirportLocation() {
		return departureAirportLocation;
	}

	public void setDepartureAirportLocation(String departureAirportLocation) {
		this.departureAirportLocation = departureAirportLocation;
	}

	public String getArrivalAirportLocation() {
		return arrivalAirportLocation;
	}

	public void setArrivalAirportLocation(String arrivalAirportLocation) {
		this.arrivalAirportLocation = arrivalAirportLocation;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getAirlineReservationCode() {
		return airlineReservationCode;
	}

	public void setAirlineReservationCode(String airlineReservationCode) {
		this.airlineReservationCode = airlineReservationCode;
	}

	public String getBaggAllowINF() {
		return baggAllowINF;
	}

	public void setBaggAllowINF(String baggAllowINF) {
		this.baggAllowINF = baggAllowINF;
	}

}
