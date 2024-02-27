package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PriceGdsCommissionModel {
	
	private BigDecimal minamount;
	private BigDecimal maxamount;
	private BigDecimal txComm;
	private List<BigDecimal> mntComm;
	private String codeDevise;
	
	
	public PriceGdsCommissionModel() {
		super();
	}
	public PriceGdsCommissionModel(BigDecimal minamount, BigDecimal maxamount,
			BigDecimal txComm, BigDecimal mntComm, String codeDevise) {
		super();
		this.minamount = minamount;
		this.maxamount = maxamount;
		this.setTxComm(txComm);
//		this.mntMarkup = mntMarkup;
		this.mntComm = new ArrayList<>();
		this.mntComm.add(mntComm != null ? mntComm : BigDecimal.ZERO);
		this.codeDevise = codeDevise;
	}
	public PriceGdsCommissionModel(PriceGdsCommissionModel priceGdsCommissionModel) {
		this.minamount = priceGdsCommissionModel.getMinamount();
		this.maxamount = priceGdsCommissionModel.getMaxamount();
		this.txComm = priceGdsCommissionModel.getTxComm();
		this.mntComm = new ArrayList<>();
		this.mntComm = priceGdsCommissionModel.getMntComm();
		this.codeDevise = priceGdsCommissionModel.getCodeDevise();
	}
	public BigDecimal getMinamount() {
		return minamount;
	}
	public void setMinamount(BigDecimal minamount) {
		this.minamount = minamount;
	}
	public BigDecimal getMaxamount() {
		return maxamount;
	}
	public void setMaxamount(BigDecimal maxamount) {
		this.maxamount = maxamount;
	}
	public BigDecimal getTxComm() {
		return txComm;
	}
	public void setTxComm(BigDecimal txComm) {
		this.txComm = txComm;
	}
	public List<BigDecimal> getMntComm() {
		return mntComm;
	}
	public void setMntComm(List<BigDecimal> mntComm) {
		this.mntComm = mntComm;
	}
	public String getCodeDevise() {
		return codeDevise;
	}
	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}
	@Override
	public String toString() {
		return "PriceGdsCommissionModel [minamount=" + minamount + ", maxamount=" + maxamount + ", txComm=" + txComm
				+ ", mntComm=" + mntComm + ", codeDevise=" + codeDevise + "]";
	}

	

}
