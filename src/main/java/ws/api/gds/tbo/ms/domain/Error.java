package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
	@JsonProperty("Code")
	private Integer errorCode;
	@JsonProperty("UserMessage")
	private String errorMessage;
	
	
	public Error() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Error(Integer errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}



	public Integer getErrorCode() {
		return errorCode;
	}



	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}



	public String getErrorMessage() {
		return errorMessage;
	}



	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	@Override
	public String toString() {
		return "Error [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
	
	
	





	
	
	

}
