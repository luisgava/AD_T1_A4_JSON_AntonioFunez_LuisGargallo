package controlador;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Controlador {
	
	public Prediccion fromFileToObject(String pathname) {
		Prediccion data = null;

		try {
			ObjectMapper mapper = new ObjectMapper();
			data = mapper.readValue(new File(pathname), Prediccion.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}
	
	//obtener lista de ciudades del fichero de propiedades
	Properties configuracion = new Properties();	
	configuracion.load(new FileReader("src/resources/config.properties"));
	Set<String> ciudades = configuracion.stringPropertyNames();
	//leer fichero de propiedades
	String fichero = configuracion.getProperty("ciudad_real");


}
