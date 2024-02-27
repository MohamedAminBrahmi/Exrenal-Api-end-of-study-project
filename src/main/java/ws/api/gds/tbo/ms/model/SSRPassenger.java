package ws.api.gds.tbo.ms.model;



 

public class SSRPassenger {
	
	private String ssrKey;
	private Double amount;
	private Double sourceAmount;
	private Boolean selected;
	
	public SSRPassenger() {
		super();
	}
	


	public String getSsrKey() {
		return ssrKey;
	}
	public void setSsrKey(String ssrKey) {
		this.ssrKey = ssrKey;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	

	public Double getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(Double sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	
	

}
