package ws.api.gds.tbo.ms.model; 

import java.util.List;

    

public class AirRevalidateResponseModel {

	private List<ErrorModel> errors;
	private Boolean isValid;
	private List<PricedItineraryModel> pricedItineraries;
	private Boolean success;
//	private Target target;
	private String airelines;
	private String departureCity;
	private String destinationCity;
	private String denierVol;
	private List<ExtraServicesModel> extraServices;
	private List<List<ExtraServicesModel>> extraServicess;
	private List<String> rules;
	private char erreurType;
	private Boolean extrPerGroup;
	private String tierCurrency;
	private String customerCharge;
	private char cabinClass;
	private String warningMsg;
	
	private AvailabilityRules availabilityRules;
 

	public AirRevalidateResponseModel() {
		super();
	}
	
	


	public AirRevalidateResponseModel(List<ErrorModel> errors, Boolean isValid,
			List<PricedItineraryModel> pricedItineraries, Boolean success, String airelines, String departureCity,
			String destinationCity, String denierVol, List<ExtraServicesModel> extraServices,
			List<List<ExtraServicesModel>> extraServicess, List<String> rules, char erreurType, Boolean extrPerGroup,
			String tierCurrency, String customerCharge, char cabinClass, String warningMsg,
			AvailabilityRules availabilityRules) {
		this.errors = errors;
		this.isValid = isValid;
		this.pricedItineraries = pricedItineraries;
		this.success = success;
		this.airelines = airelines;
		this.departureCity = departureCity;
		this.destinationCity = destinationCity;
		this.denierVol = denierVol;
		this.extraServices = extraServices;
		this.extraServicess = extraServicess;
		this.rules = rules;
		this.erreurType = erreurType;
		this.extrPerGroup = extrPerGroup;
		this.tierCurrency = tierCurrency;
		this.customerCharge = customerCharge;
		this.cabinClass = cabinClass;
		this.warningMsg = warningMsg;
		this.availabilityRules = availabilityRules;
	}




	public List<ErrorModel> getErrors() {
		return errors;
	}


	public void setErrors(List<ErrorModel> errors) {
		this.errors = errors;
	}


	public Boolean getIsValid() {
		return isValid;
	}


	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}


	public List<PricedItineraryModel> getPricedItineraries() {
		return pricedItineraries;
	}


	public void setPricedItineraries(List<PricedItineraryModel> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}


	public Boolean getSuccess() {
		return success;
	}


	public void setSuccess(Boolean success) {
		this.success = success;
	}


	public String getAirelines() {
		return airelines;
	}


	public void setAirelines(String airelines) {
		this.airelines = airelines;
	}


	public String getDepartureCity() {
		return departureCity;
	}


	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}


	public String getDestinationCity() {
		return destinationCity;
	}


	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}


	public String getDenierVol() {
		return denierVol;
	}


	public void setDenierVol(String denierVol) {
		this.denierVol = denierVol;
	}


	public List<ExtraServicesModel> getExtraServices() {
		return extraServices;
	}


	public void setExtraServices(List<ExtraServicesModel> extraServices) {
		this.extraServices = extraServices;
	}


	public List<List<ExtraServicesModel>> getExtraServicess() {
		return extraServicess;
	}


	public void setExtraServicess(List<List<ExtraServicesModel>> extraServicess) {
		this.extraServicess = extraServicess;
	}


	public List<String> getRules() {
		return rules;
	}


	public void setRules(List<String> rules) {
		this.rules = rules;
	}


	public char getErreurType() {
		return erreurType;
	}


	public void setErreurType(char erreurType) {
		this.erreurType = erreurType;
	}


	public Boolean getExtrPerGroup() {
		return extrPerGroup;
	}


	public void setExtrPerGroup(Boolean extrPerGroup) {
		this.extrPerGroup = extrPerGroup;
	}


	public String getTierCurrency() {
		return tierCurrency;
	}


	public void setTierCurrency(String tierCurrency) {
		this.tierCurrency = tierCurrency;
	}


	public String getCustomerCharge() {
		return customerCharge;
	}


	public void setCustomerCharge(String customerCharge) {
		this.customerCharge = customerCharge;
	}


	public char getCabinClass() {
		return cabinClass;
	}


	public void setCabinClass(char cabinClass) {
		this.cabinClass = cabinClass;
	}


	public String getWarningMsg() {
		return warningMsg;
	}


	public void setWarningMsg(String warningMsg) {
		this.warningMsg = warningMsg;
	}


	public AvailabilityRules getAvailabilityRules() {
		return availabilityRules;
	}


	public void setAvailabilityRules(AvailabilityRules availabilityRules) {
		this.availabilityRules = availabilityRules;
	}


	@Override
	public String toString() {
		return "AirRevalidateResponseModel [errors=" + errors + ", isValid=" + isValid + ", pricedItineraries="
				+ pricedItineraries + ", success=" + success + ", airelines=" + airelines + ", departureCity="
				+ departureCity + ", destinationCity=" + destinationCity + ", denierVol=" + denierVol
				+ ", extraServices=" + extraServices + ", extraServicess=" + extraServicess + ", rules=" + rules
				+ ", erreurType=" + erreurType + ", extrPerGroup=" + extrPerGroup + ", tierCurrency=" + tierCurrency
				+ ", customerCharge=" + customerCharge + ", cabinClass=" + cabinClass + ", warningMsg=" + warningMsg
				+ ", availabilityRules=" + availabilityRules + "]";
	}

	

}
