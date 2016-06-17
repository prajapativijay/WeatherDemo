package com.demo.weatherapp.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.weatherapp.forms.Submit;
import com.demo.weatherapp.helper.Weather;
import com.demo.weatherapp.helper.WeatherHelper;
 
@Controller
public class Home {
	
	@Value("${openweathermap.apikey}")
	private String apiKey;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Submit submit) {
		return "index";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String addNewPost(@Valid Submit submit, BindingResult bindingResult, Model model) throws JSONException, IOException {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		Weather weather = WeatherHelper.getCurrentWeather(submit.getCity(), apiKey);
		model.addAttribute("city", weather.getCity());
		model.addAttribute("date", weather.getCurrentDate());
		model.addAttribute("discription", weather.getWeatherDescription());
		model.addAttribute("temperatureInFahrenheit", weather.getTemperatureInFahrenheit());
		model.addAttribute("temperatureInCelsius", weather.getTemperatureInCelsius());
		model.addAttribute("sunrise", weather.getSunrise());
		model.addAttribute("sunset", weather.getSunset());
		return "result";
	}
}
