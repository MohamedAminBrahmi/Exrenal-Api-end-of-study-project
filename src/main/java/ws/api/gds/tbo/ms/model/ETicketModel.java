package ws.api.gds.tbo.ms.model;
 

public class ETicketModel {

	private Integer itemRPH;
	private String eTicketNumber;

 

	public ETicketModel(Integer itemRPH, String eTicketNumber) {
		super();
		this.itemRPH = itemRPH;
		this.eTicketNumber = eTicketNumber;
	}

	public ETicketModel() {
		super();
	}

	public ETicketModel(String numTicket) {
		this.eTicketNumber = numTicket;
	}

	 
	public Integer getItemRPH() {
		return itemRPH;
	}

	public void setItemRPH(Integer itemRPH) {
		this.itemRPH = itemRPH;
	}

	public String geteTicketNumber() {
		return eTicketNumber;
	}

	public void seteTicketNumber(String eTicketNumber) {
		this.eTicketNumber = eTicketNumber;
	}

}
