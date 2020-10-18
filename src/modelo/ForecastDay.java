package modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastDay {
	String forecastDate; // fecha de la prediccion
	String weather;
	String minTemp;
	String maxTemp;


	@Override
	public String toString() {
		return "ForecastDay [forecastDate=" + forecastDate + ", weather=" + weather + ", minTemp=" + minTemp
				+ ", maxTemp=" + maxTemp+"]";
	}

	public String getforecastDate() {
		return forecastDate;
	}

	public void setforecastDate(String forecastDate) {
		this.forecastDate = forecastDate;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}

	public String getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(String maxTemp) {
		this.maxTemp = maxTemp;
	}

}
