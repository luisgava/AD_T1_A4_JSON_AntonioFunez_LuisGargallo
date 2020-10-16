package controlador;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Controlador {
	
	
	
	public URL obtenerCiudadesFichero () {
	// Obtenemos la lista de ciudades del fichero de propiedades
	Properties configuracion = new Properties();	
	
	URL url = null;
	try {
		configuracion.load(new FileReader("src/resources/config.properties.xml"));
		Set<String> ciudades = configuracion.stringPropertyNames();
		
		
		//leer fichero de propiedades
		String direccionCiudad =  configuracion.getProperty("Frankfurt"); // el nombre de la ciudad debe ponerlo el botón
		url = new URL(direccionCiudad);
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(url);
	return url;
	}
	
	
	/**
	 * Deserializa el string en formato JSON en un objeto JAVA
	 * @param pathname
	 * @return
	 */
	public Prediccion fromFileToObject(URL url) {
		Prediccion data = null;
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			data.city = mapper.readValue
			data = mapper.readValue(url, Prediccion.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}

}
