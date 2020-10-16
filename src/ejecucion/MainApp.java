package ejecucion;

import java.net.URL;
import controlador.Controlador;
import controlador.Prediccion;
import controlador.City;

public class MainApp {

	public static void main(String[] args) {
		Controlador control = new Controlador();
		URL url = control.obtenerCiudadesFichero();
		City prueba = control.fromFileToObject(url);

		System.out.println(prueba.toString());

		System.out.println(prueba.getForecast().getForecastDay().get(0).getMaxTemp());
	}

}
