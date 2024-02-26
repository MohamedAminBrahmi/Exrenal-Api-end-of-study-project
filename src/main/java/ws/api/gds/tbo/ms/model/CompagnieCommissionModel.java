package ws.api.gds.tbo.ms.model;
 

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class CompagnieCommissionModel {

	private String codeComp;
	private List<String> codeDevise;
	private BigDecimal txComm;
	private List<BigDecimal> mntComm;

	public CompagnieCommissionModel() {
		super();
		this.codeDevise = new ArrayList<>();
		this.mntComm = new ArrayList<>();
	}

	public String getCodeComp() {
		return codeComp;
	}

	public void setCodeComp(String codeComp) {
		this.codeComp = codeComp;
	}

	public CompagnieCommissionModel(String codeComp, List<String> codeDevise, BigDecimal txComm,
			List<BigDecimal> mntComm) {
		super();
		this.codeComp = codeComp;
		this.codeDevise = codeDevise;
		this.txComm = txComm;
		this.mntComm = mntComm;
	}

	public List<String> getCodeDevise() {
		return codeDevise;
	}

	public void setCodeDevise(List<String> codeDevise) {
		this.codeDevise = codeDevise;
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

	@Override
	public String toString() {
		return "CompagnieCommissionModel [codeComp=" + codeComp + ", codeDevise=" + codeDevise + ", txComm=" + txComm
				+ ", mntComm=" + mntComm + "]\n";
	}

}
