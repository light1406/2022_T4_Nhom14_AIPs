package com.datawarehouse.DatawarehouseAPIs.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "weatherfact")
public class WeatherFact {

	@Id
	private String sk;
	private String naturalKey;
	private String provinceId;
	private String dateId;
	private int currentTemperature;
	private int lowestTemperature;
	private int highestTemperature;
	private float humidity;
	private String overview;
	private float wind;
	private float vision;
	private int stopPoint;
	private float uvIndex;
	private String airQuality;
	private int deleted;
	private int updated;
	private Date timeExpried;
	
	public WeatherFact() {}
	
	public WeatherFact(String sk, String naturalKey, String provinceId, String dateId, int currentTemperature,
			int lowestTemperature, int highestTemperature, float humidity, String overview, float wind, float vision,
			int stopPoint, float uvIndex, String airQuality, int deleted, int updated, Date timeExpried) {
		super();
		this.sk = sk;
		this.naturalKey = naturalKey;
		this.provinceId = provinceId;
		this.dateId = dateId;
		this.currentTemperature = currentTemperature;
		this.lowestTemperature = lowestTemperature;
		this.highestTemperature = highestTemperature;
		this.humidity = humidity;
		this.overview = overview;
		this.wind = wind;
		this.vision = vision;
		this.stopPoint = stopPoint;
		this.uvIndex = uvIndex;
		this.airQuality = airQuality;
		this.deleted = deleted;
		this.updated = updated;
		this.timeExpried = timeExpried;
	}

	public String getSk() {
		return sk;
	}

	public void setSk(String sk) {
		this.sk = sk;
	}

	public String getNaturalKey() {
		return naturalKey;
	}

	public void setNaturalKey(String naturalKey) {
		this.naturalKey = naturalKey;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateDimId) {
		this.dateId = dateDimId;
	}

	public int getCurrentTemperature() {
		return currentTemperature;
	}

	public void setCurrentTemperature(int currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	public int getLowestTemperature() {
		return lowestTemperature;
	}

	public void setLowestTemperature(int lowestTemperature) {
		this.lowestTemperature = lowestTemperature;
	}

	public int getHighestTemperature() {
		return highestTemperature;
	}

	public void setHighestTemperature(int highestTemperature) {
		this.highestTemperature = highestTemperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public float getWind() {
		return wind;
	}

	public void setWind(float wind) {
		this.wind = wind;
	}

	public float getVision() {
		return vision;
	}

	public void setVision(float vision) {
		this.vision = vision;
	}

	public int getStopPoint() {
		return stopPoint;
	}

	public void setStopPoint(int stopPoint) {
		this.stopPoint = stopPoint;
	}

	public float getUvIndex() {
		return uvIndex;
	}

	public void setUvIndex(float uvIndex) {
		this.uvIndex = uvIndex;
	}

	public String getAirQuality() {
		return airQuality;
	}

	public void setAirQuality(String airQuality) {
		this.airQuality = airQuality;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getUpdated() {
		return updated;
	}

	public void setUpdated(int updated) {
		this.updated = updated;
	}

	public Date getTimeExpried() {
		return timeExpried;
	}

	public void setTimeExpried(Date timeExpried) {
		this.timeExpried = timeExpried;
	}
}
