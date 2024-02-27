package ws.api.gds.tbo.ms.model;



import java.math.BigDecimal;
import java.util.List;




public class SSRModel {

	private Integer itemRPH;
	private String mealPreference;
	private String seatPreference;
	
	////Jazeera SSR
	private String ssrType;
	private String ssrName;
	private String ssrCode;
	private List<SSRPassenger> passengersAvailability;
	private String ssrCurrency;
	private BigDecimal ssrAmount;
	
	public SSRModel() {
		super();
	}

 


public SSRModel(Integer itemRPH, String mealPreference, String seatPreference, String ssrType, String ssrName,
			String ssrCode, List<SSRPassenger> passengersAvailability, String ssrCurrency, BigDecimal ssrAmount) {
		super();
		this.itemRPH = itemRPH;
		this.mealPreference = mealPreference;
		this.seatPreference = seatPreference;
		this.ssrType = ssrType;
		this.ssrName = ssrName;
		this.ssrCode = ssrCode;
		this.passengersAvailability = passengersAvailability;
		this.ssrCurrency = ssrCurrency;
		this.ssrAmount = ssrAmount;
	}




	

	public Integer getItemRPH() {
		return itemRPH;
	}

	public void setItemRPH(Integer itemRPH) {
		this.itemRPH = itemRPH;
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

	public String getSsrType() {
		return ssrType;
	}

	public void setSsrType(String ssrType) {
		this.ssrType = ssrType;
	}

	public String getSsrName() {
		return ssrName;
	}

	public void setSsrName(String ssrName) {
		this.ssrName = ssrName;
	}

	public List<SSRPassenger> getPassengersAvailability() {
		return passengersAvailability;
	}

	public void setPassengersAvailability(List<SSRPassenger> passengersAvailability) {
		this.passengersAvailability = passengersAvailability;
	}

	

	public String getSsrCode() {
		return ssrCode;
	}

	public void setSsrCode(String ssrCode) {
		this.ssrCode = ssrCode;
	}



	public String getSsrCurrency() {
		return ssrCurrency;
	}



	public void setSsrCurrency(String ssrCurrency) {
		this.ssrCurrency = ssrCurrency;
	}



	public BigDecimal getSsrAmount() {
		return ssrAmount;
	}



	public void setSsrAmount(BigDecimal ssrAmount) {
		this.ssrAmount = ssrAmount;
	}

}
