package ejecucion;

import controlador.Controlador;
import modelo.Prediccion;
import vista.Vista;
import vista.VistaPre;

public class MainApp {

	public static void main(String[] args) {
	
		Vista vista = new Vista();
		VistaPre vp = new VistaPre();
		Prediccion datos = null;
		Controlador control = new Controlador(vista, vp, datos);
		control.inciarVista();
		
	}
}

