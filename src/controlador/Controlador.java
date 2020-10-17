package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import modelo.Prediccion;
import vista.Vista;
import vista.VistaPre;

public class Controlador {
	
Vista vista;
VistaPre vPre;
Prediccion datos;
Listen lis = new Listen();

	public Controlador(Vista vista, VistaPre vp, Prediccion datos) {
	this.vista = vista;
	this.datos=datos;
	this.vPre=vp;
	
	this.vista.btBerlin.addActionListener(lis);
	this.vista.btBremen.addActionListener(lis);
	this.vista.btEssen.addActionListener(lis);
	this.vista.btFrank.addActionListener(lis);
	this.vista.btFriburg.addActionListener(lis);
	this.vista.btMunich.addActionListener(lis);
	this.vista.btNuren.addActionListener(lis);
	this.vista.btDres.addActionListener(lis);
	this.vista.btKass.addActionListener(lis);
	this.vista.btHamb.addActionListener(lis);

}
	public void inciarVista() {
		
		vista.setResizable(false);
		vista.setVisible(true);
		
		
		//vPre.setResizable(false);
		//vPre.setVisible(true);
		
	}

	/**
	 * m�todo para obtener las url de las ciudades
	 * @param nombreCiudad 
	 * 
	 * @return
	 */
	public URL obtenerCiudadesFichero() {
		// Obtenemos la lista de ciudades del fichero de propiedades
		Properties configuracion = new Properties();

		URL url = null;
		try {
			// cargamos el fichero de propiedades en configuracion
			configuracion.load(new FileReader("src/resources/config.properties.xml"));
			// sacamos la lista de ciudades y su url a un set
			Set<String> ciudades = configuracion.stringPropertyNames();

			// leemos el fichero de propiedades
			String direccionCiudad = configuracion.getProperty(vista.getNombreCiudad()); // el nombre de la ciudad debe ponerlo el
																				// bot�n
			url = new URL(direccionCiudad); // pasamos el String a URL
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(url); // funciona. BORRAR
		return url;
	}

	/**
	 * Deserializa el string en formato JSON en un objeto JAVA
	 * 
	 * @param pathname
	 * @return
	 */
	public Prediccion fromFileToObject(URL url) {
		// Objeto que guardar� los datos.
		
		try {
			// Mapeador que permite guardar los datos del JSON en la clase elegida.
			ObjectMapper mapper = new ObjectMapper();
			datos = mapper.readValue(url, Prediccion.class); // falla porque tenemos que seleccionar los datos y poner
																// las propiedades apropiadas en la clase.
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datos;
	}
	
	public class Listen implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			vista.setNombreCiudad(ae.getActionCommand());
			fromFileToObject(obtenerCiudadesFichero());
			
		}
	}
}
