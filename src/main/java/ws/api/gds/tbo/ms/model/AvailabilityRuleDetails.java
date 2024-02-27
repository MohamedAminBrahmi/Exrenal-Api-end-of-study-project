package ws.api.gds.tbo.ms.model;
 
import java.util.List;

public class AvailabilityRuleDetails {
	private String category;
	private List<String> ruleTxt;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getRuleTxt() {
		return ruleTxt;
	}
	public void setRuleTxt(List<String> ruleTxt) {
		this.ruleTxt = ruleTxt;
	}
	
}
