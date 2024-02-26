package ws.api.gds.tbo.ms.model;

 


import java.util.List;

 

public class JourneySSR {
	
	private String origin;
	private String destination;
	private String depOn;
	private List<SSRModel> ssrList;
	private List<SSRModel> lounSSRList;
	private List<SSRModel> prtSSRList;
	private List<SSRModel> pcrSSRList;
	
	public JourneySSR() {
		super();
	}
	
	

	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<SSRModel> getSsrList() {
		return ssrList;
	}

	public void setSsrList(List<SSRModel> ssrList) {
		this.ssrList = ssrList;
	}

	public String getDepOn() {
		return depOn;
	}

	public void setDepOn(String depOn) {
		this.depOn = depOn;
	}


	

	public List<SSRModel> getLounSSRList() {
		return lounSSRList;
	}

	public void setLounSSRList(List<SSRModel> lounSSRList) {
		this.lounSSRList = lounSSRList;
	}

	public List<SSRModel> getPrtSSRList() {
		return prtSSRList;
	}

	public void setPrtSSRList(List<SSRModel> prtSSRList) {
		this.prtSSRList = prtSSRList;
	}

	public List<SSRModel> getPcrSSRList() {
		return pcrSSRList;
	}

	public void setPcrSSRList(List<SSRModel> pcrSSRList) {
		this.pcrSSRList = pcrSSRList;
	}
	
	

}
