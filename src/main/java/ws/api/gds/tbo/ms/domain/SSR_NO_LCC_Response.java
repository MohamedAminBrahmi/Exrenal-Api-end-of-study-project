package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SSR_NO_LCC_Response {
	 	@JsonProperty("BaggageList") 
	 	private BaggageList baggageList;
	    @JsonProperty("MealDynamicList") 
	    private MealDynamicList mealDynamicList;
	    @JsonProperty("SeatDynamicList") 
	    private SeatDynamicList seatDynamicList;
	    @JsonProperty("SeatList") 
	    private SeatList seatList;
	    @JsonProperty("SeatDList") 
	    private Object seatDList;
	    @JsonProperty("MealList") 
	    private MealList mealList;
	    @JsonProperty("IsSuccess") 
	    private boolean isSuccess;
	    @JsonProperty("Errors") 
	    private ArrayList<Error> errors;
	    @JsonProperty("Alerts") 
	    private ArrayList<Object> alerts;
	    @JsonProperty("TokenId") 
	    private String tokenId;
	    @JsonProperty("TrackingId") 
	    private String trackingId;
	    
		public SSR_NO_LCC_Response() {
			super();
			// TODO Auto-generated constructor stub
		}
		public SSR_NO_LCC_Response(BaggageList baggageList, MealDynamicList mealDynamicList,
				SeatDynamicList seatDynamicList, SeatList seatList, Object seatDList, MealList mealList,
				boolean isSuccess, ArrayList<Error> errors, ArrayList<Object> alerts, String tokenId,
				String trackingId) {
			this.baggageList = baggageList;
			this.mealDynamicList = mealDynamicList;
			this.seatDynamicList = seatDynamicList;
			this.seatList = seatList;
			this.seatDList = seatDList;
			this.mealList = mealList;
			this.isSuccess = isSuccess;
			this.errors = errors;
			this.alerts = alerts;
			this.tokenId = tokenId;
			this.trackingId = trackingId;
		}
		public BaggageList getBaggageList() {
			return baggageList;
		}
		public void setBaggageList(BaggageList baggageList) {
			this.baggageList = baggageList;
		}
		public MealDynamicList getMealDynamicList() {
			return mealDynamicList;
		}
		public void setMealDynamicList(MealDynamicList mealDynamicList) {
			this.mealDynamicList = mealDynamicList;
		}
		public SeatDynamicList getSeatDynamicList() {
			return seatDynamicList;
		}
		public void setSeatDynamicList(SeatDynamicList seatDynamicList) {
			this.seatDynamicList = seatDynamicList;
		}
		public SeatList getSeatList() {
			return seatList;
		}
		public void setSeatList(SeatList seatList) {
			this.seatList = seatList;
		}
		public Object getSeatDList() {
			return seatDList;
		}
		public void setSeatDList(Object seatDList) {
			this.seatDList = seatDList;
		}
		public MealList getMealList() {
			return mealList;
		}
		public void setMealList(MealList mealList) {
			this.mealList = mealList;
		}
		public boolean isSuccess() {
			return isSuccess;
		}
		public void setSuccess(boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
		public ArrayList<Error> getErrors() {
			return errors;
		}
		public void setErrors(ArrayList<Error> errors) {
			this.errors = errors;
		}
		public ArrayList<Object> getAlerts() {
			return alerts;
		}
		public void setAlerts(ArrayList<Object> alerts) {
			this.alerts = alerts;
		}
		public String getTokenId() {
			return tokenId;
		}
		public void setTokenId(String tokenId) {
			this.tokenId = tokenId;
		}
		public String getTrackingId() {
			return trackingId;
		}
		public void setTrackingId(String trackingId) {
			this.trackingId = trackingId;
		}
		@Override
		public String toString() {
			return "SSR_NO_LCC_Response [baggageList=" + baggageList + ", mealDynamicList=" + mealDynamicList
					+ ", seatDynamicList=" + seatDynamicList + ", seatList=" + seatList + ", seatDList=" + seatDList
					+ ", mealList=" + mealList + ", isSuccess=" + isSuccess + ", errors=" + errors + ", alerts="
					+ alerts + ", tokenId=" + tokenId + ", trackingId=" + trackingId + ", getBaggageList()="
					+ getBaggageList() + ", getMealDynamicList()=" + getMealDynamicList() + ", getSeatDynamicList()="
					+ getSeatDynamicList() + ", getSeatList()=" + getSeatList() + ", getSeatDList()=" + getSeatDList()
					+ ", getMealList()=" + getMealList() + ", isSuccess()=" + isSuccess() + ", getErrors()="
					+ getErrors() + ", getAlerts()=" + getAlerts() + ", getTokenId()=" + getTokenId()
					+ ", getTrackingId()=" + getTrackingId() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + ", toString()=" + super.toString() + "]";
		}
	    
	    

}
