package com.demo.weatherapp.forms;

import javax.validation.constraints.NotNull;

public class Submit {

	@NotNull
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
