package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;



public class AirLowFareSearchResultModel {

	private List<ErrorModel> errors;
	private List<PricedItineraryModel> pricedItineraries;
	private Boolean success;
	private int nbPassenger;
	private String departAirelines;
	private String destinationAirelines;
	private String departAirelinesIata;
	private String destinationAirelinesIata;
	private String departDate;
	private String returnDate;
	private int nbAdt;
	private int nbChd;
	private int nbInf;
	private int nbSea;
	private int nbStu;
	private int nbSrc;
	private PricerCalendarCase tableauEntier[][];//*
	private BigDecimal idGdsForCalender;//*


	public AirLowFareSearchResultModel() {
		// TODO Auto-generated constructor stub
	}
	
	

	

	public AirLowFareSearchResultModel(List<ErrorModel> errors, List<PricedItineraryModel> pricedItineraries,
			Boolean success, int nbPassenger, String departAirelines, String destinationAirelines,
			String departAirelinesIata, String destinationAirelinesIata, String departDate, String returnDate,
			int nbAdt, int nbChd, int nbInf, int nbSea, int nbStu, int nbSrc, PricerCalendarCase[][] tableauEntier,
			BigDecimal idGdsForCalender) {
		this.errors = errors;
		this.pricedItineraries = pricedItineraries;
		this.success = success;
		this.nbPassenger = nbPassenger;
		this.departAirelines = departAirelines;
		this.destinationAirelines = destinationAirelines;
		this.departAirelinesIata = departAirelinesIata;
		this.destinationAirelinesIata = destinationAirelinesIata;
		this.departDate = departDate;
		this.returnDate = returnDate;
		this.nbAdt = nbAdt;
		this.nbChd = nbChd;
		this.nbInf = nbInf;
		this.nbSea = nbSea;
		this.nbStu = nbStu;
		this.nbSrc = nbSrc;
		this.tableauEntier = tableauEntier;
		this.idGdsForCalender = idGdsForCalender;
	}





	public List<ErrorModel> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorModel> errors) {
		this.errors = errors;
	}

	public List<PricedItineraryModel> getPricedItineraries() {
		return pricedItineraries;
	}

	public void setPricedItineraries(List<PricedItineraryModel> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public int getNbPassenger() {
		return nbPassenger;
	}

	public void setNbPassenger(int nbPassenger) {
		this.nbPassenger = nbPassenger;
	}

	public String getDepartAirelines() {
		return departAirelines;
	}

	public void setDepartAirelines(String departAirelines) {
		this.departAirelines = departAirelines;
	}

	public String getDestinationAirelines() {
		return destinationAirelines;
	}

	public void setDestinationAirelines(String destinationAirelines) {
		this.destinationAirelines = destinationAirelines;
	}

	public String getDepartAirelinesIata() {
		return departAirelinesIata;
	}

	public void setDepartAirelinesIata(String departAirelinesIata) {
		this.departAirelinesIata = departAirelinesIata;
	}

	public String getDestinationAirelinesIata() {
		return destinationAirelinesIata;
	}

	public void setDestinationAirelinesIata(String destinationAirelinesIata) {
		this.destinationAirelinesIata = destinationAirelinesIata;
	}

	public String getDepartDate() {
		return departDate;
	}

	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public int getNbAdt() {
		return nbAdt;
	}

	public void setNbAdt(int nbAdt) {
		this.nbAdt = nbAdt;
	}

	public int getNbChd() {
		return nbChd;
	}

	public void setNbChd(int nbChd) {
		this.nbChd = nbChd;
	}

	public int getNbInf() {
		return nbInf;
	}

	public void setNbInf(int nbInf) {
		this.nbInf = nbInf;
	}

	

	public void setPricerCalendar(PricerCalendarCase[][] tableauEntier) {
		this.tableauEntier = tableauEntier;

	}

	public PricerCalendarCase[][] getTableauEntier() {
		return tableauEntier;
	}

	public void setTableauEntier(PricerCalendarCase tableauEntier[][]) {
		this.tableauEntier = tableauEntier;
	}

	public BigDecimal getIdGdsForCalender() {
		return idGdsForCalender;
	}

	public void setIdGdsForCalender(BigDecimal idGdsForCalender) {
		this.idGdsForCalender = idGdsForCalender;
	}

	

	
	public int getNbSea() {
		return nbSea;
	}

	public void setNbSea(int nbSea) {
		this.nbSea = nbSea;
	}

	public int getNbStu() {
		return nbStu;
	}

	public void setNbStu(int nbStu) {
		this.nbStu = nbStu;
	}

	public int getNbSrc() {
		return nbSrc;
	}

	public void setNbSrc(int nbSrc) {
		this.nbSrc = nbSrc;
	}





	@Override
	public String toString() {
		return "AirLowFareSearchResultModel [errors=" + errors + ", pricedItineraries=" + pricedItineraries
				+ ", success=" + success + ", nbPassenger=" + nbPassenger + ", departAirelines=" + departAirelines
				+ ", destinationAirelines=" + destinationAirelines + ", departAirelinesIata=" + departAirelinesIata
				+ ", destinationAirelinesIata=" + destinationAirelinesIata + ", departDate=" + departDate
				+ ", returnDate=" + returnDate + ", nbAdt=" + nbAdt + ", nbChd=" + nbChd + ", nbInf=" + nbInf
				+ ", nbSea=" + nbSea + ", nbStu=" + nbStu + ", nbSrc=" + nbSrc + ", tableauEntier="
				+ Arrays.toString(tableauEntier) + ", idGdsForCalender=" + idGdsForCalender + "]";
	}
	

	
}
