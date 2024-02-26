package ws.api.gds.tbo.ms.model;

 

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date; 


public class AppAgenceCommissionModel {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	private AppAgenceCommissionId id;
	private BigDecimal version;
	private Character codeModule; 
	private Character addToPrice; 
	private BigDecimal txMarkup;
	private BigDecimal mntMarkup;
	private String refUser;
	private String dtCreate;
	private String dtModif;
	
	public AppAgenceCommissionModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppAgenceCommissionModel(AppAgenceCommissionId id, BigDecimal version, Character codeModule,
			BigDecimal txMarkup, BigDecimal mntMarkup, String refUser, Date dtCreate , Character addToPrice) {
		super();
		this.id = id;
		this.version = version;
		this.codeModule = codeModule;
		this.txMarkup = txMarkup;
		this.mntMarkup = mntMarkup;
		this.refUser = refUser;
		try {
			this.dtCreate = new SimpleDateFormat("yyyy-MM-dd").format(dtCreate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setAddToPrice(addToPrice);
	}

	public AppAgenceCommissionId getId() {
		return id;
	}

	public void setId(AppAgenceCommissionId id) {
		this.id = id;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public Character getCodeModule() {
		return codeModule;
	}

	public void setCodeModule(Character codeModule) {
		this.codeModule = codeModule;
	}

	public BigDecimal getTxMarkup() {
		return this.txMarkup;
	}

	public void setTxMarkup(BigDecimal txMarkup) {
		this.txMarkup = txMarkup;
	}

	public BigDecimal getMntMarkup() {
		return this.mntMarkup;
	}

	public void setMntMarkup(BigDecimal mntMarkup) {
		this.mntMarkup = mntMarkup;
	}

	public String getRefUser() {
		return refUser;
	}

	public void setRefUser(String refUser) {
		this.refUser = refUser;
	}

	public String getDtCreate() {
		return dtCreate;
	}

	public void setDtCreate(String dtCreate) {
		this.dtCreate = dtCreate;
	}

	public String getDtModif() {
		return dtModif;
	}

	public void setDtModif(String dtModif) {
		this.dtModif = dtModif;
	}

	@Override
	public String toString() {
		return "AppAgenceCommissionModel [codeModule=" + codeModule + ", TxMarkup=" + this.txMarkup + ", MntMarkup="
				+ this.mntMarkup + "]";
	}

	public Character getAddToPrice() {
		return addToPrice;
	}

	public void setAddToPrice(Character addToPrice) {
		this.addToPrice = addToPrice;
	}

	
	
}
