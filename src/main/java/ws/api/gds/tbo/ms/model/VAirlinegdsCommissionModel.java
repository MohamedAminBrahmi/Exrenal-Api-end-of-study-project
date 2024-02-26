package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VAirlinegdsCommissionModel {
	
	private String codeComp;
	private char domestic;
	private BigDecimal MMinamount;
	private BigDecimal MMaxamount;
	private BigDecimal txMarkup;
	private List<BigDecimal> mntMarkup;
	private String codeDevise;
	
	
	public VAirlinegdsCommissionModel() {
		super();
	}
	public VAirlinegdsCommissionModel(String codeComp, char domestic, BigDecimal mMinamount, BigDecimal mMaxamount,
			BigDecimal txMarkup, BigDecimal mntMarkup, String codeDevise) {
		super();
		this.codeComp = codeComp;
		this.domestic = domestic;
		MMinamount = mMinamount;
		MMaxamount = mMaxamount;
		this.txMarkup = txMarkup;
//		this.mntMarkup = mntMarkup;
		this.mntMarkup = new ArrayList<>();
		this.mntMarkup.add(mntMarkup != null ? mntMarkup : BigDecimal.ZERO);
		this.codeDevise = codeDevise;
	}
	public VAirlinegdsCommissionModel(VAirlinegdsCommissionModel vAirlinegdsCommissionModel) {
		this.codeComp = vAirlinegdsCommissionModel.getCodeComp();
		this.domestic = vAirlinegdsCommissionModel.getDomestic();
		this.MMinamount = vAirlinegdsCommissionModel.getMMinamount();
		this.MMaxamount = vAirlinegdsCommissionModel.getMMaxamount();
		this.txMarkup = vAirlinegdsCommissionModel.getTxMarkup();
		this.mntMarkup = new ArrayList<>();
		this.mntMarkup = vAirlinegdsCommissionModel.getMntMarkup();
		this.codeDevise = vAirlinegdsCommissionModel.getCodeDevise();
	}
	public String getCodeComp() {
		return codeComp;
	}
	public void setCodeComp(String codeComp) {
		this.codeComp = codeComp;
	}
	public char getDomestic() {
		return domestic;
	}
	public void setDomestic(char domestic) {
		this.domestic = domestic;
	}
	public BigDecimal getMMinamount() {
		return MMinamount;
	}
	public void setMMinamount(BigDecimal mMinamount) {
		MMinamount = mMinamount;
	}
	public BigDecimal getMMaxamount() {
		return MMaxamount;
	}
	public void setMMaxamount(BigDecimal mMaxamount) {
		MMaxamount = mMaxamount;
	}
	public BigDecimal getTxMarkup() {
		return txMarkup;
	}
	public void setTxMarkup(BigDecimal txMarkup) {
		this.txMarkup = txMarkup;
	}
	public List<BigDecimal> getMntMarkup() {
		return mntMarkup;
	}
	public void setMntMarkup(List<BigDecimal> mntMarkup) {
		this.mntMarkup = mntMarkup;
	}
	public String getCodeDevise() {
		return codeDevise;
	}
	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}
	@Override
	public String toString() {
		return "VAirlinegdsCommissionModel [codeComp=" + codeComp + ", domestic=" + domestic + ", MMinamount="
				+ MMinamount + ", MMaxamount=" + MMaxamount + ", txMarkup=" + txMarkup + ", mntMarkup=" + mntMarkup
				+ ", codeDevise=" + codeDevise + "]";
	}
	

}
