package controlador;

public class Prediccion {
	
	// De "city":
	private String pais;
	private String ciudad;
	
	// De "forecast":/ "forecastDay":
	private String dia;
	private String tiempo;
	private String minTemp;
	private String maxtemp;
	private String icono;

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