package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;

public class AgenceCommissionModel {
	
	private BigDecimal txMarkup;
	private BigDecimal mntMarkup;
	private Character addToPrice;
	
	public AgenceCommissionModel() {
		super();
	}
	public AgenceCommissionModel(BigDecimal txMarkup, BigDecimal mntMarkup, Character addToPrice) {
		super();
		this.txMarkup = txMarkup;
		this.mntMarkup = mntMarkup;
		this.addToPrice = addToPrice;
	}
	public BigDecimal getTxMarkup() {
		return txMarkup;
	}
	public void setTxMarkup(BigDecimal txMarkup) {
		this.txMarkup = txMarkup;
	}
	public BigDecimal getMntMarkup() {
		return mntMarkup;
	}
	public void setMntMarkup(BigDecimal mntMarkup) {
		this.mntMarkup = mntMarkup;
	}
	public Character getAddToPrice() {
		return addToPrice;
	}
	public void setAddToPrice(Character addToPrice) {
		this.addToPrice = addToPrice;
	}
	@Override
	public String toString() {
		return "AgenceCommissionModel [txMarkup=" + txMarkup + ", mntMarkup=" + mntMarkup + ", addToPrice=" + addToPrice
				+ "]";
	}
	
	

}
