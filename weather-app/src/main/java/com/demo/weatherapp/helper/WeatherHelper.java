package com.demo.weatherapp.helper;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.json.JSONException;

import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;

public class WeatherHelper {
	
	
	public WeatherHelper() {
		
	}
	
	public static Weather getCurrentWeather(String city, String apiKey) throws JSONException, IOException{
		Weather weather = new Weather();
		// declaring object of "OpenWeatherMap" class
        OpenWeatherMap owm = new OpenWeatherMap(apiKey);

        // getting current weather data for the "London" city
        CurrentWeather cwd = owm.currentWeatherByCityName(city);

        DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
        
         weather.setCity(cwd.getCityName());
         weather.setCurrentDate(cwd.getDateTime().toString());
         weather.setSunrise(dateFormat.format(cwd.getSysInstance().getSunriseTime()));
         weather.setSunset(dateFormat.format(cwd.getSysInstance().getSunsetTime()));
         weather.setWeatherDescription(cwd.getWeatherInstance(0).getWeatherDescription());
         weather.setTemperatureInFahrenheit(cwd.getMainInstance().getTemperature()+ "\'F");
         weather.setTemperatureInCelsius(((cwd.getMainInstance().getTemperature() - 32)*5/9)+ "\'C");                   
		
		return weather;
	}
	
	

}
