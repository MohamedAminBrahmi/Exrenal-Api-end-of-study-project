package ws.api.gds.tbo.ms.model;



import java.util.ArrayList;
import java.util.List;
  
public class AirItineraryPricingInfoModel implements Cloneable {

	private String fareType;
	private String isRefundable;
	private ItinTotalFareModel itinTotalFare;
	private List<PTCFareBreakdownModel> ptcFareBreakdowns;


	

	public AirItineraryPricingInfoModel(Boolean divideInPartyIndicator, List<String> fareInfos, String fareSourceCode,
			String fareType, String isRefundable, ItinTotalFareModel itinTotalFare,
			List<PTCFareBreakdownModel> ptcFareBreakdowns) {
		super();
		this.fareType = fareType;
		this.isRefundable = isRefundable;
		this.itinTotalFare = itinTotalFare;
		this.ptcFareBreakdowns = ptcFareBreakdowns;
	}

	public AirItineraryPricingInfoModel() {
		super();
		this.ptcFareBreakdowns = new ArrayList<PTCFareBreakdownModel>();
	}

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getIsRefundable() {
		return isRefundable;
	}

	public void setIsRefundable(String isRefundable) {
		this.isRefundable = isRefundable;
	}

	public ItinTotalFareModel getItinTotalFare() {
		return itinTotalFare;
	}

	public void setItinTotalFare(ItinTotalFareModel itinTotalFare) {
		this.itinTotalFare = itinTotalFare;
	}

	public List<PTCFareBreakdownModel> getPtcFareBreakdowns() {
		return ptcFareBreakdowns;
	}

	public void setPtcFareBreakdowns(List<PTCFareBreakdownModel> ptcFareBreakdowns) {
		this.ptcFareBreakdowns = ptcFareBreakdowns;
	}

	@Override
	public String toString() {
		return "AirItineraryPricingInfoModel [fareType=" + fareType + ", isRefundable=" + isRefundable
				+ ", itinTotalFare=" + itinTotalFare + ", ptcFareBreakdowns=" + ptcFareBreakdowns + "]";
	}

}
