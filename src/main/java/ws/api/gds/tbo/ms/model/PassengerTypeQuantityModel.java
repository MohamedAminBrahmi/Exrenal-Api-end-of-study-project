package ws.api.gds.tbo.ms.model;
 
public class PassengerTypeQuantityModel implements Cloneable {

	private String code;
	private Integer quantity;

	public PassengerTypeQuantityModel(String code, Integer quantity) {
		System.out.println(code + " " + quantity);
		this.code = code;
		this.quantity = quantity;
	}

	public PassengerTypeQuantityModel() {
		super();
	}
  

	public PassengerTypeQuantityModel(PassengerTypeQuantityModel passengerTypeQuantity) {
		this.quantity = passengerTypeQuantity.getQuantity();
		this.code = passengerTypeQuantity.getCode();
	}
 
	
 
	@Override
	protected PassengerTypeQuantityModel clone() throws CloneNotSupportedException {
		return (PassengerTypeQuantityModel) super.clone();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "PassengerTypeQuantityModel [code=" + code + ", quantity=" + quantity + "]";
	}

}
