package com.datawarehouse.DatawarehouseAPIs.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datawarehouse.DatawarehouseAPIs.dto.Date;
import com.datawarehouse.DatawarehouseAPIs.dto.Weather;
import com.datawarehouse.DatawarehouseAPIs.entity.DateDim;
import com.datawarehouse.DatawarehouseAPIs.reponsitory.DateDimReponsitory;
import com.datawarehouse.DatawarehouseAPIs.reponsitory.ProvinceDimResponsitory;
import com.datawarehouse.DatawarehouseAPIs.reponsitory.WeatherFactResponsitory;
import com.datawarehouse.DatawarehouseAPIs.service.WeatherService;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
	private DateDimReponsitory dateDimReponsitory;
	@Autowired
	private ProvinceDimResponsitory provinceDimResponsitory;
	@Autowired
	private WeatherFactResponsitory weatherFactResponsitory;
	
	@Override
	public List<Weather> getAll(){
		List<Weather> weathers = new ArrayList<>();
		weatherFactResponsitory
			.findAll()
			.forEach(w -> {
				Weather weather = new Weather();
				weather.setId(w.getNaturalKey());
				weather.setProvinceName(provinceDimResponsitory.findById(w.getProvinceId()).get().getId());
				Date date = new Date();
				DateDim dateDim = dateDimReponsitory.findById(w.getDateId()).get();
				date.setDate(dateDim.getDate());
				date.setMonth(dateDim.getMonth());
				date.setYear(dateDim.getYear());
				date.setHour(dateDim.getHour());
				date.setMinute(dateDim.getMinute());
				date.setSecond(dateDim.getSecond());
				date.setDayOfWeek(dateDim.getDayOfWeek());
				weather.setDate(date);
				weather.setCurrentTemperature(w.getCurrentTemperature());
				weather.setLowestTemperature(w.getLowestTemperature());
				weather.setHighestTemperature(w.getHighestTemperature());
				weather.setHumidity(w.getHumidity());
				weather.setOverview(w.getOverview());
				weather.setWind(w.getWind());
				weather.setVision(w.getVision());
				weather.setStopPoint(w.getStopPoint());
				weather.setUvIndex(w.getUvIndex());
				weather.setAirQuality(w.getAirQuality());
				weathers.add(weather);
			});;
		return weathers;
	}
}
