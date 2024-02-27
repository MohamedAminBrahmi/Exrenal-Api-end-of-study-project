package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealDynamicList {
	@JsonProperty("OutWard") 
	private ArrayList<OutWard> outWard;
    @JsonProperty("Return") 
    private ArrayList<Return> rreturn;
	public MealDynamicList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MealDynamicList(ArrayList<OutWard> outWard, ArrayList<Return> rreturn) {
		this.outWard = outWard;
		this.rreturn = rreturn;
	}
	public ArrayList<OutWard> getOutWard() {
		return outWard;
	}
	public void setOutWard(ArrayList<OutWard> outWard) {
		this.outWard = outWard;
	}
	public ArrayList<Return> getRreturn() {
		return rreturn;
	}
	public void setRreturn(ArrayList<Return> rreturn) {
		this.rreturn = rreturn;
	}
	@Override
	public String toString() {
		return "MealDynamicList [outWard=" + outWard + ", rreturn=" + rreturn + "]";
	}
    
    

}
