package ejecucion;

import controlador.Controlador;
import modelo.Prediccion;
import vista.Vista;

/**
 * Clase para ejecutar el programa.
 */
public class MainApp {

	/**
	 * Método para iniciar el programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Vista vista = new Vista();
		Prediccion datos = null;
		Controlador control = new Controlador(vista, datos);
		control.inciarVista();

	}
}
