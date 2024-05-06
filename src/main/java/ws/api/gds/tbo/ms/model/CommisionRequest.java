package ws.api.gds.tbo.ms.model;

import java.util.Arrays;
import java.util.List;



public class CommisionRequest {
	private GdsSessionModel gds;
	private List<PricedItineraryModel> pricedItineraries;
	private PricedItineraryModel pricedItinerary;
	private PricerCalendarCase tableauEntier[][];

	public CommisionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommisionRequest(GdsSessionModel gds, List<PricedItineraryModel> pricedItineraries,
			PricedItineraryModel pricedItinerary) {
		super();
		this.gds = gds;
		this.pricedItineraries = pricedItineraries;
		this.pricedItinerary = pricedItinerary;
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
		return "CommisionRequest [gds=" + gds + ", pricedItineraries=" + pricedItineraries + ", pricedItinerary="
				+ pricedItinerary + ", tableauEntier=" + Arrays.toString(tableauEntier) + "]";
	}

	
	
	
}
