package ws.api.gds.tbo.ms.model;

import java.math.BigDecimal;

public class BigDecimalStringModel {

	private BigDecimal id;
	private String value;

	public BigDecimalStringModel(BigDecimal id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public BigDecimalStringModel() {
		super();
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "BigDecimalStringModel [id=" + id + ", value=" + value + "]";
	}

}
