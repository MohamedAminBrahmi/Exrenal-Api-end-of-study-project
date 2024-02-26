package ws.api.gds.tbo.ms.model;



 

public class AvailableSSRsModel {

//	private List<JourneySSR> journeys;
//	private List<String> SSrsToSell;
	private String error;
//	private Double totalAmount;
//	
//	private List<JourneySSR> extraBaggJourneys;
//	private List<JourneySSR> mealsJourneys;
//	private List<JourneySSR> pCRJourneys;
//	private List<JourneySSR> pearLoungeJourneys;
//	private List<JourneySSR> priorityCheckInJourneys;
//	private List<JourneySSR> seatJourneys;
//	
//	private List<SeatsAvailabilityRS> seatsAvList;
	private GdsSessionModel gdsModel;

	public AvailableSSRsModel() {
		super();
	}

	public AvailableSSRsModel(String error) {
		this.error = error;
	}
	
	
	

public AvailableSSRsModel(String error, GdsSessionModel gdsModel) {
		super();
		this.error = error;
		this.gdsModel = gdsModel;
	}

//	public AvailableSSRsModel(List<JourneySSR> journeys, List<String> sSrsToSell, String error, Double totalAmount,
//			List<JourneySSR> extraBaggJourneys, List<JourneySSR> mealsJourneys, List<JourneySSR> pCRJourneys,
//			List<JourneySSR> pearLoungeJourneys, List<JourneySSR> priorityCheckInJourneys,
//			List<JourneySSR> seatJourneys, List<SeatsAvailabilityRS> seatsAvList, GdsSessionModel gdsModel) {
//		super();
//		this.journeys = journeys;
//		SSrsToSell = sSrsToSell;
//		this.error = error;
//		this.totalAmount = totalAmount;
//		this.extraBaggJourneys = extraBaggJourneys;
//		this.mealsJourneys = mealsJourneys;
//		this.pCRJourneys = pCRJourneys;
//		this.pearLoungeJourneys = pearLoungeJourneys;
//		this.priorityCheckInJourneys = priorityCheckInJourneys;
//		this.seatJourneys = seatJourneys;
//		this.seatsAvList = seatsAvList;
//		this.setGdsModel(gdsModel);
//	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public GdsSessionModel getGdsModel() {
		return gdsModel;
	}

	public void setGdsModel(GdsSessionModel gdsModel) {
		this.gdsModel = gdsModel;
	}

	


}
