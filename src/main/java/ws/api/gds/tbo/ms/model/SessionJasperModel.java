package ws.api.gds.tbo.ms.model;


import java.math.BigDecimal;

public class SessionJasperModel {

	private int idEntiteM;
	private String userLoginM;
	private BigDecimal idTiersM;
	private BigDecimal idAgenceM;
	private String typeExt;
	private String param;


	public SessionJasperModel() {
		super();
	}

	public SessionJasperModel(int idEntiteM, String userLoginM, BigDecimal idTiersM, BigDecimal idAgenceM,String typeExt) {
		super();
		this.idEntiteM = idEntiteM;
		this.userLoginM = userLoginM;
		this.idTiersM = idTiersM;
		this.idAgenceM = idAgenceM;
		this.typeExt = typeExt;
	}

	
	public SessionJasperModel(int idEntiteM, String userLoginM, BigDecimal idTiersM, BigDecimal idAgenceM,
			String typeExt, String param) {
		super();
		this.idEntiteM = idEntiteM;
		this.userLoginM = userLoginM;
		this.idTiersM = idTiersM;
		this.idAgenceM = idAgenceM;
		this.typeExt = typeExt;
		this.param = param;
	}

	public int getIdEntiteM() {
		return idEntiteM;
	}

	public void setIdEntiteM(int idEntiteM) {
		this.idEntiteM = idEntiteM;
	}

	public String getUserLoginM() {
		return userLoginM;
	}

	public void setUserLoginM(String userLoginM) {
		this.userLoginM = userLoginM;
	}

	public BigDecimal getIdTiersM() {
		return idTiersM;
	}

	public void setIdTiersM(BigDecimal idTiersM) {
		this.idTiersM = idTiersM;
	}

	public BigDecimal getIdAgenceM() {
		return idAgenceM;
	}

	public void setIdAgenceM(BigDecimal idAgenceM) {
		this.idAgenceM = idAgenceM;
	}

	public String getTypeExt() {
		return typeExt;
	}

	public void setTypeExt(String typeExt) {
		this.typeExt = typeExt;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	@Override
	public String toString() {
		return "SessionJasperModel [idEntiteM=" + idEntiteM + ", userLoginM=" + userLoginM + ", idTiersM=" + idTiersM
				+ ", idAgenceM=" + idAgenceM + ", typeExt=" + typeExt + ", param=" + param + "]";
	}


}

