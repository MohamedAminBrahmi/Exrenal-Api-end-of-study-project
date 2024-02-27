package ws.api.gds.tbo.ms.model;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AppTiersCompGdsCommissionModel {

	private BigDecimal txMarkupAirline;
	private String codeComp;
	private BigDecimal txComm;
	private List<BigDecimal> mntComm;
	private BigDecimal txCommServ;
	private List<BigDecimal> mntCompServ;
	private String codeDevise;
	private Character domComp;
	
	private Character actifTC;
	private String tourCode;

	public AppTiersCompGdsCommissionModel() {
		super();
	}

	// adding TOUR CODE
	public AppTiersCompGdsCommissionModel(BigDecimal txMarkupAirline, String codeComp, BigDecimal txComm, BigDecimal mntComm, 
			String codeDevise, BigDecimal txCommServ, BigDecimal mntCompServ, Character domComp, Character actifTC, String tourCode) {
		super();
		this.txMarkupAirline = txMarkupAirline != null ? txMarkupAirline : BigDecimal.ZERO;
		this.codeComp = codeComp;
		this.txComm = txComm != null ? txComm : BigDecimal.ZERO;
		this.mntComm = new ArrayList<>();
		this.mntComm.add(mntComm != null ? mntComm : BigDecimal.ZERO);
		this.txCommServ = txCommServ != null ? txCommServ : BigDecimal.ZERO;
		this.mntCompServ = new ArrayList<>();
		this.mntCompServ.add(mntCompServ != null ? mntCompServ : BigDecimal.ZERO);
		this.codeDevise = codeDevise;
		this.domComp = domComp;
		this.actifTC = actifTC;
		this.tourCode = tourCode;
	}
	
	public AppTiersCompGdsCommissionModel(BigDecimal txMarkupAirline, String codeComp, BigDecimal txComm,
			BigDecimal mntComm, String codeDevise, BigDecimal txCommServ, BigDecimal mntCompServ, Character domComp) {
		super();
		this.txMarkupAirline = txMarkupAirline != null ? txMarkupAirline : BigDecimal.ZERO;
		this.codeComp = codeComp;
		this.txComm = txComm != null ? txComm : BigDecimal.ZERO;
		this.mntComm = new ArrayList<>();
		this.mntComm.add(mntComm != null ? mntComm : BigDecimal.ZERO);
		this.txCommServ = txCommServ != null ? txCommServ : BigDecimal.ZERO;
		this.mntCompServ = new ArrayList<>();
		this.mntCompServ.add(mntCompServ != null ? mntCompServ : BigDecimal.ZERO);
		this.setCodeDevise(codeDevise);
		this.domComp = domComp;
	}

	public AppTiersCompGdsCommissionModel(AppTiersCompGdsCommissionModel appTiersCompGdsCommission) {
		this.txMarkupAirline = appTiersCompGdsCommission.getTxMarkupAirline();
		this.codeComp = appTiersCompGdsCommission.getCodeComp();
		this.txComm = appTiersCompGdsCommission.getTxComm();
		this.mntComm = appTiersCompGdsCommission.getMntComm();
		this.txCommServ = appTiersCompGdsCommission.getTxCommServ();
		this.mntCompServ = appTiersCompGdsCommission.getMntCompServ();
		this.codeDevise = appTiersCompGdsCommission.getCodeDevise();
		this.domComp = appTiersCompGdsCommission.getDomComp();
	}


	public BigDecimal getTxMarkupAirline() {
		return txMarkupAirline;
	}

	public void setTxMarkupAirline(BigDecimal txMarkupAirline) {
		this.txMarkupAirline = txMarkupAirline;
	}

	public String getCodeComp() {
		return codeComp;
	}

	public void setCodeComp(String codeComp) {
		this.codeComp = codeComp;
	}

	public BigDecimal getTxComm() {
		return txComm;
	}

	public void setTxComm(BigDecimal txComm) {
		this.txComm = txComm;
	}

	public String getCodeDevise() {
		return codeDevise;
	}

	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}

	public List<BigDecimal> getMntComm() {
		return mntComm;
	}

	public void setMntComm(List<BigDecimal> mntComm) {
		this.mntComm = mntComm;
	}

	public BigDecimal getTxCommServ() {
		return txCommServ;
	}

	public void setTxCommServ(BigDecimal txCommServ) {
		this.txCommServ = txCommServ;
	}

	public List<BigDecimal> getMntCompServ() {
		return mntCompServ;
	}

	public void setMntCompServ(List<BigDecimal> mntCompServ) {
		this.mntCompServ = mntCompServ;
	}

	public Character getDomComp() {
		return domComp;
	}

	public void setDomComp(Character domComp) {
		this.domComp = domComp;
	}

	public Character getActifTC() {
		return actifTC;
	}

	public void setActifTC(Character actifTC) {
		this.actifTC = actifTC;
	}

	public String getTourCode() {
		return tourCode;
	}

	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}

	@Override
	public String toString() {
		return "AppTiersCompGdsCommissionModel [txMarkupAirline=" + txMarkupAirline + ", codeComp=" + codeComp
				+ ", txComm=" + txComm + ", mntComm=" + mntComm + ", txCommServ=" + txCommServ + ", mntCompServ="
				+ mntCompServ + ", codeDevise=" + codeDevise + ", domComp=" + domComp + ", actifTC=" + actifTC
				+ ", tourCode=" + tourCode + "]";
	}

	public void format() {
		this.txComm = BigDecimal.ZERO;
		this.mntComm = new ArrayList<>();
		this.mntComm.add(BigDecimal.ZERO);
		this.txCommServ = BigDecimal.ZERO;
		this.mntCompServ = new ArrayList<>();
		this.mntCompServ.add(BigDecimal.ZERO);
	}

}
