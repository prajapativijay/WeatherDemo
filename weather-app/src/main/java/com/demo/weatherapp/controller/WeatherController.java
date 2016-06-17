package com.demo.weatherapp.controller;



import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.weatherapp.helper.Weather;
import com.demo.weatherapp.helper.WeatherHelper;

@RestController
@RequestMapping("/weather/{city}")
public class WeatherController {
	
	@Value("${openweathermap.apikey}")
	private String apiKey;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public Weather getWeather(@PathVariable String city) throws JSONException, IOException{
		return WeatherHelper.getCurrentWeather(city, apiKey);
	}
	
}
