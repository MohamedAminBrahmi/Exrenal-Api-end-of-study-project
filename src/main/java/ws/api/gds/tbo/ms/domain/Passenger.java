package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger {
	
	@JsonProperty("PassportIssueCountryCode") 
	private Object passportIssueCountryCode;
    @JsonProperty("PassportIssueDate") 
    private Object passportIssueDate;
    @JsonProperty("Title") 
    private String title;
    @JsonProperty("FirstName") 
    private String firstName;
    @JsonProperty("LastName") 
    private String lastName;
    @JsonProperty("Mobile1") 
    private String mobile1;
    @JsonProperty("Mobile1CountryCode") 
    private String mobile1CountryCode;
    @JsonProperty("Mobile2") 
    private String mobile2;
    @JsonProperty("Mobile2CountryCode") 
    private String mobile2CountryCode;
    @JsonProperty("IsLeadPax") 
    private boolean isLeadPax;
    @JsonProperty("DateOfBirth") 
    private Date dateOfBirth;
    @JsonProperty("Type") 
    private int type;
    @JsonProperty("PassportNo") 
    private String passportNo;
    @JsonProperty("Nationality") 
    private Nationality nationality;
    @JsonProperty("Country") 
    private Country country;
    @JsonProperty("City") 
    private City city;
    @JsonProperty("AddressLine1") 
    private String addressLine1;
    @JsonProperty("AddressLine2") 
    private String addressLine2;
    @JsonProperty("Gender") 
    private int gender;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("Meal") 
    private Meal meal;
    @JsonProperty("Seat") 
    private Seat seat;
    @JsonProperty("Fare") 
    private Fare fare;
    @JsonProperty("FFAirline") 
    private Object fFAirline;
    @JsonProperty("FFNumber") 
    private Object fFNumber;
    @JsonProperty("PassportExpiry") 
    private String passportExpiry;
    @JsonProperty("PaxBaggage") 
    private ArrayList<Object> paxBaggage;
    @JsonProperty("PaxMeal") 
    private ArrayList<Object> paxMeal;
    @JsonProperty("IDCardNo") 
    private Object iDCardNo;
    @JsonProperty("ZipCode") 
    private Object zipCode;
    @JsonProperty("PaxSeat") 
    private Object paxSeat;
    @JsonProperty("Ticket") 
    private Ticket ticket;
    @JsonProperty("TurkeyNumber") 
    private Object turkeyNumber;
    @JsonProperty("IdDetailCode") 
    private String idDetailCode;
    
    
    
    
    
    
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Passenger(Object passportIssueCountryCode, Object passportIssueDate, String title, String firstName,
			String lastName, String mobile1, String mobile1CountryCode, String mobile2, String mobile2CountryCode,
			boolean isLeadPax, Date dateOfBirth, int type, String passportNo, Nationality nationality, Country country,
			City city, String addressLine1, String addressLine2, int gender, String email, Meal meal, Seat seat,
			Fare fare, Object fFAirline, Object fFNumber, String passportExpiry, ArrayList<Object> paxBaggage,
			ArrayList<Object> paxMeal, Object iDCardNo, Object zipCode, Object paxSeat, Ticket ticket,
			Object turkeyNumber, String idDetailCode) {
		this.passportIssueCountryCode = passportIssueCountryCode;
		this.passportIssueDate = passportIssueDate;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile1 = mobile1;
		this.mobile1CountryCode = mobile1CountryCode;
		this.mobile2 = mobile2;
		this.mobile2CountryCode = mobile2CountryCode;
		this.isLeadPax = isLeadPax;
		this.dateOfBirth = dateOfBirth;
		this.type = type;
		this.passportNo = passportNo;
		this.nationality = nationality;
		this.country = country;
		this.city = city;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.gender = gender;
		this.email = email;
		this.meal = meal;
		this.seat = seat;
		this.fare = fare;
		this.fFAirline = fFAirline;
		this.fFNumber = fFNumber;
		this.passportExpiry = passportExpiry;
		this.paxBaggage = paxBaggage;
		this.paxMeal = paxMeal;
		this.iDCardNo = iDCardNo;
		this.zipCode = zipCode;
		this.paxSeat = paxSeat;
		this.ticket = ticket;
		this.turkeyNumber = turkeyNumber;
		this.idDetailCode = idDetailCode;
	}






	public Object getPassportIssueCountryCode() {
		return passportIssueCountryCode;
	}






	public void setPassportIssueCountryCode(Object passportIssueCountryCode) {
		this.passportIssueCountryCode = passportIssueCountryCode;
	}






	public Object getPassportIssueDate() {
		return passportIssueDate;
	}






	public void setPassportIssueDate(Object passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}






	public String getTitle() {
		return title;
	}






	public void setTitle(String title) {
		this.title = title;
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






	public String getMobile1() {
		return mobile1;
	}






	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}






	public String getMobile1CountryCode() {
		return mobile1CountryCode;
	}






	public void setMobile1CountryCode(String mobile1CountryCode) {
		this.mobile1CountryCode = mobile1CountryCode;
	}






	public String getMobile2() {
		return mobile2;
	}






	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}






	public String getMobile2CountryCode() {
		return mobile2CountryCode;
	}






	public void setMobile2CountryCode(String mobile2CountryCode) {
		this.mobile2CountryCode = mobile2CountryCode;
	}






	public boolean isLeadPax() {
		return isLeadPax;
	}






	public void setLeadPax(boolean isLeadPax) {
		this.isLeadPax = isLeadPax;
	}






	public Date getDateOfBirth() {
		return dateOfBirth;
	}






	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}






	public int getType() {
		return type;
	}






	public void setType(int type) {
		this.type = type;
	}






	public String getPassportNo() {
		return passportNo;
	}






	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}






	public Nationality getNationality() {
		return nationality;
	}






	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}






	public Country getCountry() {
		return country;
	}






	public void setCountry(Country country) {
		this.country = country;
	}






	public City getCity() {
		return city;
	}






	public void setCity(City city) {
		this.city = city;
	}






	public String getAddressLine1() {
		return addressLine1;
	}






	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}






	public String getAddressLine2() {
		return addressLine2;
	}






	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}






	public int getGender() {
		return gender;
	}






	public void setGender(int gender) {
		this.gender = gender;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public Meal getMeal() {
		return meal;
	}






	public void setMeal(Meal meal) {
		this.meal = meal;
	}






	public Seat getSeat() {
		return seat;
	}






	public void setSeat(Seat seat) {
		this.seat = seat;
	}






	public Fare getFare() {
		return fare;
	}






	public void setFare(Fare fare) {
		this.fare = fare;
	}






	public Object getfFAirline() {
		return fFAirline;
	}






	public void setfFAirline(Object fFAirline) {
		this.fFAirline = fFAirline;
	}






	public Object getfFNumber() {
		return fFNumber;
	}






	public void setfFNumber(Object fFNumber) {
		this.fFNumber = fFNumber;
	}






	public String getPassportExpiry() {
		return passportExpiry;
	}






	public void setPassportExpiry(String passportExpiry) {
		this.passportExpiry = passportExpiry;
	}






	public ArrayList<Object> getPaxBaggage() {
		return paxBaggage;
	}






	public void setPaxBaggage(ArrayList<Object> paxBaggage) {
		this.paxBaggage = paxBaggage;
	}






	public ArrayList<Object> getPaxMeal() {
		return paxMeal;
	}






	public void setPaxMeal(ArrayList<Object> paxMeal) {
		this.paxMeal = paxMeal;
	}






	public Object getiDCardNo() {
		return iDCardNo;
	}






	public void setiDCardNo(Object iDCardNo) {
		this.iDCardNo = iDCardNo;
	}






	public Object getZipCode() {
		return zipCode;
	}






	public void setZipCode(Object zipCode) {
		this.zipCode = zipCode;
	}






	public Object getPaxSeat() {
		return paxSeat;
	}






	public void setPaxSeat(Object paxSeat) {
		this.paxSeat = paxSeat;
	}






	public Ticket getTicket() {
		return ticket;
	}






	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}






	public Object getTurkeyNumber() {
		return turkeyNumber;
	}






	public void setTurkeyNumber(Object turkeyNumber) {
		this.turkeyNumber = turkeyNumber;
	}






	public String getIdDetailCode() {
		return idDetailCode;
	}






	public void setIdDetailCode(String idDetailCode) {
		this.idDetailCode = idDetailCode;
	}






	@Override
	public String toString() {
		return "Passenger [passportIssueCountryCode=" + passportIssueCountryCode + ", passportIssueDate="
				+ passportIssueDate + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobile1=" + mobile1 + ", mobile1CountryCode=" + mobile1CountryCode + ", mobile2=" + mobile2
				+ ", mobile2CountryCode=" + mobile2CountryCode + ", isLeadPax=" + isLeadPax + ", dateOfBirth="
				+ dateOfBirth + ", type=" + type + ", passportNo=" + passportNo + ", nationality=" + nationality
				+ ", country=" + country + ", city=" + city + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", gender=" + gender + ", email=" + email + ", meal=" + meal + ", seat=" + seat
				+ ", fare=" + fare + ", fFAirline=" + fFAirline + ", fFNumber=" + fFNumber + ", passportExpiry="
				+ passportExpiry + ", paxBaggage=" + paxBaggage + ", paxMeal=" + paxMeal + ", iDCardNo=" + iDCardNo
				+ ", zipCode=" + zipCode + ", paxSeat=" + paxSeat + ", ticket=" + ticket + ", turkeyNumber="
				+ turkeyNumber + ", idDetailCode=" + idDetailCode + "]";
	}
	
	
	
    
    

}
