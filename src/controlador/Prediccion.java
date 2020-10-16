package controlador;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // para ignorar las propiedades que no queremos
public class Prediccion {
	City city;

	@Override
	public String toString() {
		return "Prediccion [city=" + city + "]";
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
