package ejecucion;

import java.net.URL;

import controlador.Controlador;
import controlador.Ciudad;

public class MainApp {

	public static void main(String[] args) {
		Controlador control = new Controlador();
		URL url = control.obtenerCiudadesFichero();
		Ciudad prueba = control.fromFileToObject(url);

		prueba.toString();

	}

}
