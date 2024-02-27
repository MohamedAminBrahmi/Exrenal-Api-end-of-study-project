package ws.api.gds.tbo.ms.model;



import java.math.BigDecimal;
import java.util.List; 


 
public class CustomerInfoModel {
	private BigDecimal idSeqImport;
	private SessionJasperModel sessionJasper;
	private CustomerModel customer;
	private List<ETicketModel> eTickets;
	private List<SSRModel> ssRs;
	private Boolean displayPrice;


	 

	public CustomerInfoModel() {
		super();
	}

	public CustomerInfoModel(CustomerModel customer, List<ETicketModel> eTickets, List<SSRModel> ssRs) {
		super();
		this.customer = customer;
		this.eTickets = eTickets;
		this.ssRs = ssRs;
	}

	 

	 

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}

	public List<ETicketModel> geteTickets() {
		return eTickets;
	}

	public void seteTickets(List<ETicketModel> eTickets) {
		this.eTickets = eTickets;
	}

	public List<SSRModel> getSsRs() {
		return ssRs;
	}

	public void setSsRs(List<SSRModel> ssRs) {
		this.ssRs = ssRs;
	}

	public BigDecimal getIdSeqImport() {
		return idSeqImport;
	}

	public void setIdSeqImport(BigDecimal idSeqImport) {
		this.idSeqImport = idSeqImport;
	}

	public SessionJasperModel getSessionJasper() {
		return sessionJasper;
	}

	public void setSessionJasper(SessionJasperModel sessionJasper) {
		this.sessionJasper = sessionJasper;
	}

	public Boolean getDisplayPrice() {
		return displayPrice;
	}

	public void setDisplayPrice(Boolean displayPrice) {
		this.displayPrice = displayPrice;
	}

}
