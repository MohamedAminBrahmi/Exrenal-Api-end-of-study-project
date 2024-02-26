package ws.api.gds.tbo.ms.model;



import java.util.List;

public class FlightSearchModel {

	private String departVol1;
	private String destinationVol1;
	private String departVol2;
	private String destinationVol2;
	private String departVol3;
	private String destinationVol3;
	private String departleVol1;
	private String departleVol2;
	private String departleVol3;
	private String retourleVol1;
	private String rangeDepart;
	private String rangeArriv;
	private String classe;
	private String airline;
	private String airlines;

	private Integer qteADT;
	private Integer qteCHD;
	private Integer qteINF;
	private Integer qteSTU;
	private Integer qteSRC;
	private Integer qteSEA;
	private Integer qteYTH;

	private String gds;

	private Boolean isRefundable;
	private Boolean isResidentFare;
	private Boolean nearByAirports;
	private String pricingSourceType; // "ALL", "DEFAULT", "PRIVATE", "PUBLIC"
	private String requestOptions; // "DEFAULT", "FIFTY", "HUNDRED",
									// "TWO_HUNDRED"
	private String sessionId;
	private String target;// "DEFAULT" , "DEVELOPMENT" , "PRODUCTION" , "TEST"

	private String cabinPreference;
	private String maxStopsQuantity;// "Default" , "All" , "Direct" , "OneStop"

	private String cabinType;
	private String preferenceLevel;

	private Integer typeSearch; // 1 : OneWay ; 2 :RoundTrip ; 3 :
								// MultiDestination

	private String refundable;
	
	private String departVol4;
	private String destinationVol4;
	private String departleVol4;
	private String departVol5;
	private String destinationVol5;
	private String departleVol5;
	
	private String flightType;
	private String baggage;
	private String codePromo;
	
	private List<String> preferredAirlines;
	private boolean calender ;
	
	private GdsSessionModel gdsModel;
	
	public FlightSearchModel(String departVol1, String destinationVol1, String departVol2, String destinationVol2,
			String departVol3, String destinationVol3, String departleVol1, String departleVol2, String departleVol3,
			String retourleVol1, String classe, Integer qteADT, Integer qteCHD, Integer qteINF) {
		super();
		this.departVol1 = departVol1;
		this.destinationVol1 = destinationVol1;
		this.departVol2 = departVol2;
		this.destinationVol2 = destinationVol2;
		this.departVol3 = departVol3;
		this.destinationVol3 = destinationVol3;
		this.departleVol1 = departleVol1;
		this.departleVol2 = departleVol2;
		this.departleVol3 = departleVol3;
		this.retourleVol1 = retourleVol1;
		this.classe = classe;
		this.qteADT = qteADT;
		this.qteCHD = qteCHD;
		this.qteINF = qteINF;
	}

	public FlightSearchModel() {
		super();
	}

	public String getDepartVol1() {
		return departVol1;
	}

	public void setDepartVol1(String departVol1) {
		this.departVol1 = departVol1;
	}

	public String getDestinationVol1() {
		return destinationVol1;
	}

	public void setDestinationVol1(String destinationVol1) {
		this.destinationVol1 = destinationVol1;
	}

	public String getDepartVol2() {
		return departVol2;
	}

	public void setDepartVol2(String departVol2) {
		this.departVol2 = departVol2;
	}

	public String getDestinationVol2() {
		return destinationVol2;
	}

	public void setDestinationVol2(String destinationVol2) {
		this.destinationVol2 = destinationVol2;
	}

	public String getDepartVol3() {
		return departVol3;
	}

	public void setDepartVol3(String departVol3) {
		this.departVol3 = departVol3;
	}

	public String getDestinationVol3() {
		return destinationVol3;
	}

	public void setDestinationVol3(String destinationVol3) {
		this.destinationVol3 = destinationVol3;
	}

	public String getDepartleVol1() {
		return departleVol1;
	}

	public void setDepartleVol1(String departleVol1) {
		this.departleVol1 = departleVol1;
	}

	public String getDepartleVol2() {
		return departleVol2;
	}

	public void setDepartleVol2(String departleVol2) {
		this.departleVol2 = departleVol2;
	}

	public String getDepartleVol3() {
		return departleVol3;
	}

	public void setDepartleVol3(String departleVol3) {
		this.departleVol3 = departleVol3;
	}

	public String getRetourleVol1() {
		return retourleVol1;
	}

	public void setRetourleVol1(String retourleVol1) {
		this.retourleVol1 = retourleVol1;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Integer getQteADT() {
		return qteADT;
	}

	public void setQteADT(Integer qteADT) {
		this.qteADT = qteADT;
	}

	public Integer getQteCHD() {
		return qteCHD;
	}

	public void setQteCHD(Integer qteCHD) {
		this.qteCHD = qteCHD;
	}

	public Integer getQteINF() {
		return qteINF;
	}

	public void setQteINF(Integer qteINF) {
		this.qteINF = qteINF;
	}



	public Boolean getIsRefundable() {
		return isRefundable;
	}

	public void setIsRefundable(Boolean isRefundable) {
		this.isRefundable = isRefundable;
	}

	public Boolean getIsResidentFare() {
		return isResidentFare;
	}

	public void setIsResidentFare(Boolean isResidentFare) {
		this.isResidentFare = isResidentFare;
	}

	public Boolean getNearByAirports() {
		return nearByAirports;
	}

	public void setNearByAirports(Boolean nearByAirports) {
		this.nearByAirports = nearByAirports;
	}

	public String getPricingSourceType() {
		return pricingSourceType;
	}

	public void setPricingSourceType(String pricingSourceType) {
		this.pricingSourceType = pricingSourceType;
	}

	public String getRequestOptions() {
		return requestOptions;
	}

	public void setRequestOptions(String requestOptions) {
		this.requestOptions = requestOptions;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getCabinPreference() {
		return cabinPreference;
	}

	public void setCabinPreference(String cabinPreference) {
		this.cabinPreference = cabinPreference;
	}

	public String getMaxStopsQuantity() {
		return maxStopsQuantity;
	}

	public void setMaxStopsQuantity(String maxStopsQuantity) {
		this.maxStopsQuantity = maxStopsQuantity;
	}

	public String getCabinType() {
		return cabinType;
	}

	public void setCabinType(String cabinType) {
		this.cabinType = cabinType;
	}

	public String getPreferenceLevel() {
		return preferenceLevel;
	}

	public void setPreferenceLevel(String preferenceLevel) {
		this.preferenceLevel = preferenceLevel;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}
	

	public Integer getTypeSearch() {
		return typeSearch;
	}

	public void setTypeSearch(Integer typeSearch) {
		this.typeSearch = typeSearch;
	}

	@Override
	public String toString() {
		return "FlightSearchModel [departVol1=" + departVol1 + ", destinationVol1=" + destinationVol1 + ", departVol2="
				+ departVol2 + ", destinationVol2=" + destinationVol2 + ", departVol3=" + departVol3
				+ ", destinationVol3=" + destinationVol3 + ", departleVol1=" + departleVol1 + ", departleVol2="
				+ departleVol2 + ", departleVol3=" + departleVol3 + ", retourleVol1=" + retourleVol1 + ", rangeDepart="
				+ rangeDepart + ", rangeArriv=" + rangeArriv + ", classe=" + classe + ", airline=" + airline
				+ ", airlines=" + airlines + ", qteADT=" + qteADT + ", qteCHD=" + qteCHD + ", qteINF=" + qteINF
				+ ", qteSTU=" + qteSTU + ", qteSRC=" + qteSRC + ", qteSEA=" + qteSEA + ", qteYTH=" + qteYTH + ", gds="
				+ gds + ", isRefundable=" + isRefundable + ", isResidentFare=" + isResidentFare + ", nearByAirports="
				+ nearByAirports + ", pricingSourceType=" + pricingSourceType + ", requestOptions=" + requestOptions
				+ ", sessionId=" + sessionId + ", target=" + target + ", cabinPreference=" + cabinPreference
				+ ", maxStopsQuantity=" + maxStopsQuantity + ", cabinType=" + cabinType + ", preferenceLevel="
				+ preferenceLevel + ", TyepSearch=" + typeSearch + ", refundable=" + refundable + ", departVol4="
				+ departVol4 + ", destinationVol4=" + destinationVol4 + ", departleVol4=" + departleVol4
				+ ", departVol5=" + departVol5 + ", destinationVol5=" + destinationVol5 + ", departleVol5="
				+ departleVol5 + ", flightType=" + flightType + "]";
	}

	public Integer getQteSTU() {
		return qteSTU;
	}

	public void setQteSTU(Integer qteSTU) {
		this.qteSTU = qteSTU;
	}

	public Integer getQteSRC() {
		return qteSRC;
	}

	public void setQteSRC(Integer qteSRC) {
		this.qteSRC = qteSRC;
	}

	public Integer getQteSEA() {
		return qteSEA;
	}

	public void setQteSEA(Integer qteSEA) {
		this.qteSEA = qteSEA;
	}

	public Integer getQteYTH() {
		return qteYTH;
	}

	public void setQteYTH(Integer qteYTH) {
		this.qteYTH = qteYTH;
	}

	public String getRefundable() {
		return refundable;
	}

	public void setRefundable(String refundable) {
		this.refundable = refundable;
	}

	public String getGds() {
		return gds;
	}

	public void setGds(String gds) {
		this.gds = gds;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getRangeDepart() {
		return rangeDepart;
	}

	public void setRangeDepart(String rangeDepart) {
		this.rangeDepart = rangeDepart;
	}

	public String getRangeArriv() {
		return rangeArriv;
	}

	public void setRangeArriv(String rangeArriv) {
		this.rangeArriv = rangeArriv;
	}

	public String getDepartVol4() {
		return departVol4;
	}

	public void setDepartVol4(String departVol4) {
		this.departVol4 = departVol4;
	}

	public String getDestinationVol4() {
		return destinationVol4;
	}

	public void setDestinationVol4(String destinationVol4) {
		this.destinationVol4 = destinationVol4;
	}

	public String getDepartleVol4() {
		return departleVol4;
	}

	public void setDepartleVol4(String departleVol4) {
		this.departleVol4 = departleVol4;
	}

	public String getDepartVol5() {
		return departVol5;
	}

	public void setDepartVol5(String departVol5) {
		this.departVol5 = departVol5;
	}

	public String getDestinationVol5() {
		return destinationVol5;
	}

	public void setDestinationVol5(String destinationVol5) {
		this.destinationVol5 = destinationVol5;
	}

	public String getDepartleVol5() {
		return departleVol5;
	}

	public void setDepartleVol5(String departleVol5) {
		this.departleVol5 = departleVol5;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public String getBaggage() {
		return baggage;
	}

	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}

	public String getCodePromo() {
		return codePromo;
	}

	public void setCodePromo(String codePromo) {
		this.codePromo = codePromo;
	}

	public List<String> getPreferredAirlines() {
		return preferredAirlines;
	}

	public void setPreferredAirlines(List<String> preferredAirlines) {
		this.preferredAirlines = preferredAirlines;
	}
	public boolean isCalender() {
		return calender;
	}

	public void setCalender(boolean calender) {
		this.calender = calender;
	}

	public GdsSessionModel getGdsModel() {
		return gdsModel;
	}

	public void setGdsModel(GdsSessionModel gdsModel) {
		this.gdsModel = gdsModel;
	}
	
	

}
