package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MealList {
	@JsonProperty("OutWard") 
    private ArrayList<OutWard> outWard;

	public MealList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MealList(ArrayList<OutWard> outWard) {
		this.outWard = outWard;
	}

	public ArrayList<OutWard> getOutWard() {
		return outWard;
	}

	public void setOutWard(ArrayList<OutWard> outWard) {
		this.outWard = outWard;
	}

	@Override
	public String toString() {
		return "MealList [outWard=" + outWard + "]";
	}
	
	
}
