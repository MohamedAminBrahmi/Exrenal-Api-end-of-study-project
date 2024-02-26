package ws.api.gds.tbo.ms.model;
 
public class ErrorModel {

	private String code;
	private String message;


	public ErrorModel(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ErrorModel() {
		super();
	}

	public ErrorModel(String error) {
		this.message = error;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorModel [code=" + code + ", message=" + message + "]";
	}
	
	@Override
	protected ErrorModel clone() throws CloneNotSupportedException {
		return (ErrorModel) super.clone();
	}

}
