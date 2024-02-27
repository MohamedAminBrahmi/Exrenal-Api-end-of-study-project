package ws.api.gds.tbo.ms.model;

import java.util.List;

public class CommisionModelRequest {
	private GdsSessionModel gds;
	private List<PricedItineraryModel> pricedItineraries;

	
	public CommisionModelRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CommisionModelRequest(GdsSessionModel gds, List<PricedItineraryModel> pricedItineraries) {
		super();
		this.gds = gds;
		this.pricedItineraries = pricedItineraries;
	}


	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	public List<PricedItineraryModel> getPricedItineraries() {
		return pricedItineraries;
	}
	public void setPricedItineraries(List<PricedItineraryModel> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}

}
