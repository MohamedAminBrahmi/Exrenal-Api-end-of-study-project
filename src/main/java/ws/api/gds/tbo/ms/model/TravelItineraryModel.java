package ws.api.gds.tbo.ms.model;


import java.util.List;


public class TravelItineraryModel {

	private List<String> bookingNotes;
	private ItineraryInfoModel itineraryInfo;
	private String uniqueID;
	private List<ExtraServicesModel> extraServices;
	private List<String> extraServicesDesc;
	private List<ExtraServicesModel> extraServicesDev;
	private String codeGds;
	private String fareType;
	
	private String gdsDevise;
 
	
	public TravelItineraryModel(List<String> bookingNotes, ItineraryInfoModel itineraryInfo, String uniqueID) {
		super();
		this.bookingNotes = bookingNotes;
		this.itineraryInfo = itineraryInfo;
		this.uniqueID = uniqueID;
	}

	 
	 
	 
	public TravelItineraryModel() {
		super();
	}
 

 
	public List<String> getBookingNotes() {
		return bookingNotes;
	}

	public void setBookingNotes(List<String> bookingNotes) {
		this.bookingNotes = bookingNotes;
	}

	public ItineraryInfoModel getItineraryInfo() {
		return itineraryInfo;
	}

	public void setItineraryInfo(ItineraryInfoModel itineraryInfo) {
		this.itineraryInfo = itineraryInfo;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public List<ExtraServicesModel> getExtraServices() {
		return extraServices;
	}

	public void setExtraServices(List<ExtraServicesModel> extraServices) {
		this.extraServices = extraServices;
	}

	public List<ExtraServicesModel> getExtraServicesDev() {
		return extraServicesDev;
	}

	public void setExtraServicesDev(List<ExtraServicesModel> extraServicesDev) {
		this.extraServicesDev = extraServicesDev;
	}

	public List<String> getExtraServicesDesc() {
		return extraServicesDesc;
	}

	public void setExtraServicesDesc(List<String> extraServicesDesc) {
		this.extraServicesDesc = extraServicesDesc;
	}
 
 
	

	public String getCodeGds() {
		return codeGds;
	}

	public void setCodeGds(String codeGds) {
		this.codeGds = codeGds;
	}

 

	public void formatResult() {
		extraServices = null;
		extraServicesDev = null;
		if (this.itineraryInfo != null) {
			this.itineraryInfo.formatResult();
		}
	}

	@Override
	public String toString() {
		return "TravelItineraryModel [bookingNotes=" + bookingNotes + ", itineraryInfo=" + itineraryInfo + ", uniqueID="
				+ uniqueID + ", extraServices=" + extraServices + ", extraServicesDesc=" + extraServicesDesc
				+ ", extraServicesDev=" + extraServicesDev + ", codeGds=" + codeGds + "]";
	}

	

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	

	public String getGdsDevise() {
		return gdsDevise;
	}

	public void setGdsDevise(String gdsDevise) {
		this.gdsDevise = gdsDevise;
	}

	

	
}
