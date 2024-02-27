package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationRequest {
		@JsonProperty("UserName")
	    private String userName;
		@JsonProperty("Password")
	    private String password;
		@JsonProperty("BookingMode")
	    private String bookingMode;
		@JsonProperty("IPAddress")
	    private String iPAddress;
	    
	    
	    
	    
		public AuthenticationRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public AuthenticationRequest(String userName, String password, String bookingMode, String iPAddress) {
			super();
			this.userName = userName;
			this.password = password;
			this.bookingMode = bookingMode;
			this.iPAddress = iPAddress;
		}
		@JsonProperty("UserName")
		public String getUserName() {
			return userName;
		}
		@JsonProperty("UserName")
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@JsonProperty("Password")
		public String getPassword() {
			return password;
		}
		@JsonProperty("Password")
		public void setPassword(String password) {
			this.password = password;
		}
		public String getBookingMode() {
			return bookingMode;
		}
		public void setBookingMode(String bookingMode) {
			this.bookingMode = bookingMode;
		}
		public String getiPAddress() {
			return iPAddress;
		}
		public void setiPAddress(String iPAddress) {
			this.iPAddress = iPAddress;
		}
		@Override
		public String toString() {
			return "AuthenticationRequest [userName=" + userName + ", password=" + password + ", bookingMode="
					+ bookingMode + ", iPAddress=" + iPAddress + "]";
		}	   
		
	    
	   

	
	
	

}
