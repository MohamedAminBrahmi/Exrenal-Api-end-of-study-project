package ws.api.gds.tbo.ms.model;

import java.util.Arrays;
import java.util.List;



public class CommisionModelResponse {
	private List<PricedItineraryModel> pricedItineraries;
	private PricedItineraryModel pricedItinerary;
	private PricerCalendarCase tableauEntier[][];

	public CommisionModelResponse() {
		super();
	}

	public CommisionModelResponse(List<PricedItineraryModel> pricedItineraries, PricedItineraryModel pricedItinerary) {
		super();
		this.pricedItineraries = pricedItineraries;
		this.pricedItinerary = pricedItinerary;
	}

	public List<PricedItineraryModel> getPricedItineraries() {
		return pricedItineraries;
	}

	public void setPricedItineraries(List<PricedItineraryModel> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}

	public PricedItineraryModel getPricedItinerary() {
		return pricedItinerary;
	}

	public void setPricedItinerary(PricedItineraryModel pricedItinerary) {
		this.pricedItinerary = pricedItinerary;
	}

	public PricerCalendarCase[][] getTableauEntier() {
		return tableauEntier;
	}

	public void setTableauEntier(PricerCalendarCase tableauEntier[][]) {
		this.tableauEntier = tableauEntier;
	}

	@Override
	public String toString() {
		return "CommisionModelResponse [pricedItineraries=" + pricedItineraries + ", pricedItinerary=" + pricedItinerary
				+ ", tableauEntier=" + Arrays.toString(tableauEntier) + "]";
	}

	

}
