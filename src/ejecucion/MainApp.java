package ejecucion;

import controlador.Controlador;
import modelo.Prediccion;
import vista.Vista;


public class MainApp {

	public static void main(String[] args) {
	
		Vista vista = new Vista();

		Prediccion datos = null;
		Controlador control = new Controlador(vista, datos);
		control.inciarVista();
		
	}
}

