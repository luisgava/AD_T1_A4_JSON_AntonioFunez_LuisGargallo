package controlador;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "city") // empieza a mappear aqui y la clase prediccion en principio sobra
public class City {

	String cityName;
	Forecast forecast;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Forecast getForecast() {
		return forecast;
	}

	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", forecast=" + forecast + "]";
	}
}
