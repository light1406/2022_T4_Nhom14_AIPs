package com.datawarehouse.DatawarehouseAPIs.dto;

public class Weather {
	private String id;
	private String provinceName;
	private Date date;
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

	public Weather() {
	}

	public Weather(String id, String provinceName, Date date, int currentTemperature, int lowestTemperature,
			int highestTemperature, float humidity, String overview, float wind, float vision, int stopPoint,
			float uvIndex, String airQuality) {
		super();
		this.id = id;
		this.provinceName = provinceName;
		this.date = date;
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
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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
}
