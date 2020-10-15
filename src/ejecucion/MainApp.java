package ejecucion;

import controlador.Controlador;

public class MainApp {

	public static void main(String[] args) {
		Controlador control = new Controlador();
		control.fromFileToObject("resources/config.properties.xml");

	}

}
