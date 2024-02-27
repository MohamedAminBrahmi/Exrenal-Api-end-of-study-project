package ws.api.gds.tbo.ms.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger {
	
	@JsonProperty("Title") 
	private String title;
    @JsonProperty("FirstName") 
    private String firstName;
    @JsonProperty("LastName") 
    private String lastName;
    @JsonProperty("Type") 
    private String type;
    @JsonProperty("DateOfBirth") 
    private Date dateOfBirth;
    @JsonProperty("Gender") 
    private String gender;
    @JsonProperty("PassportNo") 
    private String passportNo;
    @JsonProperty("PassportExpiry") 
    private Date passportExpiry;
    @JsonProperty("AddressLine1") 
    private String addressLine1;
    @JsonProperty("AddressLine2") 
    private String addressLine2;
    @JsonProperty("Nationality") 
    private Nationality nationality;
    @JsonProperty("Country") 
    private Country country;
    @JsonProperty("City") 
    private City city;
    @JsonProperty("Meal") 
    private Meal meal;
    @JsonProperty("Seat") 
    private Object seat;
    @JsonProperty("Mobile1") 
    private String mobile1;
    @JsonProperty("Mobile1CountryCode") 
    private String mobile1CountryCode;
    @JsonProperty("Email") 
    private String email;
    @JsonProperty("IsLeadPax") 
    private boolean isLeadPax;
    @JsonProperty("FFAirline") 
    private Object fFAirline;
    @JsonProperty("FFNumber") 
    private Object fFNumber;
    @JsonProperty("Fare") 
    private Fare fare;
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(String title, String firstName, String lastName, String type, Date dateOfBirth, String gender,
			String passportNo, Date passportExpiry, String addressLine1, String addressLine2, Nationality nationality,
			Country country, City city, Meal meal, Object seat, String mobile1, String mobile1CountryCode, String email,
			boolean isLeadPax, Object fFAirline, Object fFNumber, Fare fare) {
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.passportNo = passportNo;
		this.passportExpiry = passportExpiry;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.nationality = nationality;
		this.country = country;
		this.city = city;
		this.meal = meal;
		this.seat = seat;
		this.mobile1 = mobile1;
		this.mobile1CountryCode = mobile1CountryCode;
		this.email = email;
		this.isLeadPax = isLeadPax;
		this.fFAirline = fFAirline;
		this.fFNumber = fFNumber;
		this.fare = fare;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Date getPassportExpiry() {
		return passportExpiry;
	}
	public void setPassportExpiry(Date passportExpiry) {
		this.passportExpiry = passportExpiry;
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
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	public Object getSeat() {
		return seat;
	}
	public void setSeat(Object seat) {
		this.seat = seat;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isLeadPax() {
		return isLeadPax;
	}
	public void setLeadPax(boolean isLeadPax) {
		this.isLeadPax = isLeadPax;
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
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "Passenger [title=" + title + ", firstName=" + firstName + ", lastName=" + lastName + ", type=" + type
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", passportNo=" + passportNo
				+ ", passportExpiry=" + passportExpiry + ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", nationality=" + nationality + ", country=" + country + ", city=" + city + ", meal="
				+ meal + ", seat=" + seat + ", mobile1=" + mobile1 + ", mobile1CountryCode=" + mobile1CountryCode
				+ ", email=" + email + ", isLeadPax=" + isLeadPax + ", fFAirline=" + fFAirline + ", fFNumber="
				+ fFNumber + ", fare=" + fare + "]";
	}
    
    

}
