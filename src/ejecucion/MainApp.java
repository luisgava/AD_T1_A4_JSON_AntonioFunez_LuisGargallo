package ejecucion;

import java.net.URL;

import controlador.Controlador;
import controlador.Prediccion;

public class MainApp {

	public static void main(String[] args) {
		Controlador control = new Controlador();
		URL url = control.obtenerCiudadesFichero();
		Prediccion prueba = control.fromFileToObject(url);

		prueba.toString();

	}

}
