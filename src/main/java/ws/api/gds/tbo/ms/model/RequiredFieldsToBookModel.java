package ws.api.gds.tbo.ms.model;

 

import java.util.List;

public class RequiredFieldsToBookModel implements Cloneable {

	private Boolean dobRequired;
	private Boolean titleRequired;
	private Boolean genderRequired;
	private Boolean nationalityRequired;
	private Boolean passportNumberRequired;
	private Boolean passportExpiryRequired;
	private Boolean issueCountryRequired;
	private Boolean nationalIDRequired;

	public RequiredFieldsToBookModel() {
		super();
	}

	public RequiredFieldsToBookModel(List<String> requiredFieldsToBooklist) {
		for (String required : requiredFieldsToBooklist) {
			if (required.toUpperCase().equals("DOB")) {
				dobRequired = true;
			}

			if (required.toUpperCase().equals("TITLE")) {
				titleRequired = true;
			}

			if (required.toUpperCase().equals("NATIONALITY")) {
				nationalityRequired = true;
			}

			if (required.toUpperCase().equals("GENDER")) {
				genderRequired = true;
			}

			if (required.toUpperCase().contains("EXPIRY")) {
				passportExpiryRequired = true;
			}

			if (required.toUpperCase().contains("PASSPORT")) {
				passportNumberRequired = true;
			}
		}
	}

	public RequiredFieldsToBookModel(boolean b) {
		dobRequired = b;
		titleRequired = b;
		nationalityRequired = b;
		genderRequired = b;
		passportExpiryRequired = b;
		passportNumberRequired = b;
	}

	public Boolean getDobRequired() {
		return dobRequired;
	}

	public void setDobRequired(Boolean dobRequired) {
		this.dobRequired = dobRequired;
	}

	public Boolean getTitleRequired() {
		return titleRequired;
	}

	public void setTitleRequired(Boolean titleRequired) {
		this.titleRequired = titleRequired;
	}

	public Boolean getGenderRequired() {
		return genderRequired;
	}

	public void setGenderRequired(Boolean genderRequired) {
		this.genderRequired = genderRequired;
	}

	public Boolean getNationalityRequired() {
		return nationalityRequired;
	}

	public void setNationalityRequired(Boolean nationalityRequired) {
		this.nationalityRequired = nationalityRequired;
	}

	public Boolean getPassportNumberRequired() {
		return passportNumberRequired;
	}

	public void setPassportNumberRequired(Boolean passportNumberRequired) {
		this.passportNumberRequired = passportNumberRequired;
	}

	public Boolean getPassportExpiryRequired() {
		return passportExpiryRequired;
	}

	public void setPassportExpiryRequired(Boolean passportExpiryRequired) {
		this.passportExpiryRequired = passportExpiryRequired;
	}
	
	public Boolean getIssueCountryRequired() {
		return issueCountryRequired;
	}

	public void setIssueCountryRequired(Boolean issueCountryRequired) {
		this.issueCountryRequired = issueCountryRequired;
	}

	public Boolean getNationalIDRequired() {
		return nationalIDRequired;
	}

	public void setNationalIDRequired(Boolean nationalIDRequired) {
		this.nationalIDRequired = nationalIDRequired;
	}

	@Override
	protected RequiredFieldsToBookModel clone() throws CloneNotSupportedException {
		return (RequiredFieldsToBookModel) super.clone();
	}

}
