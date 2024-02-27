package ws.api.gds.tbo.ms.model;
        
public class RuleDetailModel {

	private String category;
	private String rules;

	 

	public RuleDetailModel(String category, String rules) {
		super();
		this.category = category;
		this.rules = rules;
	}

	public RuleDetailModel() {
		super();
	}

	 

//	public RuleDetailModel(String category, Refunds refunds) {
//		if (category != null) {
//			this.category = category;
//		}
//		if (refunds != null) {
//			this.rules = refunds.getRefundText();
//			if(refunds.getRefundCurrency() != null && refunds.getRefundCurrency() != "")
//				this.rules = this.rules + "--" + "Refund Currency : " + refunds.getRefundCurrency();
//			if(refunds.getRefundFee() != null)
//				this.rules = this.rules + "--" + "Refund Fee : " + refunds.getRefundFee();
//			if(refunds.getRefundStatus() != null && refunds.getRefundStatus() != ""){
//				String refundStatus = "";
//				switch (refunds.getRefundStatus()) {
//				case "T":
//					refundStatus = "Nonrefundable";
//					break;
//				case "H":
//					refundStatus = "Refund conditions";
//					break;
//				case "F":
//					refundStatus = "Free to refund";
//					break;
//				case "E":
//					refundStatus = "According to the airline regulations ( It is not provide a specific fee about refund )";
//					break;
//				default:
//					break;
//				} 
//				this.rules = this.rules + "--" + "Refund Status : " + refundStatus;
//			}
//			if(refunds.getRefundType() != null){
//				String refundType = "";
//				switch (refunds.getRefundType()) {
//				case 0:
//					refundType = "All unused tickets";
//					break;
//				case 1:
//					refundType = "Partially used ticket";
//					break;
//				case 2:
//					refundType = "No-show before take-off";
//					break;
//				case 3:
//					refundType = "No-show after take-off";
//					break;
//				default:
//					break;
//				}
//				this.rules = this.rules + "--" + "Refund Type : " + refundType;
//			}
//			
//		}
//	}
// 
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

}
