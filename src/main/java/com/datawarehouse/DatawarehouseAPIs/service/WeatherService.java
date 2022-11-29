package com.datawarehouse.DatawarehouseAPIs.service;

import java.util.List;

import com.datawarehouse.DatawarehouseAPIs.dto.Weather;

public interface WeatherService {

	List<Weather> getAll();

	Weather getWeatherById(String id);

}
