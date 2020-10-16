package controlador;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import modelo.Prediccion;
import vista.Vista;

public class Controlador {
	
Vista vista;
Prediccion datosCiudades;

	/**
	 * método para obtener las url de las ciudades
	 * @param nombreCiudad 
	 * 
	 * @return
	 */
	public URL obtenerCiudadesFichero(String nombreCiudad) {
		// Obtenemos la lista de ciudades del fichero de propiedades
		Properties configuracion = new Properties();

		URL url = null;
		try {
			// cargamos el fichero de propiedades en configuracion
			configuracion.load(new FileReader("src/resources/config.properties.xml"));
			// sacamos la lista de ciudades y su url a un set
			Set<String> ciudades = configuracion.stringPropertyNames();

			// leemos el fichero de propiedades
			String direccionCiudad = configuracion.getProperty("Frankfurt"); // el nombre de la ciudad debe ponerlo el
																				// botón
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
		// Objeto que guardará los datos.
		
		try {
			// Mapeador que permite guardar los datos del JSON en la clase elegida.
			ObjectMapper mapper = new ObjectMapper();
			datosCiudades = mapper.readValue(url, Prediccion.class); // falla porque tenemos que seleccionar los datos y poner
																// las propiedades apropiadas en la clase.
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datosCiudades;
	}
}
