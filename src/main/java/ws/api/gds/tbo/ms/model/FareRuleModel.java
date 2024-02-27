package ws.api.gds.tbo.ms.model;


import java.util.ArrayList;
import java.util.List;
       

public class FareRuleModel {

	private String airline;
	private String cityPair;
	private String fareBasis;
	private List<RuleDetailModel> ruleDetails;
 

	public FareRuleModel(String airline, String cityPair, String fareBasis, List<RuleDetailModel> ruleDetails) {
		super();
		this.airline = airline;
		this.cityPair = cityPair;
		this.fareBasis = fareBasis;
		this.ruleDetails = ruleDetails;
	}

	public FareRuleModel() {
		super();
	}
 
	public FareRuleModel(BaggageInfoModel baggageInfoModel) {
		this.airline = baggageInfoModel.getAireline();
		this.cityPair = baggageInfoModel.getDeparture() + " - " + baggageInfoModel.getArrival();
		this.ruleDetails = new ArrayList<>();
		this.ruleDetails.add(new RuleDetailModel("Baggage ", baggageInfoModel.getBaggage()));
	}



	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getCityPair() {
		return cityPair;
	}

	public void setCityPair(String cityPair) {
		this.cityPair = cityPair;
	}

	public String getFareBasis() {
		return fareBasis;
	}

	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

	public List<RuleDetailModel> getRuleDetails() {
		return ruleDetails;
	}

	public void setRuleDetails(List<RuleDetailModel> ruleDetails) {
		this.ruleDetails = ruleDetails;
	}

	public void addBaggage(BaggageInfoModel baggageInfoModel) {
		this.ruleDetails.add(0, new RuleDetailModel("Baggage ", baggageInfoModel.getBaggage()));
	}

	@Override
	protected FareRuleModel clone() throws CloneNotSupportedException {
		return (FareRuleModel) super.clone();
	}

}
