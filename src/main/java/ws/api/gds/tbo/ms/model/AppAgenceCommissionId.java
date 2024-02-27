package ws.api.gds.tbo.ms.model;

 

import java.math.BigDecimal;
 
public class AppAgenceCommissionId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal idEntite;
	private BigDecimal idTiers;
	private BigDecimal idComm;
	public BigDecimal getIdEntite() {
		return idEntite;
	}
	public void setIdEntite(BigDecimal idEntite) {
		this.idEntite = idEntite;
	}
	public BigDecimal getIdTiers() {
		return idTiers;
	}
	public void setIdTiers(BigDecimal idTiers) {
		this.idTiers = idTiers;
	}
	public BigDecimal getIdComm() {
		return idComm;
	}
	public void setIdComm(BigDecimal idComm) {
		this.idComm = idComm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	 
	
}
