package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RuleGdsCommissionModel {
//	private String LRule;
	private String name;
	private BigDecimal priorRule;
	private int txMarckup;
	private List<BigDecimal> mntMarkup;
	private int mntMarckup;
	private String codeDev;
	private String expressionRule;
	private String tourCode;
	private Boolean appliedRule;
	private BigDecimal txFm;
	private BigDecimal mntFm;
	
	private String airline;
	private String originAirport;
	private String destinationAirport;
	private String classe;
	private boolean oneWay;
	private boolean roundTrip;
	private String fareBasic;
	private boolean isDomestic;
	private String salesPeriod;
	private String travelPeriod;
	
	private Character autoFm;
	
	public RuleGdsCommissionModel() {
		super();
	}
	
	public RuleGdsCommissionModel(String lRule, BigDecimal priorRule, BigDecimal txMarckup, BigDecimal mntMarkup,
			String codeDev, String expressionRule, String tourCode, BigDecimal txFm, BigDecimal mntFm, Character autoFm) {
		super();
		name = lRule;
		this.priorRule = priorRule;
		this.txMarckup = txMarckup.intValue();
//		this.mntMarkup = mntMarkup;
		this.mntMarkup = new ArrayList<>();
		this.mntMarkup.add(mntMarkup != null ? mntMarkup : BigDecimal.ZERO);
		this.codeDev = codeDev;
		this.expressionRule = expressionRule;
		this.tourCode = tourCode;
		this.txFm = txFm;
		this.mntFm = mntFm;
		this.autoFm = autoFm;
	}
	public RuleGdsCommissionModel(RuleGdsCommissionModel ruleGdsCommissionModel) {
		name = ruleGdsCommissionModel.getName();
		this.priorRule = ruleGdsCommissionModel.getPriorRule();
		this.txMarckup = ruleGdsCommissionModel.getTxMarckup();
		this.mntMarkup = ruleGdsCommissionModel.getMntMarkup();
		this.codeDev = ruleGdsCommissionModel.getCodeDev();
		this.expressionRule = ruleGdsCommissionModel.getExpressionRule();
		this.tourCode = ruleGdsCommissionModel.getTourCode();
	}
	public String getName() {
		return name;
	}
	public void setName(String lRule) {
		name = lRule;
	}
	public BigDecimal getPriorRule() {
		return priorRule;
	}
	public void setPriorRule(BigDecimal priorRule) {
		this.priorRule = priorRule;
	}
	public int getTxMarckup() {
		return txMarckup;
	}
	public void setTxMarckup(int txMarckup) {
		this.txMarckup = txMarckup;
	}
	public List<BigDecimal> getMntMarkup() {
		return mntMarkup;
	}
	public void setMntMarkup(List<BigDecimal> mntMarkup) {
		this.mntMarkup = mntMarkup;
	}
	public String getCodeDev() {
		return codeDev;
	}
	public void setCodeDev(String codeDev) {
		this.codeDev = codeDev;
	}
	public String getExpressionRule() {
		return expressionRule;
	}
	public void setExpressionRule(String expressionRule) {
		this.expressionRule = expressionRule;
	}
	public String getTourCode() {
		return tourCode;
	}
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}
	public Boolean getAppliedRule() {
		return appliedRule;
	}
	public void setAppliedRule(Boolean appliedRule) {
		this.appliedRule = appliedRule;
	}
	public BigDecimal getTxFm() {
		return txFm;
	}
	public void setTxFm(BigDecimal txFm) {
		this.txFm = txFm;
	}
	public BigDecimal getMntFm() {
		return mntFm;
	}
	public void setMntFm(BigDecimal mntFm) {
		this.mntFm = mntFm;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getOriginAirport() {
		return originAirport;
	}

	public void setOriginAirport(String originAirport) {
		this.originAirport = originAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public boolean getOneWay() {
		return oneWay;
	}

	public void setOneWay(boolean oneWay) {
		this.oneWay = oneWay;
	}

	public boolean getRoundTrip() {
		return roundTrip;
	}

	public void setRoundTrip(boolean roundTrip) {
		this.roundTrip = roundTrip;
	}

	public String getFareBasic() {
		return fareBasic;
	}

	public void setFareBasic(String fareBasic) {
		this.fareBasic = fareBasic;
	}

	public int getMntMarckup() {
		return mntMarckup;
	}

	public void setMntMarckup(int mntMarckup) {
		this.mntMarckup = mntMarckup;
	}

	public boolean isDomestic() {
		return isDomestic;
	}

	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	public String getSalesPeriod() {
		return salesPeriod;
	}

	public void setSalesPeriod(String salesPeriod) {
		this.salesPeriod = salesPeriod;
	}

	public String getTravelPeriod() {
		return travelPeriod;
	}

	public void setTravelPeriod(String travelPeriod) {
		this.travelPeriod = travelPeriod;
	}

	public Character getAutoFm() {
		return autoFm;
	}

	public void setAutoFm(Character autoFm) {
		this.autoFm = autoFm;
	}

	@Override
	public String toString() {
		return "RuleGdsCommissionModel [name=" + name + ", priorRule=" + priorRule + ", txMarckup=" + txMarckup
				+ ", mntMarkup=" + mntMarkup + ", mntMarckup=" + mntMarckup + ", codeDev=" + codeDev
				+ ", expressionRule=" + expressionRule + ", tourCode=" + tourCode + ", appliedRule=" + appliedRule
				+ ", txFm=" + txFm + ", mntFm=" + mntFm + ", airline=" + airline + ", originAirport=" + originAirport
				+ ", destinationAirport=" + destinationAirport + ", classe=" + classe + ", oneWay=" + oneWay
				+ ", roundTrip=" + roundTrip + ", fareBasic=" + fareBasic + ", isDomestic=" + isDomestic
				+ ", salesPeriod=" + salesPeriod + ", travelPeriod=" + travelPeriod + ", autoFm=" + autoFm + "]";
	}
	
}
