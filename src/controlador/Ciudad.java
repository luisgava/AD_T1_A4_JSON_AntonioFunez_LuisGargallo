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
 * En la aplicaci�n debemos saber siempre de qu� pa�s y ciudad estamos mostrando
 * la informaci�n, adem�s se mostrar� la predicci�n climatol�gica de los
 * pr�ximos cuatro d�as de la ciudad elegida. De cada d�a se nos debe mostrar el
 * d�a del que se trata, la temperatura m�xima y m�nima en Celsius, el estado
 * del cielo (Soleado, Tormentas, etc�).
 * 
 * "forecastDate": "2020-10-16", "wxdesc": "", "weather": "Soleado", "minTemp":
 * "5", "maxTemp": "18", "minTempF": "41", "maxTempF": "64", "weatherIcon": 2402
 */