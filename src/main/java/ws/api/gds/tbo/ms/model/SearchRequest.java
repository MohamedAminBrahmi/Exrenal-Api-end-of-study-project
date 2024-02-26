package ws.api.gds.tbo.ms.model;

public class SearchRequest {
	private PricedItineraryModel pricedItineraryModel;
	private GdsSessionModel gds;
	
	public PricedItineraryModel getPricedItineraryModel() {
		return pricedItineraryModel;
	}
	public void setPricedItineraryModel(PricedItineraryModel pricedItineraryModel) {
		this.pricedItineraryModel = pricedItineraryModel;
	}
	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	
}
