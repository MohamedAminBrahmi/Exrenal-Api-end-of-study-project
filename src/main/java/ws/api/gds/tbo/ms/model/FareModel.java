package ws.api.gds.tbo.ms.model;

 

   
   
public class FareModel implements Cloneable {
	private String amount;
	private String currencyCode;
	private Integer decimalPlaces;
	private String amountSup;
	private String amountAchat;
	private String amountCommission;
	public FareModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FareModel(String amount, String currencyCode, Integer decimalPlaces, String amountSup, String amountAchat,
			String amountCommission) {
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.decimalPlaces = decimalPlaces;
		this.amountSup = amountSup;
		this.amountAchat = amountAchat;
		this.amountCommission = amountCommission;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Integer getDecimalPlaces() {
		return decimalPlaces;
	}
	public void setDecimalPlaces(Integer decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}
	public String getAmountSup() {
		return amountSup;
	}
	public void setAmountSup(String amountSup) {
		this.amountSup = amountSup;
	}
	public String getAmountAchat() {
		return amountAchat;
	}
	public void setAmountAchat(String amountAchat) {
		this.amountAchat = amountAchat;
	}
	public String getAmountCommission() {
		return amountCommission;
	}
	public void setAmountCommission(String amountCommission) {
		this.amountCommission = amountCommission;
	}
	@Override
	public String toString() {
		return "FareModel [amount=" + amount + ", currencyCode=" + currencyCode + ", decimalPlaces=" + decimalPlaces
				+ ", amountSup=" + amountSup + ", amountAchat=" + amountAchat + ", amountCommission=" + amountCommission
				+ "]";
	}

 

	
}
