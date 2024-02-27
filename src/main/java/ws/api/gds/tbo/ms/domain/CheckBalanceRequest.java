package ws.api.gds.tbo.ms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckBalanceRequest {
	@JsonProperty("TokenId")
    private String tokenId;

	public CheckBalanceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckBalanceRequest(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	@Override
	public String toString() {
		return "CheckBalanceRequest [tokenId=" + tokenId + "]";
	}
	
	

}
