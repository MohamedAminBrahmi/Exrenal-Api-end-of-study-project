package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class GdsSessionModel {

	private BigDecimal idGds;
	private String url;
	private String sessionId;
	private Date dateSession;
	private String codeDevise;
	private BigDecimal txMarkup;
	private List<BigDecimal> mntMarkup;
	private BigDecimal wsTauxComm;
	private List<BigDecimal> wsMntComm;
	private BigDecimal txMarkupLCC;
	private List<BigDecimal> mntMarkupLCC;
	private BigDecimal wsTauxCommLCC;
	private List<BigDecimal> wsMntCommLCC;
	private Character isGsa;
	private String login;
	private String password;
	private String officeId;
	private String codeGds;
	private boolean complete;
	private BigDecimal wsCommissionUSD;
	private BigDecimal wsCommissionUSDLCC;
	private List<BigDecimal> txChangeGDS;
	private Character isBsp;
	private String lPays;
//	private List<String> airlines;
	private List<AppTiersCompCommissionModel> airlines;
	private Character typeComm;
	private Character commssOn;
	private Character wsTypeComm;
	private Character wsCommssOn;
	private List<AppTiersCompGdsCommissionModel> listAppTiersCompCommissions;
	private String iataNumber;
	private String codePays;
	private String emailNotif1;
	private String emailNotif2;
	private List<String> priceTypes;
	private String timeOffset;

	private List<BigDecimal> txChangeWS;

	private BigDecimal idDevroot;

	private String codeDevroot;

	private List<BigDecimal> wsMntclassCommF;

	private List<BigDecimal> gsaMntclassCommF;

	private List<BigDecimal> wsMntclassCommW;

	private List<BigDecimal> gsaMntclassCommW;

	private List<BigDecimal> wsMntclassCommC;

	private List<BigDecimal> gsaMntclassCommC;

	private BigDecimal wsTxComm;
	private BigDecimal txCommGsa;
	private List<BigDecimal> mntCompGsa;
	private Character wsComOn;
	private Character gsaCommOn;
	private BigDecimal idDevise;
	private BigDecimal idDeviseGsa;
	private String codeDeviseGsa;

	private String gdsTimeZone;
	private String gdsNotification;
	private Character displayNotif;
	private List<BigDecimal> mntServVoid;
	private List<BigDecimal> mntServRefund;
	private BigDecimal idFrs;
	private BigDecimal idEntite;
	private BigDecimal idTiers;
	private BigDecimal idUserTier;
	private String codeDevTier;
	private Character typeRecherche;
	private Character ownerGds;

	private String sessionError;
	private String target;

	private String gmtValue;
	/**
	 * AmorBJ Account number , added for hotels , goglobal
	 */
	private String accountNumber;

	private List<VAirlinegdsCommissionModel> listVAirlinegdsCommission;
	private List<PriceGdsCommissionModel> listPriceGdsCommission;
	private List<RuleGdsCommissionModel> listRuleGdsCommission;
//	private KieSession kieSession;
	
	private UserData userData;
	public GdsSessionModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BigDecimal getIdGds() {
		return idGds;
	}
	public void setIdGds(BigDecimal idGds) {
		this.idGds = idGds;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Date getDateSession() {
		return dateSession;
	}
	public void setDateSession(Date dateSession) {
		this.dateSession = dateSession;
	}
	public String getCodeDevise() {
		return codeDevise;
	}
	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
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
	public BigDecimal getWsTauxComm() {
		return wsTauxComm;
	}
	public void setWsTauxComm(BigDecimal wsTauxComm) {
		this.wsTauxComm = wsTauxComm;
	}
	public List<BigDecimal> getWsMntComm() {
		return wsMntComm;
	}
	public void setWsMntComm(List<BigDecimal> wsMntComm) {
		this.wsMntComm = wsMntComm;
	}
	public BigDecimal getTxMarkupLCC() {
		return txMarkupLCC;
	}
	public void setTxMarkupLCC(BigDecimal txMarkupLCC) {
		this.txMarkupLCC = txMarkupLCC;
	}
	public List<BigDecimal> getMntMarkupLCC() {
		return mntMarkupLCC;
	}
	public void setMntMarkupLCC(List<BigDecimal> mntMarkupLCC) {
		this.mntMarkupLCC = mntMarkupLCC;
	}
	public BigDecimal getWsTauxCommLCC() {
		return wsTauxCommLCC;
	}
	public void setWsTauxCommLCC(BigDecimal wsTauxCommLCC) {
		this.wsTauxCommLCC = wsTauxCommLCC;
	}
	public List<BigDecimal> getWsMntCommLCC() {
		return wsMntCommLCC;
	}
	public void setWsMntCommLCC(List<BigDecimal> wsMntCommLCC) {
		this.wsMntCommLCC = wsMntCommLCC;
	}
	public Character getIsGsa() {
		return isGsa;
	}
	public void setIsGsa(Character isGsa) {
		this.isGsa = isGsa;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOfficeId() {
		return officeId;
	}
	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}
	public String getCodeGds() {
		return codeGds;
	}
	public void setCodeGds(String codeGds) {
		this.codeGds = codeGds;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public BigDecimal getWsCommissionUSD() {
		return wsCommissionUSD;
	}
	public void setWsCommissionUSD(BigDecimal wsCommissionUSD) {
		this.wsCommissionUSD = wsCommissionUSD;
	}
	public BigDecimal getWsCommissionUSDLCC() {
		return wsCommissionUSDLCC;
	}
	public void setWsCommissionUSDLCC(BigDecimal wsCommissionUSDLCC) {
		this.wsCommissionUSDLCC = wsCommissionUSDLCC;
	}
	public List<BigDecimal> getTxChangeGDS() {
		return txChangeGDS;
	}
	public void setTxChangeGDS(List<BigDecimal> txChangeGDS) {
		this.txChangeGDS = txChangeGDS;
	}
	public Character getIsBsp() {
		return isBsp;
	}
	public void setIsBsp(Character isBsp) {
		this.isBsp = isBsp;
	}
	public String getlPays() {
		return lPays;
	}
	public void setlPays(String lPays) {
		this.lPays = lPays;
	}
	public List<AppTiersCompCommissionModel> getAirlines() {
		return airlines;
	}
	public void setAirlines(List<AppTiersCompCommissionModel> airlines) {
		this.airlines = airlines;
	}
	public Character getTypeComm() {
		return typeComm;
	}
	public void setTypeComm(Character typeComm) {
		this.typeComm = typeComm;
	}
	public Character getCommssOn() {
		return commssOn;
	}
	public void setCommssOn(Character commssOn) {
		this.commssOn = commssOn;
	}
	public Character getWsTypeComm() {
		return wsTypeComm;
	}
	public void setWsTypeComm(Character wsTypeComm) {
		this.wsTypeComm = wsTypeComm;
	}
	public Character getWsCommssOn() {
		return wsCommssOn;
	}
	public void setWsCommssOn(Character wsCommssOn) {
		this.wsCommssOn = wsCommssOn;
	}
	public List<AppTiersCompGdsCommissionModel> getListAppTiersCompCommissions() {
		return listAppTiersCompCommissions;
	}
	public void setListAppTiersCompCommissions(List<AppTiersCompGdsCommissionModel> listAppTiersCompCommissions) {
		this.listAppTiersCompCommissions = listAppTiersCompCommissions;
	}
	public String getIataNumber() {
		return iataNumber;
	}
	public void setIataNumber(String iataNumber) {
		this.iataNumber = iataNumber;
	}
	public String getCodePays() {
		return codePays;
	}
	public void setCodePays(String codePays) {
		this.codePays = codePays;
	}
	public String getEmailNotif1() {
		return emailNotif1;
	}
	public void setEmailNotif1(String emailNotif1) {
		this.emailNotif1 = emailNotif1;
	}
	public String getEmailNotif2() {
		return emailNotif2;
	}
	public void setEmailNotif2(String emailNotif2) {
		this.emailNotif2 = emailNotif2;
	}
	public List<String> getPriceTypes() {
		return priceTypes;
	}
	public void setPriceTypes(List<String> priceTypes) {
		this.priceTypes = priceTypes;
	}
	public String getTimeOffset() {
		return timeOffset;
	}
	public void setTimeOffset(String timeOffset) {
		this.timeOffset = timeOffset;
	}
	public List<BigDecimal> getTxChangeWS() {
		return txChangeWS;
	}
	public void setTxChangeWS(List<BigDecimal> txChangeWS) {
		this.txChangeWS = txChangeWS;
	}
	public BigDecimal getIdDevroot() {
		return idDevroot;
	}
	public void setIdDevroot(BigDecimal idDevroot) {
		this.idDevroot = idDevroot;
	}
	public String getCodeDevroot() {
		return codeDevroot;
	}
	public void setCodeDevroot(String codeDevroot) {
		this.codeDevroot = codeDevroot;
	}
	public List<BigDecimal> getWsMntclassCommF() {
		return wsMntclassCommF;
	}
	public void setWsMntclassCommF(List<BigDecimal> wsMntclassCommF) {
		this.wsMntclassCommF = wsMntclassCommF;
	}
	public List<BigDecimal> getGsaMntclassCommF() {
		return gsaMntclassCommF;
	}
	public void setGsaMntclassCommF(List<BigDecimal> gsaMntclassCommF) {
		this.gsaMntclassCommF = gsaMntclassCommF;
	}
	public List<BigDecimal> getWsMntclassCommW() {
		return wsMntclassCommW;
	}
	public void setWsMntclassCommW(List<BigDecimal> wsMntclassCommW) {
		this.wsMntclassCommW = wsMntclassCommW;
	}
	public List<BigDecimal> getGsaMntclassCommW() {
		return gsaMntclassCommW;
	}
	public void setGsaMntclassCommW(List<BigDecimal> gsaMntclassCommW) {
		this.gsaMntclassCommW = gsaMntclassCommW;
	}
	public List<BigDecimal> getWsMntclassCommC() {
		return wsMntclassCommC;
	}
	public void setWsMntclassCommC(List<BigDecimal> wsMntclassCommC) {
		this.wsMntclassCommC = wsMntclassCommC;
	}
	public List<BigDecimal> getGsaMntclassCommC() {
		return gsaMntclassCommC;
	}
	public void setGsaMntclassCommC(List<BigDecimal> gsaMntclassCommC) {
		this.gsaMntclassCommC = gsaMntclassCommC;
	}
	public BigDecimal getWsTxComm() {
		return wsTxComm;
	}
	public void setWsTxComm(BigDecimal wsTxComm) {
		this.wsTxComm = wsTxComm;
	}
	public BigDecimal getTxCommGsa() {
		return txCommGsa;
	}
	public void setTxCommGsa(BigDecimal txCommGsa) {
		this.txCommGsa = txCommGsa;
	}
	public List<BigDecimal> getMntCompGsa() {
		return mntCompGsa;
	}
	public void setMntCompGsa(List<BigDecimal> mntCompGsa) {
		this.mntCompGsa = mntCompGsa;
	}
	public Character getWsComOn() {
		return wsComOn;
	}
	public void setWsComOn(Character wsComOn) {
		this.wsComOn = wsComOn;
	}
	public Character getGsaCommOn() {
		return gsaCommOn;
	}
	public void setGsaCommOn(Character gsaCommOn) {
		this.gsaCommOn = gsaCommOn;
	}
	public BigDecimal getIdDevise() {
		return idDevise;
	}
	public void setIdDevise(BigDecimal idDevise) {
		this.idDevise = idDevise;
	}
	public BigDecimal getIdDeviseGsa() {
		return idDeviseGsa;
	}
	public void setIdDeviseGsa(BigDecimal idDeviseGsa) {
		this.idDeviseGsa = idDeviseGsa;
	}
	public String getCodeDeviseGsa() {
		return codeDeviseGsa;
	}
	public void setCodeDeviseGsa(String codeDeviseGsa) {
		this.codeDeviseGsa = codeDeviseGsa;
	}
	public String getGdsTimeZone() {
		return gdsTimeZone;
	}
	public void setGdsTimeZone(String gdsTimeZone) {
		this.gdsTimeZone = gdsTimeZone;
	}
	public String getGdsNotification() {
		return gdsNotification;
	}
	public void setGdsNotification(String gdsNotification) {
		this.gdsNotification = gdsNotification;
	}
	public Character getDisplayNotif() {
		return displayNotif;
	}
	public void setDisplayNotif(Character displayNotif) {
		this.displayNotif = displayNotif;
	}
	public List<BigDecimal> getMntServVoid() {
		return mntServVoid;
	}
	public void setMntServVoid(List<BigDecimal> mntServVoid) {
		this.mntServVoid = mntServVoid;
	}
	public List<BigDecimal> getMntServRefund() {
		return mntServRefund;
	}
	public void setMntServRefund(List<BigDecimal> mntServRefund) {
		this.mntServRefund = mntServRefund;
	}
	public BigDecimal getIdFrs() {
		return idFrs;
	}
	public void setIdFrs(BigDecimal idFrs) {
		this.idFrs = idFrs;
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
	public BigDecimal getIdUserTier() {
		return idUserTier;
	}
	public void setIdUserTier(BigDecimal idUserTier) {
		this.idUserTier = idUserTier;
	}
	public String getCodeDevTier() {
		return codeDevTier;
	}
	public void setCodeDevTier(String codeDevTier) {
		this.codeDevTier = codeDevTier;
	}
	public Character getTypeRecherche() {
		return typeRecherche;
	}
	public void setTypeRecherche(Character typeRecherche) {
		this.typeRecherche = typeRecherche;
	}
	public Character getOwnerGds() {
		return ownerGds;
	}
	public void setOwnerGds(Character ownerGds) {
		this.ownerGds = ownerGds;
	}
	public String getSessionError() {
		return sessionError;
	}
	public void setSessionError(String sessionError) {
		this.sessionError = sessionError;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getGmtValue() {
		return gmtValue;
	}
	public void setGmtValue(String gmtValue) {
		this.gmtValue = gmtValue;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public List<VAirlinegdsCommissionModel> getListVAirlinegdsCommission() {
		return listVAirlinegdsCommission;
	}
	public void setListVAirlinegdsCommission(List<VAirlinegdsCommissionModel> listVAirlinegdsCommission) {
		this.listVAirlinegdsCommission = listVAirlinegdsCommission;
	}
	public List<PriceGdsCommissionModel> getListPriceGdsCommission() {
		return listPriceGdsCommission;
	}
	public void setListPriceGdsCommission(List<PriceGdsCommissionModel> listPriceGdsCommission) {
		this.listPriceGdsCommission = listPriceGdsCommission;
	}
	public List<RuleGdsCommissionModel> getListRuleGdsCommission() {
		return listRuleGdsCommission;
	}
	public void setListRuleGdsCommission(List<RuleGdsCommissionModel> listRuleGdsCommission) {
		this.listRuleGdsCommission = listRuleGdsCommission;
	}

	public UserData getUserData() {
		return userData;
	}
	public void setUserData(UserData userData) {
		this.userData = userData;
	}
	@Override
	public String toString() {
		return "GdsSessionModel [idGds=" + idGds + ", url=" + url + ", sessionId=" + sessionId + ", dateSession="
				+ dateSession + ", codeDevise=" + codeDevise + ", txMarkup=" + txMarkup + ", mntMarkup=" + mntMarkup
				+ ", wsTauxComm=" + wsTauxComm + ", wsMntComm=" + wsMntComm + ", txMarkupLCC=" + txMarkupLCC
				+ ", mntMarkupLCC=" + mntMarkupLCC + ", wsTauxCommLCC=" + wsTauxCommLCC + ", wsMntCommLCC="
				+ wsMntCommLCC + ", isGsa=" + isGsa + ", login=" + login + ", password=" + password + ", officeId="
				+ officeId + ", codeGds=" + codeGds + ", complete=" + complete + ", wsCommissionUSD=" + wsCommissionUSD
				+ ", wsCommissionUSDLCC=" + wsCommissionUSDLCC + ", txChangeGDS=" + txChangeGDS + ", isBsp=" + isBsp
				+ ", lPays=" + lPays + ", airlines=" + airlines + ", typeComm=" + typeComm + ", commssOn=" + commssOn
				+ ", wsTypeComm=" + wsTypeComm + ", wsCommssOn=" + wsCommssOn + ", listAppTiersCompCommissions="
				+ listAppTiersCompCommissions + ", iataNumber=" + iataNumber + ", codePays=" + codePays
				+ ", emailNotif1=" + emailNotif1 + ", emailNotif2=" + emailNotif2 + ", priceTypes=" + priceTypes
				+ ", timeOffset=" + timeOffset + ", txChangeWS=" + txChangeWS + ", idDevroot=" + idDevroot
				+ ", codeDevroot=" + codeDevroot + ", wsMntclassCommF=" + wsMntclassCommF + ", gsaMntclassCommF="
				+ gsaMntclassCommF + ", wsMntclassCommW=" + wsMntclassCommW + ", gsaMntclassCommW=" + gsaMntclassCommW
				+ ", wsMntclassCommC=" + wsMntclassCommC + ", gsaMntclassCommC=" + gsaMntclassCommC + ", wsTxComm="
				+ wsTxComm + ", txCommGsa=" + txCommGsa + ", mntCompGsa=" + mntCompGsa + ", wsComOn=" + wsComOn
				+ ", gsaCommOn=" + gsaCommOn + ", idDevise=" + idDevise + ", idDeviseGsa=" + idDeviseGsa
				+ ", codeDeviseGsa=" + codeDeviseGsa + ", gdsTimeZone=" + gdsTimeZone + ", gdsNotification="
				+ gdsNotification + ", displayNotif=" + displayNotif + ", mntServVoid=" + mntServVoid
				+ ", mntServRefund=" + mntServRefund + ", idFrs=" + idFrs + ", idEntite=" + idEntite + ", idTiers="
				+ idTiers + ", idUserTier=" + idUserTier + ", codeDevTier=" + codeDevTier + ", typeRecherche="
				+ typeRecherche + ", ownerGds=" + ownerGds + ", sessionError=" + sessionError + ", target=" + target
				+ ", gmtValue=" + gmtValue + ", accountNumber=" + accountNumber + ", listVAirlinegdsCommission="
				+ listVAirlinegdsCommission + ", listPriceGdsCommission=" + listPriceGdsCommission
				+ ", listRuleGdsCommission=" + listRuleGdsCommission + ", userData=" + userData + "]";
	}
	
	

}
