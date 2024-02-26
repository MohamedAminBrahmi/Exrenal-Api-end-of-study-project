package ws.api.gds.tbo.ms.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareQuoteResponse {
	@JsonProperty("Status") 
    private int status;
    @JsonProperty("IsPriceChanged") 
    private boolean isPriceChanged;
    @JsonProperty("Result") 
    private ArrayList<Result> result;
    @JsonProperty("IsDocumentInfoReqOnHold") 
    private boolean isDocumentInfoReqOnHold;
    @JsonProperty("IsDocumentFullInfoReq") 
    private boolean isDocumentFullInfoReq;
    @JsonProperty("IsDocumentFullDetailRequiredAtBook") 
    private boolean isDocumentFullDetailRequiredAtBook;
    @JsonProperty("IsDocumentInfoReqOnTicket") 
    private boolean isDocumentInfoReqOnTicket;
    @JsonProperty("IsPassportInfoReqOnHold") 
    private boolean isPassportInfoReqOnHold;
    @JsonProperty("IsPassportFullInfoReq") 
    private boolean isPassportFullInfoReq;
    @JsonProperty("IsBaggageChanged") 
    private boolean isBaggageChanged;
    @JsonProperty("IsPassportFullDetailRequiredAtBook") 
    private boolean isPassportFullDetailRequiredAtBook;
    @JsonProperty("FoidDetails") 
    private Object foidDetails;
    @JsonProperty("IsPassportInfoReqOnTicket") 
    private boolean isPassportInfoReqOnTicket;
    @JsonProperty("ValidDocumentTypes") 
    private Object validDocumentTypes;
    @JsonProperty("LocalCurrency") 
    private Object localCurrency;
    @JsonProperty("LocalCurrencyROE") 
    private double localCurrencyROE;
    @JsonProperty("NationalitiesForOptionalPassport") 
    private Object nationalitiesForOptionalPassport;
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

	
		public FareQuoteResponse() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public FareQuoteResponse(int status, boolean isPriceChanged, ArrayList<Result> result,
				boolean isDocumentInfoReqOnHold, boolean isDocumentFullInfoReq,
				boolean isDocumentFullDetailRequiredAtBook, boolean isDocumentInfoReqOnTicket,
				boolean isPassportInfoReqOnHold, boolean isPassportFullInfoReq, boolean isBaggageChanged,
				boolean isPassportFullDetailRequiredAtBook, Object foidDetails, boolean isPassportInfoReqOnTicket,
				Object validDocumentTypes, Object localCurrency, double localCurrencyROE,
				Object nationalitiesForOptionalPassport, boolean isSuccess, ArrayList<Error> errors,
				ArrayList<Object> alerts, String tokenId, String trackingId) {
			this.status = status;
			this.isPriceChanged = isPriceChanged;
			this.result = result;
			this.isDocumentInfoReqOnHold = isDocumentInfoReqOnHold;
			this.isDocumentFullInfoReq = isDocumentFullInfoReq;
			this.isDocumentFullDetailRequiredAtBook = isDocumentFullDetailRequiredAtBook;
			this.isDocumentInfoReqOnTicket = isDocumentInfoReqOnTicket;
			this.isPassportInfoReqOnHold = isPassportInfoReqOnHold;
			this.isPassportFullInfoReq = isPassportFullInfoReq;
			this.isBaggageChanged = isBaggageChanged;
			this.isPassportFullDetailRequiredAtBook = isPassportFullDetailRequiredAtBook;
			this.foidDetails = foidDetails;
			this.isPassportInfoReqOnTicket = isPassportInfoReqOnTicket;
			this.validDocumentTypes = validDocumentTypes;
			this.localCurrency = localCurrency;
			this.localCurrencyROE = localCurrencyROE;
			this.nationalitiesForOptionalPassport = nationalitiesForOptionalPassport;
			this.isSuccess = isSuccess;
			this.errors = errors;
			this.alerts = alerts;
			this.tokenId = tokenId;
			this.trackingId = trackingId;
		}

		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public boolean isPriceChanged() {
			return isPriceChanged;
		}
		public void setPriceChanged(boolean isPriceChanged) {
			this.isPriceChanged = isPriceChanged;
		}
		public ArrayList<Result> getResult() {
			return result;
		}
		public void setResult(ArrayList<Result> result) {
			this.result = result;
		}
		public boolean isPassportInfoReqOnHold() {
			return isPassportInfoReqOnHold;
		}
		public void setPassportInfoReqOnHold(boolean isPassportInfoReqOnHold) {
			this.isPassportInfoReqOnHold = isPassportInfoReqOnHold;
		}
		public boolean isPassportFullInfoReq() {
			return isPassportFullInfoReq;
		}
		public void setPassportFullInfoReq(boolean isPassportFullInfoReq) {
			this.isPassportFullInfoReq = isPassportFullInfoReq;
		}
		public boolean isBaggageChanged() {
			return isBaggageChanged;
		}
		public void setBaggageChanged(boolean isBaggageChanged) {
			this.isBaggageChanged = isBaggageChanged;
		}
		public boolean isPassportInfoReqOnTicket() {
			return isPassportInfoReqOnTicket;
		}
		public void setPassportInfoReqOnTicket(boolean isPassportInfoReqOnTicket) {
			this.isPassportInfoReqOnTicket = isPassportInfoReqOnTicket;
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
		
		
		
		public boolean isDocumentInfoReqOnHold() {
			return isDocumentInfoReqOnHold;
		}

		public void setDocumentInfoReqOnHold(boolean isDocumentInfoReqOnHold) {
			this.isDocumentInfoReqOnHold = isDocumentInfoReqOnHold;
		}

		public boolean isDocumentFullInfoReq() {
			return isDocumentFullInfoReq;
		}

		public void setDocumentFullInfoReq(boolean isDocumentFullInfoReq) {
			this.isDocumentFullInfoReq = isDocumentFullInfoReq;
		}

		public boolean isDocumentFullDetailRequiredAtBook() {
			return isDocumentFullDetailRequiredAtBook;
		}

		public void setDocumentFullDetailRequiredAtBook(boolean isDocumentFullDetailRequiredAtBook) {
			this.isDocumentFullDetailRequiredAtBook = isDocumentFullDetailRequiredAtBook;
		}

		public boolean isDocumentInfoReqOnTicket() {
			return isDocumentInfoReqOnTicket;
		}

		public void setDocumentInfoReqOnTicket(boolean isDocumentInfoReqOnTicket) {
			this.isDocumentInfoReqOnTicket = isDocumentInfoReqOnTicket;
		}

		public boolean isPassportFullDetailRequiredAtBook() {
			return isPassportFullDetailRequiredAtBook;
		}

		public void setPassportFullDetailRequiredAtBook(boolean isPassportFullDetailRequiredAtBook) {
			this.isPassportFullDetailRequiredAtBook = isPassportFullDetailRequiredAtBook;
		}

		public Object getFoidDetails() {
			return foidDetails;
		}

		public void setFoidDetails(Object foidDetails) {
			this.foidDetails = foidDetails;
		}

		public Object getValidDocumentTypes() {
			return validDocumentTypes;
		}

		public void setValidDocumentTypes(Object validDocumentTypes) {
			this.validDocumentTypes = validDocumentTypes;
		}

		public Object getLocalCurrency() {
			return localCurrency;
		}

		public void setLocalCurrency(Object localCurrency) {
			this.localCurrency = localCurrency;
		}

		public double getLocalCurrencyROE() {
			return localCurrencyROE;
		}

		public void setLocalCurrencyROE(double localCurrencyROE) {
			this.localCurrencyROE = localCurrencyROE;
		}

		public Object getNationalitiesForOptionalPassport() {
			return nationalitiesForOptionalPassport;
		}

		public void setNationalitiesForOptionalPassport(Object nationalitiesForOptionalPassport) {
			this.nationalitiesForOptionalPassport = nationalitiesForOptionalPassport;
		}

		@Override
		public String toString() {
			return "FareQuoteResponse [status=" + status + ", isPriceChanged=" + isPriceChanged + ", result=" + result
					+ ", isDocumentInfoReqOnHold=" + isDocumentInfoReqOnHold + ", isDocumentFullInfoReq="
					+ isDocumentFullInfoReq + ", isDocumentFullDetailRequiredAtBook="
					+ isDocumentFullDetailRequiredAtBook + ", isDocumentInfoReqOnTicket=" + isDocumentInfoReqOnTicket
					+ ", isPassportInfoReqOnHold=" + isPassportInfoReqOnHold + ", isPassportFullInfoReq="
					+ isPassportFullInfoReq + ", isBaggageChanged=" + isBaggageChanged
					+ ", isPassportFullDetailRequiredAtBook=" + isPassportFullDetailRequiredAtBook + ", foidDetails="
					+ foidDetails + ", isPassportInfoReqOnTicket=" + isPassportInfoReqOnTicket + ", validDocumentTypes="
					+ validDocumentTypes + ", localCurrency=" + localCurrency + ", localCurrencyROE=" + localCurrencyROE
					+ ", nationalitiesForOptionalPassport=" + nationalitiesForOptionalPassport + ", isSuccess="
					+ isSuccess + ", errors=" + errors + ", alerts=" + alerts + ", tokenId=" + tokenId + ", trackingId="
					+ trackingId + "]";
		}

		
	    
	    

}
