package controlador;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties (ignoreUnknown = true)
public class ForecastDay {
String forecastDate; // fecha de la prediccion
String weather;
String minTemp;
String maxTemp;
String weatherIcon;

@Override
public String toString() {
	return "ForecastDay [forecastDate=" + forecastDate + ", weather=" + weather + ", minTemp=" + minTemp + ", maxTemp="
			+ maxTemp + ", weatherIcon=" + weatherIcon + "]";
}
public String getForecastDate() {
	return forecastDate;
}
public void setForecastDate(String forecastDate) {
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
public String getWeatherIcon() {
	return weatherIcon;
}
public void setWeatherIcon(String weatherIcon) {
	this.weatherIcon = weatherIcon;
}
}

/**
De cada día se nos debe mostrar el día del que se trata, la
temperatura máxima y mínima en Celsius, el estado del cielo (Soleado, Tormentas,
etc…). Usa imágenes en la predicción como dibujar un sol si está soleado, nubes si
nublado y lluvia si existe probabilidad alta de lluvia. */