package ws.api.gds.tbo.ms.model;


public class CustomerModel {

	private String passengerType;
	private String passportNumber;
	private PaxNameModel paxName;

	 
	
	 

	public CustomerModel() {
		super();
	}

	public CustomerModel(String passengerType, String passportNumber, PaxNameModel paxName) {
		super();
		this.passengerType = passengerType != null ? passengerType : "ADT";
		this.passportNumber = passportNumber;
		this.paxName = paxName;
	}
 
 

 
	

	
	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public PaxNameModel getPaxName() {
		return paxName;
	}

	public void setPaxName(PaxNameModel paxName) {
		this.paxName = paxName;
	}

	@Override
	public String toString() {
		return "CustomerModel [passengerType=" + passengerType + ", passportNumber=" + passportNumber + ", paxName="
				+ paxName + "]";
	}

}
