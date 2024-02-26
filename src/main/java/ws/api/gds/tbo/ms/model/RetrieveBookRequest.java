package ws.api.gds.tbo.ms.model;

import java.util.List;

public class RetrieveBookRequest {
	private GdsSessionModel gds;
	private List<String>  listUniqueId;
	public GdsSessionModel getGds() {
		return gds;
	}
	public void setGds(GdsSessionModel gds) {
		this.gds = gds;
	}
	public List<String> getListUniqueId() {
		return listUniqueId;
	}
	public void setListUniqueId(List<String> listUniqueId) {
		this.listUniqueId = listUniqueId;
	}
	
	
}
