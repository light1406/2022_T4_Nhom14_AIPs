package com.datawarehouse.DatawarehouseAPIs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datawarehouse.DatawarehouseAPIs.dto.Weather;
import com.datawarehouse.DatawarehouseAPIs.entity.DateDim;
import com.datawarehouse.DatawarehouseAPIs.entity.WeatherFact;
import com.datawarehouse.DatawarehouseAPIs.reponsitory.DateDimReponsitory;
import com.datawarehouse.DatawarehouseAPIs.reponsitory.WeatherFactResponsitory;
import com.datawarehouse.DatawarehouseAPIs.service.WeatherService;

@RestController
@CrossOrigin(origins = "*")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/getWeathersCurrent")
	public List<Weather> getWeathersCurrent() {
		return weatherService.getAll();
	}
	
	@GetMapping("/getDetailWeather")
	public Weather getDetailWeather(@Param(value = "-1") String id) {
		return weatherService.getWeatherById(id);
	}
}
