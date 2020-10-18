package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

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
		for (JButton boton : this.vista.getListaBotones()) {
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
	 * Método que deserializa el string en formato JSON recogido de una url a
	 * objetos JAVA
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
			vista.getTextAreaResultados().setText(null);

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
			vista.getTextAreaResultados().append(
					"Ciudad" + "\t" + "Fecha" + "\t" + "Temp. Máx." + "\t" + "Temp. Min." + "\t" + "Tiempo" + "\r\n");
			// Mostramos el nombre de la ciudad.
			vista.getTextAreaResultados().append(prediccion.getCity().getCityName() + "\t");

			// Recorremos y mostramos los datos de los ForecastDay (días de predicción).
			for (int i = 0; i < prediccion.getCity().getForecast().getForecastDay().size()-1; i++) {

				// Fecha.
				vista.getTextAreaResultados()
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getforecastDate() + "\t");
				// Temperatura máxima.
				vista.getTextAreaResultados()
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getMaxTemp() + "\t");
				// Temperatura mínima.
				vista.getTextAreaResultados()
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getMinTemp() + "\t");
				// Tiempo.
				vista.getTextAreaResultados()
						.append(prediccion.getCity().getForecast().getForecastDay().get(i).getWeather() + "\r\n\t");
				// Icono.
				vista.getListaIconos().get(i).setIcon(new ImageIcon(
						darIcono(prediccion.getCity().getForecast().getForecastDay().get(i).getWeather())));
			}
		}

		/**
		 * Método que selecciona el icono en función del weather.
		 * 
		 * @param tiempo
		 * @return
		 */
		public String darIcono(String tiempo) {

			String rutaIcono = null;

			if (tiempo.equalsIgnoreCase("Nuboso") || tiempo.equalsIgnoreCase("Parcialmente Nuboso")
					|| tiempo.equalsIgnoreCase("Poco nuboso") || tiempo.equalsIgnoreCase("Intervalos nubosos")) { // NUBOSO

				rutaIcono = "src\\resources\\IconAemet\\14.png";

			} else if (tiempo.contains("Despejado") || tiempo.equalsIgnoreCase("Despejado")) { // DESPEJADO
				rutaIcono = "src\\resources\\IconAemet\\11.png";

			} else if (tiempo.equalsIgnoreCase("Muy nuboso") || tiempo.equalsIgnoreCase("Cubierto")) { // MUY NUBOSO
				rutaIcono = "src\\resources\\IconAemet\\16.png";

			} else if (tiempo.contains("Lluvia débil") || tiempo.equalsIgnoreCase("Lluvia")
					|| tiempo.equalsIgnoreCase("Lluvia débil")) { // LLUVIA
				rutaIcono = "src\\resources\\IconAemet\\26.png";

			} else if (tiempo.contains("nieve") || tiempo.equalsIgnoreCase("Nieve")) { // NIEVE
				rutaIcono = "src\\resources\\IconAemet\\36.png";

			} else if (tiempo.contains("tormenta") || tiempo.equalsIgnoreCase("Tormenta")) { // TORMENTA
				rutaIcono = "src\\resources\\IconAemet\\54.png";

			} else { // POR DEFECTO
				rutaIcono = "src\\resources\\IconAemet\\11.png";
			}
			return rutaIcono;
		}
	}
}
