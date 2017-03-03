package com.causecode.models;

import org.springframework.stereotype.Component;

/**
 * Created by arvindkasale on 2/27/17.
 */
@Component
public class Card {
	private String cvv;
	private String name;
	private String expiry;
	private String number;
	private String token;
	private String url;

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Card{" +
			"cvv='" + cvv + '\'' +
			", name='" + name + '\'' +
			", expiry='" + expiry + '\'' +
			", number='" + number + '\'' +
			", token='" + token + '\'' +
			", url='" + url + '\'' +
			'}';
	}
}
