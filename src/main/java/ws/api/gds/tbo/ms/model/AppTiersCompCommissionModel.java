package ws.api.gds.tbo.ms.model;


public class AppTiersCompCommissionModel {
	
	private String codeComp;
	private Character addProviderwarning;
	private String txtProviderwarning;
	private String txtProviderwarningA;
	private String numVol1;
	private String numVol2;
	private String numVol3;
	private String numVol4;
	
	
	public AppTiersCompCommissionModel() {
		super();
	}
	public AppTiersCompCommissionModel(String codeComp, Character addProviderwarning, String txtProviderwarning,
			String txtProviderwarningA, String numVol1, String numVol2, String numVol3, String numVol4) {
		super();
		this.codeComp = codeComp;
		this.addProviderwarning = addProviderwarning;
		this.txtProviderwarning = txtProviderwarning;
		this.txtProviderwarningA = txtProviderwarningA;
		this.numVol1 = numVol1;
		this.numVol2 = numVol2;
		this.numVol3 = numVol3;
		this.numVol4 = numVol4;
	}
	public String getCodeComp() {
		return codeComp;
	}
	public void setCodeComp(String codeComp) {
		this.codeComp = codeComp;
	}
	public Character getAddProviderwarning() {
		return addProviderwarning;
	}
	public void setAddProviderwarning(Character addProviderwarning) {
		this.addProviderwarning = addProviderwarning;
	}
	public String getTxtProviderwarning() {
		return txtProviderwarning;
	}
	public void setTxtProviderwarning(String txtProviderwarning) {
		this.txtProviderwarning = txtProviderwarning;
	}
	public String getTxtProviderwarningA() {
		return txtProviderwarningA;
	}
	public void setTxtProviderwarningA(String txtProviderwarningA) {
		this.txtProviderwarningA = txtProviderwarningA;
	}
	public String getNumVol1() {
		return numVol1;
	}
	public void setNumVol1(String numVol1) {
		this.numVol1 = numVol1;
	}
	public String getNumVol2() {
		return numVol2;
	}
	public void setNumVol2(String numVol2) {
		this.numVol2 = numVol2;
	}
	public String getNumVol3() {
		return numVol3;
	}
	public void setNumVol3(String numVol3) {
		this.numVol3 = numVol3;
	}
	public String getNumVol4() {
		return numVol4;
	}
	public void setNumVol4(String numVol4) {
		this.numVol4 = numVol4;
	}
	@Override
	public String toString() {
		return "AppTiersCompCommissionModel [codeComp=" + codeComp + ", addProviderwarning=" + addProviderwarning
				+ ", txtProviderwarning=" + txtProviderwarning + ", txtProviderwarningA=" + txtProviderwarningA
				+ ", numVol1=" + numVol1 + ", numVol2=" + numVol2 + ", numVol3=" + numVol3 + ", numVol4=" + numVol4
				+ "]";
	}
	
	

}
