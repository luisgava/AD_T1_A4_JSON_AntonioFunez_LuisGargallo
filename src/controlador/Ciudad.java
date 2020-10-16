package controlador;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
ArrayList<String[]> city;

@Override
public String toString() {
	return "Ciudad [city=" + city + "]";
}

public ArrayList<String[]> getCity() {
	return city;
}

public void setCity(ArrayList<String[]> city) {
	this.city = city;
}

public Ciudad(ArrayList<String[]> city) {
	super();
	this.city = city;
}




}

/**
 * En la aplicación debemos saber siempre de qué país y ciudad estamos mostrando
 * la información, además se mostrará la predicción climatológica de los
 * próximos cuatro días de la ciudad elegida. De cada día se nos debe mostrar el
 * día del que se trata, la temperatura máxima y mínima en Celsius, el estado
 * del cielo (Soleado, Tormentas, etc…).
 * 
 * "forecastDate": "2020-10-16", "wxdesc": "", "weather": "Soleado", "minTemp":
 * "5", "maxTemp": "18", "minTempF": "41", "maxTempF": "64", "weatherIcon": 2402
 */