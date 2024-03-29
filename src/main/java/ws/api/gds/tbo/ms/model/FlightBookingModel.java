package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

  
//import com.worldsoft.wega.onepoint.model.TripDetailsResponseModel;

public class FlightBookingModel {
	private String fareSourceCode;
	private List<PassengerFlightBookingModel> adults;
	private List<PassengerFlightBookingModel> childs;
	private List<PassengerFlightBookingModel> infants;
	private List<PassengerFlightBookingModel> students;
	private List<PassengerFlightBookingModel> seniors;
	private List<PassengerFlightBookingModel> seamans;
	private List<BigDecimalStringModel> tiersFils;
	private List<String> extraServices;
	private String areaCode;
	private String countryCode;
	private String email;
	private String tel;
	private String phoneNumber;
	private String postCode;
	private String promoCode;
	private String customerCharge;
	private String currencyClient;
	private String bagage;
	private int currency;
	private PricedItineraryModel pricedItinerary;
	private String piloteId;
	private String fp;
	private BigDecimal commissionPercentage;
	private BigDecimal idTiers;
	//private RefTiers refTiers;
	private String codePromo;
	private String tmpRemarque;
	private String modeReg;
	private Character typeTel;
	private String countryTel;
	private String indPaysTel;

	///// TOUR CODE /////
	private String tourCode;
	private String actifTC;
	private String fareType;
	private String refund;
	
	private String ticketStatus;
	private String orderId;
	
	private AppAgenceCommissionModel commission;
	// For MR
	private String payModes;
	
	private RuleGdsCommissionModel appliedRule;
	private BigDecimal commissionAmount;
	
	
	//for AirArabia Baggage
	//private NewPriceAirArabiaModel baggageAirArabia;
	
	private char typeVol;
	private GdsSessionModel gdsModel;
	
	//for TBO air
	private String resultId;
	private String trackingId;
	private List<FareRulesResponseModel> fareRules;


	public FlightBookingModel(List<PassengerFlightBookingModel> adults, List<PassengerFlightBookingModel> childs,
			List<PassengerFlightBookingModel> infants) {
		super();
		this.adults = adults;
		this.childs = childs;
		this.infants = infants;
	}

	public FlightBookingModel() {
		super();
		adults = new ArrayList<PassengerFlightBookingModel>();
		childs = new ArrayList<PassengerFlightBookingModel>();
		infants = new ArrayList<PassengerFlightBookingModel>();
	}

	public FlightBookingModel(PricedItineraryModel pricedItinerary) {
		adults = new ArrayList<PassengerFlightBookingModel>();
		childs = new ArrayList<PassengerFlightBookingModel>();
		infants = new ArrayList<PassengerFlightBookingModel>();
		students = new ArrayList<PassengerFlightBookingModel>();
		seniors = new ArrayList<PassengerFlightBookingModel>();
		seamans = new ArrayList<PassengerFlightBookingModel>();
		this.customerCharge = "0";
		for (PTCFareBreakdownModel fareBreakdown : pricedItinerary.getAirItineraryPricingInfos().get(0)
				.getPtcFareBreakdowns()) {
			for (int i = 0; i < fareBreakdown.getPassengerTypeQuantity().getQuantity(); i++) {
				System.out.println("=======> " + fareBreakdown.getPassengerTypeQuantity().getCode());
				switch (fareBreakdown.getPassengerTypeQuantity().getCode()) {

				case "ADT":
					// this use case added by Amor for nesma Airlines
				case "ADLT":
				case "AD":
					adults.add(new PassengerFlightBookingModel());
					break;
					// this use case added by Amor for nesma Airlines
					// theses 3 cases do the same work;
				case "CHLD":	
				case "CHD":
				case "CH":
					childs.add(new PassengerFlightBookingModel());
					break;
				case "INF":
				case "IN":
					infants.add(new PassengerFlightBookingModel());
					break;

				case "SEA":
					seamans.add(new PassengerFlightBookingModel());
					break;

				case "SRC":
					seniors.add(new PassengerFlightBookingModel());
					break;

				case "STU":
					students.add(new PassengerFlightBookingModel());
					break;

				default:
					break;
				}
			}
		}
		
		try {
			switch (pricedItinerary.getOriginDestinationOptions().size()) {

			case 1:
				this.typeVol = 'O';
				break;
			case 2:
				System.out.println("ROUND TRIP");
				int sizeOD1 = pricedItinerary.getOriginDestinationOptions().get(0).getFlightSegment().size() - 1;
				int sizeOD2 = pricedItinerary.getOriginDestinationOptions().get(1).getFlightSegment().size() - 1;
				this.typeVol = (pricedItinerary.getOriginDestinationOptions().get(0).getFlightSegment().get(0)
						.getDepartureAirportLocationCode()
						.equals(pricedItinerary.getOriginDestinationOptions().get(1).getFlightSegment().get(sizeOD2)
								.getArrivalAirportLocationCode()))
						&& (pricedItinerary.getOriginDestinationOptions().get(0).getFlightSegment().get(sizeOD1)
								.getArrivalAirportLocationCode().equals(pricedItinerary.getOriginDestinationOptions()
										.get(1).getFlightSegment().get(0).getDepartureAirportLocationCode())) ? 'R' : 'M';
				break;
			default:
				this.typeVol = 'M';
				break;
			}
		} catch (Exception e) {
			System.err.println("---> SET FLIGHT TYPE ERROR");
		}

	}

	public FlightBookingModel(TripDetailsResponseModel tripDetailsResponse) {

		this.adults = new ArrayList<>();
		this.childs = new ArrayList<>();
		this.infants = new ArrayList<>();
		this.seamans = new ArrayList<>();
		this.seniors = new ArrayList<>();
		this.students = new ArrayList<>();
		if (tripDetailsResponse != null) {
			if (tripDetailsResponse.getTravelItinerary() != null) {
				if (tripDetailsResponse.getTravelItinerary().getItineraryInfo() != null) {
					if (tripDetailsResponse.getTravelItinerary().getItineraryInfo().getCustomerInfos() != null) {
						if (tripDetailsResponse.getTravelItinerary().getItineraryInfo().getCustomerInfos().size() > 0) {
							for (CustomerInfoModel customerInfo : tripDetailsResponse.getTravelItinerary()
									.getItineraryInfo().getCustomerInfos()) {
								System.out.println(customerInfo.getCustomer());
								switch (customerInfo.getCustomer().getPassengerType()) {
								case "ADT":
									this.adults.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "CHD":
									this.childs.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "CH":
									this.childs.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "INF":
									this.infants.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "IN":
									this.infants.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "SRC":
									this.seniors.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "STU":
									this.students.add(new PassengerFlightBookingModel(customerInfo));
									break;
								case "SEA":
									this.seamans.add(new PassengerFlightBookingModel(customerInfo));
									break;

								default:
									break;
								}

							}
						}
					}
				}
			}
		}

		System.out.println("adults " + this.adults);
		System.out.println("childs " + this.childs);
		System.out.println("infants " + this.infants);
		System.out.println("seamans " + this.seamans);
		System.out.println("seniors " + this.seniors);
		System.out.println("students " + this.students);

	}

 
	 
	public List<PassengerFlightBookingModel> getAdults() {
		return adults;
	}

	public void setAdults(List<PassengerFlightBookingModel> adults) {
		this.adults = adults;
	}

	public List<PassengerFlightBookingModel> getChilds() {
		return childs;
	}

	public void setChilds(List<PassengerFlightBookingModel> childs) {
		this.childs = childs;
	}

	public List<PassengerFlightBookingModel> getInfants() {
		return infants;
	}

	public void setInfants(List<PassengerFlightBookingModel> infants) {
		this.infants = infants;
	}

	public String getFareSourceCode() {
		return fareSourceCode;
	}

	public void setFareSourceCode(String fareSourceCode) {
		this.fareSourceCode = fareSourceCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public String getCustomerCharge() {
		return customerCharge;
	}

	public void setCustomerCharge(String customerCharge) {
		this.customerCharge = customerCharge;
	}

	public String getCurrencyClient() {
		return currencyClient;
	}

	public void setCurrencyClient(String currencyClient) {
		this.currencyClient = currencyClient;
	}

	public String getBagage() {
		return bagage;
	}

	public void setBagage(String bagage) {
		this.bagage = bagage;
	}

	public int getCurrency() {
		return currency;
	}

	public void setCurrency(int currency) {
		this.currency = currency;
	}

	public List<String> getExtraServices() {
		return extraServices;
	}

	public void setExtraServices(List<String> extraServices) {
		this.extraServices = extraServices;
	}

	public PricedItineraryModel getPricedItinerary() {
		return pricedItinerary;
	}

	public void setPricedItinerary(PricedItineraryModel pricedItinerary) {
		this.pricedItinerary = pricedItinerary;
	}

	public List<PassengerFlightBookingModel> getStudents() {
		return students;
	}

	public void setStudents(List<PassengerFlightBookingModel> students) {
		this.students = students;
	}

	public List<PassengerFlightBookingModel> getSeniors() {
		return seniors;
	}

	public void setSeniors(List<PassengerFlightBookingModel> seniors) {
		this.seniors = seniors;
	}

	public List<PassengerFlightBookingModel> getSeamans() {
		return seamans;
	}

	public void setSeamans(List<PassengerFlightBookingModel> seamans) {
		this.seamans = seamans;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "FlightBookingModel [fareSourceCode=" + fareSourceCode + ", adults=" + adults + ", childs=" + childs
				+ ", infants=" + infants + ", students=" + students + ", seniors=" + seniors + ", seamans=" + seamans
				+ ", tiersFils=" + tiersFils + ", extraServices=" + extraServices + ", areaCode=" + areaCode
				+ ", countryCode=" + countryCode + ", email=" + email + ", tel=" + tel + ", phoneNumber=" + phoneNumber
				+ ", postCode=" + postCode + ", promoCode=" + promoCode + ", customerCharge=" + customerCharge
				+ ", currencyClient=" + currencyClient + ", bagage=" + bagage + ", currency=" + currency
				+ ", pricedItinerary=" + pricedItinerary + ", piloteId=" + piloteId + ", fp=" + fp
				+ ", commissionPercentage=" + commissionPercentage + ", idTiers=" + idTiers 
				//+ ", refTiers=" + refTiers
				+ ", codePromo=" + codePromo + ", tmpRemarque=" + tmpRemarque + ", modeReg=" + modeReg + ", typeTel="
				+ typeTel + ", countryTel=" + countryTel + ", indPaysTel=" + indPaysTel + ", tourCode=" + tourCode
				+ ", actifTC=" + actifTC + ", fareType=" + fareType + ", refund=" + refund + ", ticketStatus="
				+ ticketStatus + ", orderId=" + orderId + ", commission=" + commission + "]";
	}

	public String getFp() {
		return fp;
	}

	public void setFp(String fp) {
		this.fp = fp;
	}

	public String getPiloteId() {
		return piloteId;
	}

	public void setPiloteId(String piloteId) {
		this.piloteId = piloteId;
	}

	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

	public List<BigDecimalStringModel> getTiersFils() {
		return tiersFils;
	}

	public void setTiersFils(List<BigDecimalStringModel> tiersFils) {
		this.tiersFils = tiersFils;
	}

	public BigDecimal getIdTiers() {
		return idTiers;
	}

	public void setIdTiers(BigDecimal idTiers) {
		this.idTiers = idTiers;
	}

//	public RefTiers getRefTiers() {
//		return refTiers;
//	}
//
//	public void setRefTiers(RefTiers refTiers) {
//		this.refTiers = refTiers;
//	}

	public String getCodePromo() {
		return codePromo;
	}

	public void setCodePromo(String codePromo) {
		this.codePromo = codePromo;
	}

	public String getTmpRemarque() {
		return tmpRemarque;
	}

	public void setTmpRemarque(String tmpRemarque) {
		this.tmpRemarque = tmpRemarque;
	}

	public String getModeReg() {
		return modeReg;
	}

	public void setModeReg(String modeReg) {
		this.modeReg = modeReg;
	}

	public Character getTypeTel() {
		return typeTel;
	}

	public void setTypeTel(Character typeTel) {
		this.typeTel = typeTel;
	}

	public String getCountryTel() {
		return countryTel;
	}

	public void setCountryTel(String countryTel) {
		this.countryTel = countryTel;
	}

	public String getIndPaysTel() {
		return indPaysTel;
	}

	public void setIndPaysTel(String indPaysTel) {
		this.indPaysTel = indPaysTel;
	}

	public String getTourCode() {
		return tourCode;
	}

	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}

	public String getActifTC() {
		return actifTC;
	}

	public void setActifTC(String actifTC) {
		this.actifTC = actifTC;
	}

	public AppAgenceCommissionModel getCommission() {
		return commission;
	}

	public void setCommission(AppAgenceCommissionModel commission) {
		this.commission = commission;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayModes() {
		return payModes;
	}

	public void setPayModes(String payModes) {
		this.payModes = payModes;
	}

	public RuleGdsCommissionModel getAppliedRule() {
		return appliedRule;
	}

	public void setAppliedRule(RuleGdsCommissionModel appliedRule) {
		this.appliedRule = appliedRule;
	}

	public BigDecimal getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

//	public NewPriceAirArabiaModel getBaggageAirArabia() {
//		return baggageAirArabia;
//	}
//
//	public void setBaggageAirArabia(NewPriceAirArabiaModel baggageAirArabia) {
//		this.baggageAirArabia = baggageAirArabia;
//	}

	public char getTypeVol() {
		return typeVol;
	}

	public void setTypeVol(char typeVol) {
		this.typeVol = typeVol;
	}

	public GdsSessionModel getGdsModel() {
		return gdsModel;
	}

	public void setGdsModel(GdsSessionModel gdsModel) {
		this.gdsModel = gdsModel;
	}

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(String trackingId) {
		this.trackingId = trackingId;
	}

	public List<FareRulesResponseModel> getFareRules() {
		return fareRules;
	}

	public void setFareRules(List<FareRulesResponseModel> fareRules) {
		this.fareRules = fareRules;
	}
	
	
	
	
}
