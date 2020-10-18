package controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.fasterxml.jackson.databind.ObjectMapper;

import modelo.Prediccion;
import vista.Vista;

public class Controlador {
	
Vista vista;
Prediccion prediccion;
Listen lis = new Listen();

	public Controlador(Vista vista, Prediccion datos) {
	this.vista = vista;
	this.prediccion=datos;
	
	// Listeners para los botones de la vista.
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
	//		Set<String> ciudades = configuracion.stringPropertyNames();

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
			prediccion = mapper.readValue(url, Prediccion.class); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prediccion;
	}
	
	public class Listen implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			
			vista.setNombreCiudad(ae.getActionCommand());
			fromFileToObject(obtenerCiudadesFichero());
			
			setDia();
			
			
		}

		private void setDia() {
			
			
			vista.textAreaResultados.append(prediccion.getCity().getCityName()+"\t");
			vista.textAreaResultados.append(prediccion.getCity().getForecast().getForecastDay().get(0).getforecastDate()+"\t");
			vista.textAreaResultados.append(prediccion.getCity().getForecast().getForecastDay().get(0).getMaxTemp()+"\t"); 
			vista.textAreaResultados.append(prediccion.getCity().getForecast().getForecastDay().get(0).getMinTemp()+"\t"); 
			vista.textAreaResultados.append(prediccion.getCity().getForecast().getForecastDay().get(0).getWeather()+"\t");
			for (int i = 0; i < prediccion.getCity().getForecast().getForecastDay().size(); i++) {
				
			}
			
			
			
		}
	}
}

/*De la clase City (prediccion.getCity().getcityName()):
 * String cityName;
 * de la clase ForecastDay (prediccion.getCity().getForecastDate().getCadaUnaDeLasCosas()):
	String forecastDate; // fecha de la prediccion
	String weather;
	String minTemp;
	String maxTemp;
	String weatherIcon;
 * */