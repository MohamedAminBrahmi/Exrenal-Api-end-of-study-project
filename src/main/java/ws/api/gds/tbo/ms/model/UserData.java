package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.List;

public class UserData {

	private BigDecimal idEntite;
	private BigDecimal idTiers;
	private BigDecimal idUserTiers;
	private String refUser;
	private String codeDeviseTiers;

//	private List<String> codeDevises;
//	private List<BigDecimal> nbChiffreDevise;
	public UserData() {
		super();
	}

	public UserData(BigDecimal idEntite, BigDecimal idTiers, BigDecimal idUserTiers, String refUser) {
		super();
		this.idEntite = idEntite;
		this.idTiers = idTiers;
		this.idUserTiers = idUserTiers;
		this.refUser = refUser;
	}

	public UserData(BigDecimal idEntite, BigDecimal idTiers, BigDecimal idUserTiers, String refUser,
			String codeDeviseTiers) {
		super();
		this.idEntite = idEntite;
		this.idTiers = idTiers;
		this.idUserTiers = idUserTiers;
		this.refUser = refUser;
		this.codeDeviseTiers = codeDeviseTiers;
	}

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

	public BigDecimal getIdUserTiers() {
		return idUserTiers;
	}

	public void setIdUserTiers(BigDecimal idUserTiers) {
		this.idUserTiers = idUserTiers;
	}

	public String getRefUser() {
		return refUser;
	}

	public void setRefUser(String refUser) {
		this.refUser = refUser;
	}

	public String getCodeDeviseTiers() {
		return codeDeviseTiers;
	}

	public void setCodeDeviseTiers(String codeDeviseTiers) {
		this.codeDeviseTiers = codeDeviseTiers;
	}

	@Override
	public String toString() {
		return "UserData [idEntite=" + idEntite + ", idTiers=" + idTiers + ", idUserTiers=" + idUserTiers + ", refUser="
				+ refUser + ", codeDeviseTiers=" + codeDeviseTiers + "]";
	}

//	public List<String> getCodeDevises() {
//		return codeDevises;
//	}
//
//
//
//	public void setCodeDevises(List<String> codeDevises) {
//		this.codeDevises = codeDevises;
//	}
//
//
//
//	public List<BigDecimal> getNbChiffreDevise() {
//		return nbChiffreDevise;
//	}
//
//
//
//	public void setNbChiffreDevise(List<BigDecimal> nbChiffreDevise) {
//		this.nbChiffreDevise = nbChiffreDevise;
//	}

}
