package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Seat {
	@JsonProperty("Code") 
	private String code;
    @JsonProperty("Description") 
    private String description;
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seat(String code, String description) {
		this.code = code;
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Seat [code=" + code + ", description=" + description + "]";
	}
    
    

}
