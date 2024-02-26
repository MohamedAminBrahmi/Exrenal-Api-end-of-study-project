package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TripDetailsResponseModel {
	private String type;
	private List<ErrorModel> errors;
	private List<String> specialMessage;
	private Boolean success;
	private String target;
	private String tktTimeLimit;
	private String etat;
	private TravelItineraryModel travelItinerary;
	private char typeError;// 'S' (Success == false) / 'V'( IsValid == False
							// )/ 'I' (travelItinerary = null)
	private String errorMessage;
	private FlightBookingModel flightBooking;
	private AirRevalidateResponseModel airRevalidateResponse;
	private String codeGds;
	private BigDecimal idGds;
	private Boolean isDomestic;
	private String officeIdPnr;
	private String modeReg;
	
	/************for ticketed Date from GDS**** import Pnr*******************/
	private Date ticketedDate;
	private String gmtValue;
	
	private String officeIdTkt;
	private String tktDate;
 
	public TripDetailsResponseModel(char typeError) {
		super();
		this.typeError = typeError;
	}

 

	public TripDetailsResponseModel(List<ErrorModel> errors, List<String> specialMessage, Boolean success,
			String target, TravelItineraryModel travelItinerary) {
		super();
		this.errors = errors;
		this.specialMessage = specialMessage;
		this.success = success;
		this.target = target;
		this.travelItinerary = travelItinerary;
	}

	public TripDetailsResponseModel() {
		super();
	}
 

	public TripDetailsResponseModel(boolean success) {
		this.success = success;
	}
 

	public TripDetailsResponseModel(String error) {
		this.errorMessage = error;
		this.success = false;
		this.typeError = 'S';
	}

	public TripDetailsResponseModel(List<ErrorModel> errors) {
		this.errors = errors;
		this.success = false;
		this.typeError = 'S';
	}

	public TripDetailsResponseModel(String code, String message) {
		this.errors = new ArrayList<>();
		this.errors.add(new ErrorModel(code, message));
		this.errorMessage = message;
		this.success = false;
		this.typeError = 'S';
	}
  

	public List<ErrorModel> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorModel> errors) {
		this.errors = errors;
	}

	public List<String> getSpecialMessage() {
		return specialMessage;
	}

	public void setSpecialMessage(List<String> specialMessage) {
		this.specialMessage = specialMessage;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public TravelItineraryModel getTravelItinerary() {
		return travelItinerary;
	}

	public void setTravelItinerary(TravelItineraryModel travelItinerary) {
		this.travelItinerary = travelItinerary;
	}

	public String getTktTimeLimit() {
		return tktTimeLimit;
	}

	public void setTktTimeLimit(String tktTimeLimit) {
		this.tktTimeLimit = tktTimeLimit;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public char getTypeError() {
		return typeError;
	}

	public void setTypeError(char typeError) {
		this.typeError = typeError;
	}

	public FlightBookingModel getFlightBooking() {
		return flightBooking;
	}

	public void setFlightBooking(FlightBookingModel flightBooking) {
		this.flightBooking = flightBooking;
	}

	public AirRevalidateResponseModel getAirRevalidateResponse() {
		return airRevalidateResponse;
	}

	public void setAirRevalidateResponse(AirRevalidateResponseModel airRevalidateResponse) {
		this.airRevalidateResponse = airRevalidateResponse;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

 

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCodeGds() {
		return codeGds;
	}

	public void setCodeGds(String codeGds) {
		this.codeGds = codeGds;
	}

	

	public BigDecimal getIdGds() {
		return idGds;
	}

	public void setIdGds(BigDecimal idGds) {
		this.idGds = idGds;
	}

	public void formatResult() {
		if (travelItinerary != null) {
			travelItinerary.formatResult();
		}
	}

	@Override
	public String toString() {
		return "TripDetailsResponseModel [type=" + type + ", errors=" + errors + ", specialMessage=" + specialMessage
				+ ", success=" + success + ", target=" + target + ", tktTimeLimit=" + tktTimeLimit + ", etat=" + etat
				+ ", travelItinerary=" + travelItinerary + ", typeError=" + typeError + ", errorMessage=" + errorMessage
				+ ", flightBooking=" + flightBooking + ", airRevalidateResponse=" + airRevalidateResponse + ", codeGds="
				+ codeGds + ", idGds=" + idGds + "]";
	}

	public void setDuration(AirRevalidateResponseModel airRevalidateResponseModel) {
		if (codeGds.equals("AMA")) {
			FOR: for (ReservationItemModel reservationItem : this.travelItinerary.getItineraryInfo()
					.getReservationItems()) {
				for (OriginDestinationOptionModel originDestinationOption : airRevalidateResponseModel
						.getPricedItineraries().get(0).getOriginDestinationOptions()) {
					for (FlightSegmentModel flightSegment : originDestinationOption.getFlightSegment()) {
						if (reservationItem.getFlightNumber().equals(flightSegment.getFlightNumber())) {
							reservationItem.setDuration(flightSegment.getFligthDuration());
							reservationItem.setBaggage(flightSegment.getBaggage());
							reservationItem.setBaggAllowINF(flightSegment.getBaggAllowINF());
							continue FOR;
						}
					}
				}
			}
			try {
				this.setIsDomestic(airRevalidateResponseModel.getPricedItineraries().get(0).getIsDomestic());
			} catch (Exception e) {
				this.setIsDomestic(false);
			}
		} else {
			this.setIsDomestic(false);
		}

	}

	public void setAirRevalidateResponse(AirRevalidateResponseModel airRevalidateResponseModel,
			TripDetailsResponseModel tripDetailsResponse, FlightBookingModel flightBooking) {
		setAirRevalidateResponse(airRevalidateResponseModel);
		for (OriginDestinationOptionModel originDestinationOption : getAirRevalidateResponse().getPricedItineraries()
				.get(0).getOriginDestinationOptions()) {
			for (FlightSegmentModel flightSegment : originDestinationOption.getFlightSegment()) {
				flightSegment.setAirlinePnr(tripDetailsResponse.getTravelItinerary().getItineraryInfo()
						.getReservationItems().get(0).getAirlinePNR());
				flightSegment.setAirlineReservationCode(tripDetailsResponse.getTravelItinerary().getItineraryInfo()
						.getReservationItems().get(0).getAirlineReservationCode());
			}
		}

		for (PassengerFlightBookingModel passengerFlightBooking : flightBooking.getAdults()) {
			for (CustomerInfoModel customer : this.getTravelItinerary().getItineraryInfo().getCustomerInfos()) {
				if (customer.getCustomer().getPaxName().getPassengerFirstName().toUpperCase()
						.equals(passengerFlightBooking.getFirstName().toUpperCase())
						&& customer.getCustomer().getPaxName().getPassengerLastName().toUpperCase()
								.equals(passengerFlightBooking.getLastName().toUpperCase())) {

					if (passengerFlightBooking.getYyBirthDay() != null && passengerFlightBooking.getMmBirthDay() != null
							&& passengerFlightBooking.getDdBirthDay() != null) {
						customer.getCustomer().getPaxName()
								.setBirthDay(passengerFlightBooking.getYyBirthDay() + "-"
										+ passengerFlightBooking.getMmBirthDay() + "-"
										+ passengerFlightBooking.getDdBirthDay());
					}

					if (passengerFlightBooking.getYyExpiryDate() != null
							&& passengerFlightBooking.getMmExpiryDate() != null
							&& passengerFlightBooking.getDdExpiryDate() != null) {
						customer.getCustomer().getPaxName()
								.setExpiryDate(passengerFlightBooking.getYyExpiryDate() + "-"
										+ passengerFlightBooking.getMmExpiryDate() + "-"
										+ passengerFlightBooking.getDdExpiryDate());
					}

					customer.getCustomer().getPaxName().setPassportNumber(passengerFlightBooking.getPassportNumber());
					customer.getCustomer().getPaxName().setSexe(passengerFlightBooking.getSexe());
					customer.getCustomer().getPaxName().setMail(passengerFlightBooking.getMail());
					customer.getCustomer().getPaxName().setTel(passengerFlightBooking.getTel());
					customer.getCustomer().getPaxName().setNationality(passengerFlightBooking.getNationality());
					break;
				}
			}
		}

		setFlightBooking(flightBooking);

	}

	public Boolean getIsDomestic() {
		return isDomestic;
	}

	public void setIsDomestic(Boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	

	public String getOfficeIdPnr() {
		return officeIdPnr;
	}

	public void setOfficeIdPnr(String officeIdPnr) {
		this.officeIdPnr = officeIdPnr;
	}

	 

	public String getModeReg() {
		return modeReg;
	}

	public void setModeReg(String modeReg) {
		this.modeReg = modeReg;
	}

	public Date getTicketedDate() {
		return ticketedDate;
	}

	public void setTicketedDate(Date ticketedDate) {
		this.ticketedDate = ticketedDate;
	}

	public String getGmtValue() {
		return gmtValue;
	}

	public void setGmtValue(String gmtValue) {
		this.gmtValue = gmtValue;
	}

	

	public String getOfficeIdTkt() {
		return officeIdTkt;
	}

	public void setOfficeIdTkt(String officeIdTkt) {
		this.officeIdTkt = officeIdTkt;
	}

	public String getTktDate() {
		return tktDate;
	}

	public void setTktDate(String tktDate) {
		this.tktDate = tktDate;
	}

	
	
}
