
/**
 * A model to store the information of the Exchange Value
 * @author ancel litto
 */
package com.ancel.microservice.forex.forexservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	@Id
	private Long id;
	@Column(name = "Currency_from")
	private String from;
	@Column(name = "Currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;

	public ExchangeValue() {
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal converstionMultiple, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = converstionMultiple;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
