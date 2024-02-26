package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatList {
	@JsonProperty("SeatList") 
	public ArrayList<Seat> seat;

	
	
	
	
	
	
	
	
	public SeatList() {
		super();
		// TODO Auto-generated constructor stub
	}









	public SeatList(ArrayList<Seat> seat) {
		this.seat = seat;
	}









	public ArrayList<Seat> getSeat() {
		return seat;
	}









	public void setSeat(ArrayList<Seat> seat) {
		this.seat = seat;
	}









	@Override
	public String toString() {
		return "SeatList [seat=" + seat + "]";
	}
	
	
	

}
