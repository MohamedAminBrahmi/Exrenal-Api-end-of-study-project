package ws.api.gds.tbo.ms.model;


import java.util.List; 
 
public class FlightSegmentModel implements Cloneable {

	private String arrivalAirportLocation;
	private String arrivalAirportLocationCode;
	private String arrivalDateTime;
	private String arrivalDateModel;
	private String arrivalTimeModel;
	private String cabinClassCode;
	private String cabinClassText;
	private String departureAirportLocationCode;
	private String departureAirportLocation;
	private String departureDateTime;
	private String departureTimeModel;
	private String departureDateModel;
	private Boolean eticket;
	private String flightNumber;
	private Integer journeyDuration;
	private String fligthDuration;
	private String marketingAirlineCode;
	private String marketingAirline;
	private String marriageGroup;
	private String mealCode;
	private OperatingAirlineModel operatingAirline;
	private String resBookDesigCode;
	private String resBookDesigText;
	private SeatsRemainingModel seatsRemaining;
	private Integer stopQuantity;
	private StopQuantityInfoModel stopQuantityInfo;
	private List<StopQuantityInfoModel> stopQuantityInformations;
	private Boolean isReturn;
	private Boolean isStop;
	private String stopoverTime;
	private String seat;
	private String baggage;
	private String airlinePnr;

	private Character addProviderwarning;
	private String txtProviderwarning;
	private String txtProviderwarningA;
	private String equipment;

	private String airlineReservationCode;

	// NEsma needs
//	private FlightSegmentType nesmaFlightType;
//	private BookingClassType nesmaBookClass;
//	private FareInfoType nesmaFareInfo;
//	private PassengerTypeQuantityType nesmaPassengerType;
//	private String tripType;
	private String fareId;

	// AirArabia needs
	private String rph;

	// VRS
	private String classId;

	// TravelPort
	private String fareInfoRef;
	private String fareInfoValue;
	private String key;
	private int group;
	private String hostTokenRef;
	

	//private Baggage baggageAirArabia;
	
	private String baggAllowINF;

	 

	public FlightSegmentModel() {
		super();
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

	public String getCabinClassCode() {
		return cabinClassCode;
	}

	public void setCabinClassCode(String cabinClassCode) {
		this.cabinClassCode = cabinClassCode;
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

	public Boolean getEticket() {
		return eticket;
	}

	public void setEticket(Boolean eticket) {
		this.eticket = eticket;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Integer getJourneyDuration() {
		return journeyDuration;
	}

	public void setJourneyDuration(Integer journeyDuration) {
		this.journeyDuration = journeyDuration;
	}

	public String getMarketingAirlineCode() {
		return marketingAirlineCode;
	}

	public void setMarketingAirlineCode(String marketingAirlineCode) {
		this.marketingAirlineCode = marketingAirlineCode;
	}

	public String getMarriageGroup() {
		return marriageGroup;
	}

	public void setMarriageGroup(String marriageGroup) {
		this.marriageGroup = marriageGroup;
	}

	public String getMealCode() {
		return mealCode;
	}

	public void setMealCode(String mealCode) {
		this.mealCode = mealCode;
	}

	public OperatingAirlineModel getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(OperatingAirlineModel operatingAirline) {
		this.operatingAirline = operatingAirline;
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

	public SeatsRemainingModel getSeatsRemaining() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(SeatsRemainingModel seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	public Integer getStopQuantity() {
		return stopQuantity;
	}

	public void setStopQuantity(Integer stopQuantity) {
		this.stopQuantity = stopQuantity;
	}

	public StopQuantityInfoModel getStopQuantityInfo() {
		return stopQuantityInfo;
	}

	public void setStopQuantityInfo(StopQuantityInfoModel stopQuantityInfo) {
		this.stopQuantityInfo = stopQuantityInfo;
	}

	public List<StopQuantityInfoModel> getStopQuantityInformations() {
		return stopQuantityInformations;
	}

	public void setStopQuantityInformations(List<StopQuantityInfoModel> stopQuantityInformations) {
		this.stopQuantityInformations = stopQuantityInformations;
	}

	public String getArrivalDateModel() {
		return arrivalDateModel;
	}

	public void setArrivalDateModel(String arrivalDateModel) {
		this.arrivalDateModel = arrivalDateModel;
	}

	public String getArrivalTimeModel() {
		return arrivalTimeModel;
	}

	public void setArrivalTimeModel(String arrivalTimeModel) {
		this.arrivalTimeModel = arrivalTimeModel;
	}

	public String getDepartureTimeModel() {
		return departureTimeModel;
	}

	public void setDepartureTimeModel(String departureTimeModel) {
		this.departureTimeModel = departureTimeModel;
	}

	public String getDepartureDateModel() {
		return departureDateModel;
	}

	public void setDepartureDateModel(String departureDateModel) {
		this.departureDateModel = departureDateModel;
	}

	public String getFligthDuration() {
		return fligthDuration;
	}

	public void setFligthDuration(String fligthDuration) {
		this.fligthDuration = fligthDuration;
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

	public Boolean getIsReturn() {
		return isReturn;
	}

	public void setIsReturn(Boolean isReturn) {
		this.isReturn = isReturn;
	}

	public String getStopoverTime() {
		return stopoverTime;
	}

	public void setStopoverTime(String stopoverTime) {
		this.stopoverTime = stopoverTime;
	}

	public Boolean getIsStop() {
		return isStop;
	}

	public void setIsStop(Boolean isStop) {
		this.isStop = isStop;
	}

 

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getMarketingAirline() {
		return marketingAirline;
	}

	public void setMarketingAirline(String marketingAirline) {
		this.marketingAirline = marketingAirline;
	}

	public String getAirlinePnr() {
		return airlinePnr;
	}

	public void setAirlinePnr(String airlinePnr) {
		this.airlinePnr = airlinePnr;
	}

//	public FlightSegmentModel Clone() {
//		FlightSegmentModel flightModel= new FlightSegmentModel();
//
//		Field[] prop = this.getClass().getDeclaredFields(); 		//get all attribute in the class
//		for (Field field : prop) {										// loop throught every one and check if null set to empty
//			field.setAccessible(true);
//			field.set(flightModel, field.get(this));
//			field.setAccessible(false);
//		}
//		return flightModel;
//	}

	

	public Character getAddProviderwarning() {
		return addProviderwarning;
	}

	public void setAddProviderwarning(Character addProviderwarning) {
		this.addProviderwarning = addProviderwarning;
	}

	public String getTxtProviderwarning() {
		return txtProviderwarning;
	}

	public void setTxtProviderwarning(String txtProviderwarning) {
		this.txtProviderwarning = txtProviderwarning;
	}

	public String getTxtProviderwarningA() {
		return txtProviderwarningA;
	}

	public void setTxtProviderwarningA(String txtProviderwarningA) {
		this.txtProviderwarningA = txtProviderwarningA;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getAirlineReservationCode() {
		return airlineReservationCode;
	}

	public void setAirlineReservationCode(String airlineReservationCode) {
		this.airlineReservationCode = airlineReservationCode;
	}
 

	public String getFareId() {
		return fareId;
	}

	public void setFareId(String fareId) {
		this.fareId = fareId;
	}

	public String getRph() {
		return rph;
	}

	public void setRph(String rph) {
		this.rph = rph;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	 
	public String getFareInfoRef() {
		return fareInfoRef;
	}

	public void setFareInfoRef(String fareInfoRef) {
		this.fareInfoRef = fareInfoRef;
	}

	public String getFareInfoValue() {
		return fareInfoValue;
	}

	public void setFareInfoValue(String fareInfoValue) {
		this.fareInfoValue = fareInfoValue;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	
//	public Baggage getBaggageAirArabia() {
//		return baggageAirArabia;
//	}
//
//	public void setBaggageAirArabia(Baggage baggageAirArabia) {
//		this.baggageAirArabia = baggageAirArabia;
//	}

	public String getHostTokenRef() {
		return hostTokenRef;
	}

	public void setHostTokenRef(String hostTokenRef) {
		this.hostTokenRef = hostTokenRef;
	}

	public String getBaggAllowINF() {
		return baggAllowINF;
	}

	public void setBaggAllowINF(String baggAllowINF) {
		this.baggAllowINF = baggAllowINF;
	}




	@Override
	public String toString() {
		return "FlightSegmentModel [arrivalAirportLocation=" + arrivalAirportLocation + ", arrivalAirportLocationCode="
				+ arrivalAirportLocationCode + ", arrivalDateTime=" + arrivalDateTime + ", arrivalDateModel="
				+ arrivalDateModel + ", arrivalTimeModel=" + arrivalTimeModel + ", cabinClassCode=" + cabinClassCode
				+ ", cabinClassText=" + cabinClassText + ", departureAirportLocationCode="
				+ departureAirportLocationCode + ", departureAirportLocation=" + departureAirportLocation
				+ ", departureDateTime=" + departureDateTime + ", departureTimeModel=" + departureTimeModel
				+ ", departureDateModel=" + departureDateModel + ", eticket=" + eticket + ", flightNumber="
				+ flightNumber + ", journeyDuration=" + journeyDuration + ", fligthDuration=" + fligthDuration
				+ ", marketingAirlineCode=" + marketingAirlineCode + ", marketingAirline=" + marketingAirline
				+ ", marriageGroup=" + marriageGroup + ", mealCode=" + mealCode + ", operatingAirline="
				+ operatingAirline + ", resBookDesigCode=" + resBookDesigCode + ", resBookDesigText=" + resBookDesigText
				+ ", seatsRemaining=" + seatsRemaining + ", stopQuantity=" + stopQuantity + ", stopQuantityInfo="
				+ stopQuantityInfo + ", stopQuantityInformations=" + stopQuantityInformations + ", isReturn=" + isReturn
				+ ", isStop=" + isStop + ", stopoverTime=" + stopoverTime + ", seat=" + seat + ", baggage=" + baggage
				+ ", airlinePnr=" + airlinePnr + ", addProviderwarning=" + addProviderwarning + ", txtProviderwarning="
				+ txtProviderwarning + ", txtProviderwarningA=" + txtProviderwarningA + ", equipment=" + equipment
				+ ", airlineReservationCode=" + airlineReservationCode + ", fareId=" + fareId + ", rph=" + rph
				+ ", classId=" + classId + ", fareInfoRef=" + fareInfoRef + ", fareInfoValue=" + fareInfoValue
				+ ", key=" + key + ", group=" + group + ", hostTokenRef=" + hostTokenRef + ", baggAllowINF="
				+ baggAllowINF + "]";
	}

}
