package ws.api.gds.tbo.ms.model;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PricedItineraryModel implements Cloneable {

	private AirItineraryPricingInfoModel airItineraryPricingInfo;
	private List<AirItineraryPricingInfoModel> airItineraryPricingInfos;
	private String directionInd;
	private Boolean isPassportMandatory;
	private Boolean isResidentFare;
	private Boolean isDomestic;
	private List<OriginDestinationOptionModel> originDestinationOptions;
	private RequiredFieldsToBookModel requiredFieldsToBook;
	private List<String> residentFareDocumentTypeLists;
	private Integer sequenceNumber;
	private String ticketType;
	private String validatingAirlineCode;
	private String classType;
	private int nbStop;
	private String soldeBlock;
	private String codeGds;
	private BigDecimal idGds;
	private String fareSourceCode;
	private String refund;
	private String fareType;
	private String officeId;
	private char cabinClass;
	private List<List<List<RecommendationSegmentModel>>> recommendations;
	// For Flight24
	//private FareRulesResponseModel fareRulesResponseModel;

	private Boolean BaggageAllowance;

	private String gdsTimeZone;
	private String gdsNotification;
	private Character gdsDisplayNotif;

	private String gdsDevise;

	// for Air Arabia
	private String transactionID;
	// For MR
	private String payModes;
	
	private RuleGdsCommissionModel appliedRule;
	
	// For Travelport
	private List<List<String>> hostTokenList;

	// For Jazeera
	private Double jazExchangeRate;
	private Double jazRoundingFactor;
	
	//for TBO air
	private String resultId;
	
	private GdsSessionModel gdsModel;

	public PricedItineraryModel(PricedItineraryModel pricedItineraryModel) {
		this.airItineraryPricingInfos = new ArrayList<AirItineraryPricingInfoModel>(
				pricedItineraryModel.airItineraryPricingInfos);
		this.originDestinationOptions = new ArrayList<OriginDestinationOptionModel>(
				pricedItineraryModel.originDestinationOptions);
		this.codeGds = pricedItineraryModel.getCodeGds(); 
		this.gdsModel=pricedItineraryModel.getGdsModel();
	}

	public PricedItineraryModel() {
		super();
	}

	 
 
 

	 
	public PricedItineraryModel(AirItineraryPricingInfoModel airItineraryPricingInfo,
			List<AirItineraryPricingInfoModel> airItineraryPricingInfos, String directionInd,
			Boolean isPassportMandatory, Boolean isResidentFare, Boolean isDomestic,
			List<OriginDestinationOptionModel> originDestinationOptions, RequiredFieldsToBookModel requiredFieldsToBook,
			List<String> residentFareDocumentTypeLists, Integer sequenceNumber, String ticketType,
			String validatingAirlineCode, String classType, int nbStop, String soldeBlock, String codeGds,
			BigDecimal idGds, String fareSourceCode, String refund, String fareType, String officeId, char cabinClass,
			List<List<List<RecommendationSegmentModel>>> recommendations, Boolean baggageAllowance, String gdsTimeZone,
			String gdsNotification, Character gdsDisplayNotif, String gdsDevise, String transactionID, String payModes,
			RuleGdsCommissionModel appliedRule, List<List<String>> hostTokenList, Double jazExchangeRate,
			Double jazRoundingFactor, GdsSessionModel gdsModel) {
		super();
		this.airItineraryPricingInfo = airItineraryPricingInfo;
		this.airItineraryPricingInfos = airItineraryPricingInfos;
		this.directionInd = directionInd;
		this.isPassportMandatory = isPassportMandatory;
		this.isResidentFare = isResidentFare;
		this.isDomestic = isDomestic;
		this.originDestinationOptions = originDestinationOptions;
		this.requiredFieldsToBook = requiredFieldsToBook;
		this.residentFareDocumentTypeLists = residentFareDocumentTypeLists;
		this.sequenceNumber = sequenceNumber;
		this.ticketType = ticketType;
		this.validatingAirlineCode = validatingAirlineCode;
		this.classType = classType;
		this.nbStop = nbStop;
		this.soldeBlock = soldeBlock;
		this.codeGds = codeGds;
		this.idGds = idGds;
		this.fareSourceCode = fareSourceCode;
		this.refund = refund;
		this.fareType = fareType;
		this.officeId = officeId;
		this.cabinClass = cabinClass;
		this.recommendations = recommendations;
		BaggageAllowance = baggageAllowance;
		this.gdsTimeZone = gdsTimeZone;
		this.gdsNotification = gdsNotification;
		this.gdsDisplayNotif = gdsDisplayNotif;
		this.gdsDevise = gdsDevise;
		this.transactionID = transactionID;
		this.payModes = payModes;
		this.appliedRule = appliedRule;
		this.hostTokenList = hostTokenList;
		this.jazExchangeRate = jazExchangeRate;
		this.jazRoundingFactor = jazRoundingFactor;
		this.gdsModel = gdsModel;
	}

	
	
	 

	

	public String getResultId() {
		return resultId;
	}

	public void setResultId(String resultId) {
		this.resultId = resultId;
	}

	public String getPayModes() {
		return payModes;
	}

	public void setPayModes(String payModes) {
		this.payModes = payModes;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public AirItineraryPricingInfoModel getAirItineraryPricingInfo() {
		return airItineraryPricingInfo;
	}

	public void setAirItineraryPricingInfo(AirItineraryPricingInfoModel airItineraryPricingInfo) {
		this.airItineraryPricingInfo = airItineraryPricingInfo;
	}

	public String getDirectionInd() {
		return directionInd;
	}

	public void setDirectionInd(String directionInd) {
		this.directionInd = directionInd;
	}

	public Boolean getIsPassportMandatory() {
		return isPassportMandatory;
	}

	public void setIsPassportMandatory(Boolean isPassportMandatory) {
		this.isPassportMandatory = isPassportMandatory;
	}

	public Boolean getIsResidentFare() {
		return isResidentFare;
	}

	public void setIsResidentFare(Boolean isResidentFare) {
		this.isResidentFare = isResidentFare;
	}

	public List<OriginDestinationOptionModel> getOriginDestinationOptions() {
		return originDestinationOptions;
	}

	public void setOriginDestinationOptions(List<OriginDestinationOptionModel> originDestinationOptions) {
		this.originDestinationOptions = originDestinationOptions;
	}

	public RequiredFieldsToBookModel getRequiredFieldsToBook() {
		return requiredFieldsToBook;
	}

	public void setRequiredFieldsToBook(RequiredFieldsToBookModel requiredFieldsToBook) {
		this.requiredFieldsToBook = requiredFieldsToBook;
	}

	public List<String> getResidentFareDocumentTypeLists() {
		return residentFareDocumentTypeLists;
	}

	public void setResidentFareDocumentTypeLists(List<String> residentFareDocumentTypeLists) {
		this.residentFareDocumentTypeLists = residentFareDocumentTypeLists;
	}

	public Integer getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Integer sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getValidatingAirlineCode() {
		return validatingAirlineCode;
	}

	public void setValidatingAirlineCode(String validatingAirlineCode) {
		this.validatingAirlineCode = validatingAirlineCode;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getNbStop() {
		return nbStop;
	}

	public void setNbStop(int nbStop) {
		this.nbStop = nbStop;
	}

	public String getSoldeBlock() {
		return soldeBlock;
	}

	public void setSoldeBlock(String soldeBlock) {
		this.soldeBlock = soldeBlock;
	}

	public List<AirItineraryPricingInfoModel> getAirItineraryPricingInfos() {
		return airItineraryPricingInfos;
	}

	public void setAirItineraryPricingInfos(List<AirItineraryPricingInfoModel> airItineraryPricingInfos) {
		this.airItineraryPricingInfos = airItineraryPricingInfos;
	}


	public String getCodeGds() {
		return codeGds;
	}

	@Override
	public String toString() {
		return "PricedItineraryModel [airItineraryPricingInfo=" + airItineraryPricingInfo
				+ ", airItineraryPricingInfos=" + airItineraryPricingInfos + ", directionInd=" + directionInd
				+ ", isPassportMandatory=" + isPassportMandatory + ", isResidentFare=" + isResidentFare
				+ ", isDomestic=" + isDomestic + ", originDestinationOptions=" + originDestinationOptions
				+ ", requiredFieldsToBook=" + requiredFieldsToBook + ", residentFareDocumentTypeLists="
				+ residentFareDocumentTypeLists + ", sequenceNumber=" + sequenceNumber + ", ticketType=" + ticketType
				+ ", validatingAirlineCode=" + validatingAirlineCode + ", classType=" + classType + ", nbStop=" + nbStop
				+ ", soldeBlock=" + soldeBlock + ", codeGds=" + codeGds + ", idGds=" + idGds + ", fareSourceCode="
				+ fareSourceCode + ", refund=" + refund + ", fareType=" + fareType + ", officeId=" + officeId
				+ ", cabinClass=" + cabinClass + ", recommendations=" + recommendations + ", BaggageAllowance="
				+ BaggageAllowance + ", gdsTimeZone=" + gdsTimeZone + ", gdsNotification=" + gdsNotification
				+ ", gdsDisplayNotif=" + gdsDisplayNotif + ", gdsDevise=" + gdsDevise + ", transactionID="
				+ transactionID + ", payModes=" + payModes + ", appliedRule=" + appliedRule + ", hostTokenList="
				+ hostTokenList + ", jazExchangeRate=" + jazExchangeRate + ", jazRoundingFactor=" + jazRoundingFactor
				+ ", gdsModel=" + gdsModel + "]";
	}

	public void setCodeGds(String codeGds) {
		this.codeGds = codeGds;
	}

	public String getFareSourceCode() {
		return fareSourceCode;
	}

	public void setFareSourceCode(String fareSourceCode) {
		this.fareSourceCode = fareSourceCode;
	}

	

	public String getRefund() {
		return refund;
	}

	public void setRefund(String refund) {
		this.refund = refund;
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}



	public Boolean getIsDomestic() {
		return isDomestic;
	}

	public void setIsDomestic(Boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	public BigDecimal getIdGds() {
		return idGds;
	}

	public void setIdGds(BigDecimal idGds) {
		this.idGds = idGds;
	}

	public char getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(char cabinClass) {
		this.cabinClass = cabinClass;
	}

	public String getGdsTimeZone() {
		return gdsTimeZone;
	}

	public void setGdsTimeZone(String gdsTimeZone) {
		this.gdsTimeZone = gdsTimeZone;
	}

	public String getGdsNotification() {
		return gdsNotification;
	}

	public void setGdsNotification(String gdsNotification) {
		this.gdsNotification = gdsNotification;
	}

	public Character getGdsDisplayNotif() {
		return gdsDisplayNotif;
	}

	public void setGdsDisplayNotif(Character gdsDisplayNotif) {
		this.gdsDisplayNotif = gdsDisplayNotif;
	}

	public void setGdsNotifications(GdsSessionModel gdsSession) {
		this.gdsTimeZone = gdsSession.getGdsTimeZone();
		this.gdsNotification = gdsSession.getGdsNotification();
		this.gdsDisplayNotif = gdsSession.getDisplayNotif();

	}

	public Boolean getBaggageAllowance() {
		return BaggageAllowance;
	}

	public void setBaggageAllowance(Boolean baggageAllowance) {
		BaggageAllowance = baggageAllowance;
	}

	public String getTransactionID() {
		return transactionID;
	}

 
	

	
	

	public List<List<List<RecommendationSegmentModel>>> getRecommendations() {
		return recommendations;
	}

	public void setRecommendations(List<List<List<RecommendationSegmentModel>>> recommendations) {
		this.recommendations = recommendations;
	}

	public String getGdsDevise() {
		return gdsDevise;
	}

	public void setGdsDevise(String gdsDevise) {
		this.gdsDevise = gdsDevise;
	}

 

	public RuleGdsCommissionModel getAppliedRule() {
		return appliedRule;
	}

	public void setAppliedRule(RuleGdsCommissionModel appliedRule) {
		this.appliedRule = appliedRule;
	}

	public List<List<String>> getHostTokenList() {
		return hostTokenList;
	}

	public void setHostTokenList(List<List<String>> hostTokenList) {
		this.hostTokenList = hostTokenList;
	}

	public Double getJazExchangeRate() {
		return jazExchangeRate;
	}

	public void setJazExchangeRate(Double jazExchangeRate) {
		this.jazExchangeRate = jazExchangeRate;
	}

	public Double getJazRoundingFactor() {
		return jazRoundingFactor;
	}

	public void setJazRoundingFactor(Double jazRoundingFactor) {
		this.jazRoundingFactor = jazRoundingFactor;
	}

	public GdsSessionModel getGdsModel() {
		return gdsModel;
	}

	public void setGdsModel(GdsSessionModel gdsModel) {
		this.gdsModel = gdsModel;
	}
	
}
