package ws.api.gds.tbo.ms.model;

public class AvailableSSRsRequest {
	private AvailableSSRsModel availableSSRs;
	private GdsSessionModel gds;
	
	public AvailableSSRsModel getAvailableSSRs() {
		return availableSSRs;
	}
	public void setAvailableSSRs(AvailableSSRsModel availableSSRs) {
		this.availableSSRs = availableSSRs;
	}
	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	
	
}
