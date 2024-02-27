package ws.api.gds.tbo.ms.model;

 


  

public class ExtraServicesModel {

	private String extraServiceKey;
	private String amount;
	private String currencyCode;
	private Integer decimalPlaces;
	private String description;
	private String maxQuantity;

	 
	public ExtraServicesModel() {
		super();
	}

	public ExtraServicesModel(String extraServiceKey, String amount, String currencyCode, Integer decimalPlaces,
			String description, String maxQuantity) {
		super();
		this.extraServiceKey = extraServiceKey;
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.decimalPlaces = decimalPlaces;
		this.description = description;
		this.maxQuantity = maxQuantity;
	}

	public String getExtraServiceKey() {
		return extraServiceKey;
	}

	public void setExtraServiceKey(String extraServiceKey) {
		this.extraServiceKey = extraServiceKey;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(String maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

	@Override
	public String toString() {
		return "ExtraServicesModel [extraServiceKey=" + extraServiceKey + ", amount=" + amount + ", currencyCode="
				+ currencyCode + ", decimalPlaces=" + decimalPlaces + ", description=" + description + ", maxQuantity="
				+ maxQuantity + "]";
	}
 

	

}
