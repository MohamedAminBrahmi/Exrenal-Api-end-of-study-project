package ws.api.gds.tbo.ms.model;

 
import java.util.ArrayList;
import java.util.List;
 
public class FareRulesResponseModel implements Cloneable {

	private List<BaggageInfoModel> baggageInfos;
	private List<ErrorModel> errors;
	private List<FareRuleModel> fareRules;
	private Boolean success;
	private String target;

	public FareRulesResponseModel(List<BaggageInfoModel> baggageInfos, List<ErrorModel> errors,
			List<FareRuleModel> fareRules, Boolean success, String target) {
		super();
		this.baggageInfos = baggageInfos;
		this.errors = errors;
		this.fareRules = fareRules;
		this.success = success;
		this.target = target;
	}

	public FareRulesResponseModel() {
		super();
	}

	public FareRulesResponseModel(String error) {
		this.success = false;
		this.errors = new ArrayList<>();
		this.errors.add(new ErrorModel(error));
	}

	public FareRulesResponseModel(boolean b) {
		this.success = b;
	}


	public List<BaggageInfoModel> getBaggageInfos() {
		return baggageInfos;
	}

	public void setBaggageInfos(List<BaggageInfoModel> baggageInfos) {
		this.baggageInfos = baggageInfos;
	}

	public List<ErrorModel> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorModel> errors) {
		this.errors = errors;
	}

	public List<FareRuleModel> getFareRules() {
		return fareRules;
	}

	public void setFareRules(List<FareRuleModel> fareRules) {
		this.fareRules = fareRules;
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

	@Override
	public String toString() {
		return "FareRulesResponseModel [baggageInfos=" + baggageInfos + ", errors=" + errors + ", fareRules="
				+ fareRules + ", success=" + success + ", target=" + target + "]";
	}
	


}
