package ws.api.gds.tbo.ms.model;


public class PaxNameModel {

	private String passengerFirstName;
	private String passengerLastName;
	private String passengerTitle;
	private String numPnr;
	private String numTicket;
	private SessionJasperModel sessionJasper;
	private String sexe;
	private String birthDay;
	private String passportNumber;
	private String expiryDate;
	private String nationality;
	private String mail;
	private String tel;


 
	
	public PaxNameModel() {
		super();
	}

	public PaxNameModel(String passengerFirstName, String passengerLastName, String passengerTitle) {
		super();
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
		this.passengerTitle = passengerTitle;
	}

	 
	 


		
	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public String getPassengerTitle() {
		return passengerTitle;
	}

	public void setPassengerTitle(String passengerTitle) {
		this.passengerTitle = passengerTitle;
	}

	public String getNumPnr() {
		return "061816";
		// return numPnr;
	}

	public void setNumPnr(String numPnr) {
		this.numPnr = numPnr;
	}

	public String getNumTicket() {
		return "T22921";
		// return numTicket;
	}

	public void setNumTicket(String numTicket) {
		this.numTicket = numTicket;
	}

	public SessionJasperModel getSessionJasper() {
		return sessionJasper;
	}

	public void setSessionJasper(SessionJasperModel sessionJasper) {
		this.sessionJasper = sessionJasper;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "PaxNameModel [passengerFirstName=" + passengerFirstName + ", passengerLastName=" + passengerLastName
				+ ", passengerTitle=" + passengerTitle + ", numPnr=" + numPnr + ", numTicket=" + numTicket
				+ ", sessionJasper=" + sessionJasper + ", sexe=" + sexe + ", birthDay=" + birthDay + ", passportNumber="
				+ passportNumber + ", expiryDate=" + expiryDate + ", nationality=" + nationality + ", mail=" + mail
				+ ", tel=" + tel + "]";
	}

}
