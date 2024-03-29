package ws.api.gds.tbo.ms.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
	@JsonProperty("TicketNumber") 
	private Object ticketNumber;
    @JsonProperty("Remarks") 
    private Object remarks;
    @JsonProperty("ValidatingAriline") 
    private Object validatingAriline;
    @JsonProperty("IssueDate") 
    private Date issueDate;
    @JsonProperty("Status") 
    private Object status;
    @JsonProperty("PtcDetail") 
    private Object ptcDetail;
    
    
    
    
    
    
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Ticket(Object ticketNumber, Object remarks, Object validatingAriline, Date issueDate, Object status,
			Object ptcDetail) {
		this.ticketNumber = ticketNumber;
		this.remarks = remarks;
		this.validatingAriline = validatingAriline;
		this.issueDate = issueDate;
		this.status = status;
		this.ptcDetail = ptcDetail;
	}






	public Object getTicketNumber() {
		return ticketNumber;
	}






	public void setTicketNumber(Object ticketNumber) {
		this.ticketNumber = ticketNumber;
	}






	public Object getRemarks() {
		return remarks;
	}






	public void setRemarks(Object remarks) {
		this.remarks = remarks;
	}






	public Object getValidatingAriline() {
		return validatingAriline;
	}






	public void setValidatingAriline(Object validatingAriline) {
		this.validatingAriline = validatingAriline;
	}






	public Date getIssueDate() {
		return issueDate;
	}






	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}






	public Object getStatus() {
		return status;
	}






	public void setStatus(Object status) {
		this.status = status;
	}






	public Object getPtcDetail() {
		return ptcDetail;
	}






	public void setPtcDetail(Object ptcDetail) {
		this.ptcDetail = ptcDetail;
	}






	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", remarks=" + remarks + ", validatingAriline="
				+ validatingAriline + ", issueDate=" + issueDate + ", status=" + status + ", ptcDetail=" + ptcDetail
				+ "]";
	}
    
	
    

}
