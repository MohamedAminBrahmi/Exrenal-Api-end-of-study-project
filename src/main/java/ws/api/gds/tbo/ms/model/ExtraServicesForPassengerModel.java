package ws.api.gds.tbo.ms.model;


public class ExtraServicesForPassengerModel {

	private int key;
	private int qte;

	public ExtraServicesForPassengerModel(int key, int qte) {
		super();
		this.key = key;
		this.qte = qte;
	}

	public ExtraServicesForPassengerModel() {
		super();
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

}
