package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JButton;

import com.fasterxml.jackson.databind.ObjectMapper;

import modelo.Prediccion;
import vista.Vista;

/**
 * Clase que controla la lógica de la App. Muestra la vista y recoge los datos
 * del modelo.
 */
public class Controlador {

	Vista vista;
	Prediccion prediccion;
	Listen lis = new Listen();

	/**
	 * Constructor del controlador.
	 * 
	 * @param vista - Vista
	 * @param datos - Prediccion
	 */
	public Controlador(Vista vista, Prediccion datos) {
		this.vista = vista;
		this.prediccion = datos;
		// Añadimos listeners para los botones de la vista.
		for (JButton boton : this.vista.listaBotones) {
			boton.addActionListener(lis);
		}
	}

	/**
	 * Método que inicia la vista.
	 */
	public void inciarVista() {
		vista.setResizable(false);
		vista.setVisible(true);
	}

	/**
	 * Método para obtener las url de las ciudades.
	 * 
	 * @param nombreCiudad - String
	 * 
	 * @return
	 */
	public URL obtenerCiudadesFichero() {
		// Obtenemos la lista de ciudades del fichero de propiedades
		Properties configuracion = new Properties();
		URL url = null;
		try {
			// Cargamos el fichero de propiedades en configuracion.
			configuracion.load(new FileReader("src/resources/config.properties.xml"));
			// Leemos el fichero de propiedades.
			String direccionCiudad = configuracion.getProperty(vista.getNombreCiudad());
			// Pasamos el String a URL.
			url = new URL(direccionCiudad);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return url;
	}

	/**
	 * Método que deserializa el string en formato JSON recogido de una url a objetos JAVA
	 * 
	 * @param pathname
	 * @return
	 */
	public Prediccion fromUrlToObject(URL url) {
		// Objeto que guardará los datos.

		try {
			// Mapeador que permite guardar los datos del JSON en la clase elegida.
			ObjectMapper mapper = new ObjectMapper();
			prediccion = mapper.readValue(url, Prediccion.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prediccion;
	}

	/**
	 * Listener de los botones
	 */
	public class Listen implements ActionListener {

		/**
		 * Acción de los botones. Limpia los resultados anteriores, establece el nombre
		 * de la ciudad a buscar, transforma el JSON de esa ciudad en clases JAVA y
		 * ejecuta el método que muestra los resultados.
		 */
		public void actionPerformed(ActionEvent ae) {
			// Limpiamos resultados anteriores.
			vista.textAreaResultados.setText(null);
			// Establecemos el nombre de la ciudad con el nombre del botón.
			vista.setNombreCiudad(ae.getActionCommand());
			// Transformamos el JSON en clases Java.
			fromUrlToObject(obtenerCiudadesFichero());
			// Método que muestra la información.
			setDia();
		}

		/**
		 * Método que recoge la información y la muestra en el panel de resultados.
		 */
		private void setDia() {
			// Volvemos a poner las etiquetas que el clear del listener borra.
			vista.textAreaResultados.append(
					"Ciudad" + "\t" + "Fecha" + "\t" + "Temp. Máx." + "\t" + "Temp. Min." + "\t" + "Tiempo" + "\r\n");
			// Mostramos el nombre de la ciudad.
			vista.textAreaResultados.append(prediccion.getCity().getCityName() + "\t");

			// Recorremos y mostramos los datos de los ForecastDay (días de predicción).
			for (int i = 0; i < prediccion.getCity().getForecast().getForecastDay().size(); i++) {
				// Fecha.
				vista.textAreaResultados
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getforecastDate() + "\t");
				// Temperatura máxima.
				vista.textAreaResultados
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getMaxTemp() + "\t");
				// Temperatura mínima.
				vista.textAreaResultados
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getMinTemp() + "\t");
				// Tiempo
				vista.textAreaResultados
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getWeather() + "\r\n\t");
			}
		}
	}
}
