package ejecucion;

import java.net.URL;
import controlador.Controlador;
import modelo.Prediccion;
import vista.Vista;

public class MainApp {

	public static void main(String[] args) {
		Controlador control = new Controlador();
		String nombreCiudad = null;
		Vista frame = new Vista();
		frame.setVisible(true);
		URL url = control.obtenerCiudadesFichero(nombreCiudad);
		Prediccion prueba = control.fromFileToObject(url);

		System.out.println(prueba.getCity().getForecast().getForecastDay().get(0).getMaxTemp());
		

	}

}
