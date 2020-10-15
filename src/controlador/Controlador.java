package controlador;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Controlador {
	public Prediccion fromFileToObject(String pathname) {
		Prediccion data = null;

		try {
			ObjectMapper mapper = new ObjectMapper();
			data = mapper.readValue(new File(pathname), Libros.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;

	}

}
