package ws.api.gds.tbo.ms.model;

 

import java.math.BigDecimal; 
import java.util.List;



public class ItineraryInfoModel {

	private List<CustomerInfoModel> customerInfos;
	private ItineraryPricingModel itineraryPricing;
	// private ItineraryPricingModel itineraryPricingCurrencyClient;
	private List<ReservationItemModel> reservationItems;
	private List<TripDetailsPTCFareBreakdownModel> tripDetailsPTCFareBreakdowns;
	private List<String> messages;
	private boolean canOrder;
	private boolean canCancel;
	private String tktTimeLimit;
	private boolean formOfPaymentExist;
	private boolean commissionAirlineExist;

	// Flight14
	private String codeRoute;
	
	private String txtVendorRemarks;
	
	 
	 
	 
	public ItineraryInfoModel() {
		super();

	}

	public ItineraryInfoModel(List<CustomerInfoModel> customerInfos, ItineraryPricingModel itineraryPricing,
			List<ReservationItemModel> reservationItems,
			List<TripDetailsPTCFareBreakdownModel> tripDetailsPTCFareBreakdowns) {
		super();
		this.customerInfos = customerInfos;
		this.itineraryPricing = itineraryPricing;
		this.reservationItems = reservationItems;
		this.tripDetailsPTCFareBreakdowns = tripDetailsPTCFareBreakdowns;
	}

 

	public List<CustomerInfoModel> getCustomerInfos() {
		return customerInfos;
	}

	public void setCustomerInfos(List<CustomerInfoModel> customerInfos) {
		this.customerInfos = customerInfos;
	}

	public ItineraryPricingModel getItineraryPricing() {
		return itineraryPricing;
	}

	public void setItineraryPricing(ItineraryPricingModel itineraryPricing) {
		this.itineraryPricing = itineraryPricing;
	}

	public List<ReservationItemModel> getReservationItems() {
		return reservationItems;
	}

	public void setReservationItems(List<ReservationItemModel> reservationItems) {
		this.reservationItems = reservationItems;
	}

	public List<TripDetailsPTCFareBreakdownModel> getTripDetailsPTCFareBreakdowns() {
		return tripDetailsPTCFareBreakdowns;
	}

	public void setTripDetailsPTCFareBreakdowns(List<TripDetailsPTCFareBreakdownModel> tripDetailsPTCFareBreakdowns) {
		this.tripDetailsPTCFareBreakdowns = tripDetailsPTCFareBreakdowns;
	}

	// public ItineraryPricingModel getItineraryPricingCurrencyClient() {
	// return itineraryPricingCurrencyClient;
	// }
	//
	// public void setItineraryPricingCurrencyClient(ItineraryPricingModel
	// itineraryPricingCurrencyClient) {
	// this.itineraryPricingCurrencyClient = itineraryPricingCurrencyClient;
	// }

 

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public boolean isCanOrder() {
		return canOrder;
	}

	public void setCanOrder(boolean canOrder) {
		this.canOrder = canOrder;
	}

	public boolean isCanCancel() {
		return canCancel;
	}

	public void setCanCancel(boolean canCancel) {
		this.canCancel = canCancel;
	}

	

 
	public void formatResult() {
		this.tripDetailsPTCFareBreakdowns = null;
	}

	@Override
	public String toString() {
		return "ItineraryInfoModel [customerInfos=" + customerInfos + ", itineraryPricing=" + itineraryPricing
				+ ", reservationItems=" + reservationItems + ", tripDetailsPTCFareBreakdowns="
				+ tripDetailsPTCFareBreakdowns + ", messages=" + messages + ", canOrder=" + canOrder + ", canCancel="
				+ canCancel + "]";
	}

	public String getCodeRoute() {
		return codeRoute;
	}

	public void setCodeRoute(String codeRoute) {
		this.codeRoute = codeRoute;
	}

	

	public String getTktTimeLimit() {
		return tktTimeLimit;
	}

	public void setTktTimeLimit(String tktTimeLimit) {
		this.tktTimeLimit = tktTimeLimit;
	}

	public boolean isFormOfPaymentExist() {
		return formOfPaymentExist;
	}

	public void setFormOfPaymentExist(boolean formOfPaymentExist) {
		this.formOfPaymentExist = formOfPaymentExist;
		
	}

	public boolean isCommissionAirlineExist() {
		return commissionAirlineExist;
	}

	public void setCommissionAirlineExist(boolean commissionAirlineExist) {
		this.commissionAirlineExist = commissionAirlineExist;
	}

	
	public String getTxtVendorRemarks() {
		return txtVendorRemarks;
	}
	public void setTxtVendorRemarks(String txtVendorRemarks) {
		this.txtVendorRemarks = txtVendorRemarks;
	}
	

}
