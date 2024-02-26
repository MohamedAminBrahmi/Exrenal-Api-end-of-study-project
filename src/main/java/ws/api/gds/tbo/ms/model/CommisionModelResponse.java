package ws.api.gds.tbo.ms.model;

import java.util.List;

public class CommisionModelResponse {
	private List<PricedItineraryModel> pricedItineraries;

	public CommisionModelResponse() {
		super();
	}

	public CommisionModelResponse(List<PricedItineraryModel> pricedItineraries) {
		super();
		this.pricedItineraries = pricedItineraries;
	}

	public List<PricedItineraryModel> getPricedItineraries() {
		return pricedItineraries;
	}

	public void setPricedItineraries(List<PricedItineraryModel> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}
	
	

}
