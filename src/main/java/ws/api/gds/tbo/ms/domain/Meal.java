package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {
	
	@JsonProperty("Code") 
	private String code;
    @JsonProperty("Description") 
    private String description;
	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Meal(String code, String description) {
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
		return "Meal [code=" + code + ", description=" + description + "]";
	}
    
    

}
