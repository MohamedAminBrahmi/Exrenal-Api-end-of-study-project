package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 
 

public class PassengerFlightBookingModel {

	private String firstName;
	private String lastName;
	private String sexe;
	private String ddBirthDay;
	private String mmBirthDay;
	private String yyBirthDay;
	private String bithday;
	private String passportNumber;
	private String expiryDate;
	private String ddExpiryDate;
	private String mmExpiryDate;
	private String yyExpiryDate;
	private String country;
	private String nationality;
	private String passengerTitle;
	private String frequentFlyerNumber;
	private String mealPreference;
	private String seatPreference;
	private String mail;
	private String tel;
	private Character sendMail;
	private String bagage;
	private List<ExtraServicesForPassengerModel> extraServices;
	private Character typeDoc;
	private String countryIdty;
	private String countryTel;
	private String indTel;
	private Character typeTel;

	public PassengerFlightBookingModel(String firstName, String lastName, String sexe, String ddBirthDay,
			String mmBirthDay, String yyBirthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sexe = sexe;
		this.ddBirthDay = ddBirthDay;
		this.mmBirthDay = mmBirthDay;
		this.yyBirthDay = yyBirthDay;
	}
	
	/* search passenger */
	public PassengerFlightBookingModel(String psgName, String psgSurname, Date psgBirthDate, 
			String psgTitle, String psgNumPassport, Character psgGender, Date dtExpPassport, String psgCountry,  
			String psgEmail, String psgTel, String composedName, String psgType,  
			Character typeDoc, String numDocIdty, Date dtExpdocIdty, 
			String countryTel, String indTel, String countryIdty, 
			Character typeTel, BigDecimal idPaysTel,BigDecimal idPaysNat){
		this.firstName = psgName;
		this.lastName = psgSurname;
		this.sexe = psgGender != null ? psgGender.toString() : null;
		SimpleDateFormat FormattedDATE = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.bithday = FormattedDATE.format(psgBirthDate);
			this.yyBirthDay = bithday.substring(0, 4);
			this.mmBirthDay = bithday.substring(5, 7);
			this.ddBirthDay = bithday.substring(8, 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.passportNumber = psgNumPassport;
		try {
			this.expiryDate = FormattedDATE.format(dtExpPassport);;
			this.yyExpiryDate = expiryDate.substring(0, 4);
			this.mmExpiryDate = expiryDate.substring(5, 7);
			this.ddExpiryDate = expiryDate.substring(8, 10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.country = psgCountry;
//		this.nationality = ;
		this.passengerTitle = psgTitle;
//		this.frequentFlyerNumber;
//		this.mealPreference;
//		this.seatPreference;
		this.mail = psgEmail;
		this.tel = psgTel;
//		this.sendMail;
//		this.bagage;
		this.typeDoc = typeDoc;
//		this.countryIdty = idPaysIdty;
		this.countryIdty = countryIdty;
		this.countryTel = countryTel;
		this.indTel = indTel;
		this.typeTel = typeTel;
		
		
	 }
	public PassengerFlightBookingModel(CustomerInfoModel customerInfo) {
		super();
		this.firstName = customerInfo.getCustomer().getPaxName().getPassengerFirstName();
		this.lastName = customerInfo.getCustomer().getPaxName().getPassengerLastName();
		this.sexe = customerInfo.getCustomer().getPaxName().getSexe();
		try {
			this.bithday = customerInfo.getCustomer().getPaxName().getBirthDay();
			this.ddBirthDay = customerInfo.getCustomer().getPaxName().getBirthDay().substring(8, 10);
			this.mmBirthDay = customerInfo.getCustomer().getPaxName().getBirthDay().substring(5, 7);
			this.yyBirthDay = customerInfo.getCustomer().getPaxName().getBirthDay().substring(0, 4);
		} catch (Exception e) {
		}
		
		try {
			this.expiryDate = customerInfo.getCustomer().getPaxName().getExpiryDate();
			this.ddExpiryDate = customerInfo.getCustomer().getPaxName().getExpiryDate().substring(8, 10);
			this.mmExpiryDate = customerInfo.getCustomer().getPaxName().getExpiryDate().substring(5, 7);
			this.yyExpiryDate = customerInfo.getCustomer().getPaxName().getExpiryDate().substring(0, 4);
		} catch (Exception e) {
		}
		
		this.passportNumber = customerInfo.getCustomer().getPaxName().getPassportNumber();
	
		this.country = customerInfo.getCustomer().getPaxName().getNationality();
		this.nationality = customerInfo.getCustomer().getPaxName().getNationality();
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDdBirthDay() {
		return ddBirthDay;
	}

	public void setDdBirthDay(String ddBirthDay) {
		this.ddBirthDay = ddBirthDay;
	}

	public String getMmBirthDay() {
		return mmBirthDay;
	}

	public void setMmBirthDay(String mmBirthDay) {
		this.mmBirthDay = mmBirthDay;
	}

	public String getYyBirthDay() {
		return yyBirthDay;
	}

	public void setYyBirthDay(String yyBirthDay) {
		this.yyBirthDay = yyBirthDay;
	}

	public PassengerFlightBookingModel() {
		super();
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassengerTitle() {
		return passengerTitle;
	}

	public void setPassengerTitle(String passengerTitle) {
		this.passengerTitle = passengerTitle;
	}

	public String getBithday() {
		return bithday;
	}

	public void setBithday(String bithday) {
		this.bithday = bithday;
	}

	public String getDdExpiryDate() {
		return ddExpiryDate;
	}

	public void setDdExpiryDate(String ddExpiryDate) {
		this.ddExpiryDate = ddExpiryDate;
	}

	public String getMmExpiryDate() {
		return mmExpiryDate;
	}

	public void setMmExpiryDate(String mmExpiryDate) {
		this.mmExpiryDate = mmExpiryDate;
	}

	public String getYyExpiryDate() {
		return yyExpiryDate;
	}

	public void setYyExpiryDate(String yyExpiryDate) {
		this.yyExpiryDate = yyExpiryDate;
	}


	public String getFrequentFlyerNumber() {
		return frequentFlyerNumber;
	}

	public void setFrequentFlyerNumber(String frequentFlyerNumber) {
		this.frequentFlyerNumber = frequentFlyerNumber;
	}

	public String getMealPreference() {
		return mealPreference;
	}

	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
	}

	public String getSeatPreference() {
		return seatPreference;
	}

	public void setSeatPreference(String seatPreference) {
		this.seatPreference = seatPreference;
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

	public Character getSendMail() {
		return sendMail;
	}

	public void setSendMail(Character sendMail) {
		this.sendMail = sendMail;
	}

	public String getBagage() {
		return bagage;
	}

	public void setBagage(String bagage) {
		this.bagage = bagage;
	}

	public List<ExtraServicesForPassengerModel> getExtraServices() {
		return extraServices;
	}

	public void setExtraServices(List<ExtraServicesForPassengerModel> extraServices) {
		this.extraServices = extraServices;
	}

	@Override
	public String toString() {
		return "PassengerFlightBookingModel [firstName=" + firstName + ", lastName=" + lastName + ", sexe=" + sexe
				+ ", ddBirthDay=" + ddBirthDay + ", mmBirthDay=" + mmBirthDay + ", yyBirthDay=" + yyBirthDay
				+ ", bithday=" + bithday + ", passportNumber=" + passportNumber + ", expiryDate=" + expiryDate
				+ ", ddExpiryDate=" + ddExpiryDate + ", mmExpiryDate=" + mmExpiryDate + ", yyExpiryDate=" + yyExpiryDate
				+ ", country=" + country + ", nationality=" + nationality + ", passengerTitle=" + passengerTitle
				+ ", frequentFlyerNumber=" + frequentFlyerNumber + ", mealPreference=" + mealPreference
				+ ", seatPreference=" + seatPreference + ", mail=" + mail + ", tel=" + tel + ", sendMail=" + sendMail
				+ ", bagage=" + bagage + ", extraServices=" + extraServices + ", typeDoc=" + typeDoc + ", countryIdty="
				+ countryIdty + ", countryTel=" + countryTel + ", indTel=" + indTel + ", typeTel=" + typeTel + "]";
	}

	public Character getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(Character typeDoc) {
		this.typeDoc = typeDoc;
	}

	public String getCountryIdty() {
		return countryIdty;
	}

	public void setCountryIdty(String countryIdty) {
		this.countryIdty = countryIdty;
	}

	public String getCountryTel() {
		return countryTel;
	}

	public void setCountryTel(String countryTel) {
		this.countryTel = countryTel;
	}

	public String getIndTel() {
		return indTel;
	}

	public void setIndTel(String indTel) {
		this.indTel = indTel;
	}

	public Character getTypeTel() {
		return typeTel;
	}

	public void setTypeTel(Character typeTel) {
		this.typeTel = typeTel;
	}
	
	

}
