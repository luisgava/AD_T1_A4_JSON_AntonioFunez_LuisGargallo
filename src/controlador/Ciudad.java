package controlador;

import java.util.List;

public class Ciudad {
List<String> city;
private String ciudad;

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
	
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