package ws.api.gds.tbo.ms.model;

import java.util.List; 

public class AvailabilityRules {

	private List<FareRuleModel> fareRule;
//	private List<RuleDetailModel> ruleDetails;
	private List<AvailabilityRuleDetails> availabilityRuleDetails;
 

//	public List<RuleDetailModel> getRuleDetails() {
//		return getRuleDetails();
//	}
//
//	public void setRuleDetails(List<RuleDetailModel> ruleDetails) {
//		this.ruleDetails = ruleDetails;
//	}

	public List<FareRuleModel> getFareRule() {
		return fareRule;
	}

	public void setFareRule(List<FareRuleModel> fareRule) {
		this.fareRule = fareRule;
	}

	public List<AvailabilityRuleDetails> getAvailabilityRuleDetails() {
		return availabilityRuleDetails;
	}

	public void setAvailabilityRuleDetails(List<AvailabilityRuleDetails> availabilityRuleDetails) {
		this.availabilityRuleDetails = availabilityRuleDetails;
	}
}
