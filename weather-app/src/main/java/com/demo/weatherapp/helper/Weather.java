package com.demo.weatherapp.helper;

public class Weather {

	public Weather() {
		
	}

	public String getCity() {
		return city;
	}

	public String getCurrentDate() {
		return currentDate;
	}

	public String getWeatherDescription() {
		return weatherDescription;
	}

	public String getTemperatureInCelsius() {
		return temperatureInCelsius;
	}

	public String getTemperatureInFahrenheit() {
		return temperatureInFahrenheit;
	}

	public String getSunrise() {
		return sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public void setWeatherDescription(String weatherDescription) {
		this.weatherDescription = weatherDescription;
	}

	public void setTemperatureInCelsius(String temperatureInCelsius) {
		this.temperatureInCelsius = temperatureInCelsius;
	}

	public void setTemperatureInFahrenheit(String temperatureInFahrenheit) {
		this.temperatureInFahrenheit = temperatureInFahrenheit;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	
	

	@Override
	public String toString() {
		String weather = "<Weather>" + "<City>" + city + "</City>" + "<Date>" + currentDate + "</Date>" 
						+ "<Description>" + weatherDescription + "</Description>" + "<Temperature>" + temperatureInCelsius + "</Temperature>"
						+ "<Temperature>" + temperatureInFahrenheit + "</Temperature>" + "<Sunrise>" + sunrise + "</Sunrise>" + "<Sunset>" + sunset + "</Sunset>" 
						+"</Weather>";
		return weather;
	}

	
	private String city;
	
	private String currentDate;
	
	private String weatherDescription;
	
	private String temperatureInCelsius;
	
	private String temperatureInFahrenheit;
	
	private String sunrise;
	
	private String sunset;
}
