package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;

public class CommissionPerCompagnieModel {

	private BigDecimal mntComComp;
	private BigDecimal txComComp;
	private BigDecimal mntComTiers;
	private BigDecimal txComTiers;

	public CommissionPerCompagnieModel(BigDecimal mntComComp, BigDecimal txComComp, BigDecimal mntComTiers,
			BigDecimal txComTiers) {
		super();
		this.mntComComp = mntComComp;
		this.txComComp = txComComp;
		this.mntComTiers = mntComTiers;
		this.txComTiers = txComTiers;
	}

	public CommissionPerCompagnieModel() {
		super();
	}

	public BigDecimal getMntComComp() {
		return mntComComp;
	}

	public void setMntComComp(BigDecimal mntComComp) {
		this.mntComComp = mntComComp;
	}

	public BigDecimal getTxComComp() {
		return txComComp;
	}

	public void setTxComComp(BigDecimal txComComp) {
		this.txComComp = txComComp;
	}

	public BigDecimal getMntComTiers() {
		return mntComTiers;
	}

	public void setMntComTiers(BigDecimal mntComTiers) {
		this.mntComTiers = mntComTiers;
	}

	public BigDecimal getTxComTiers() {
		return txComTiers;
	}

	public void setTxComTiers(BigDecimal txComTiers) {
		this.txComTiers = txComTiers;
	}

}
