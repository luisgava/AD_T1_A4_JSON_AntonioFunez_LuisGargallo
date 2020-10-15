package controlador;

public class Prediccion {
	// De "city":
	private String pais;
	private String ciudad;
	
	// De "forecast":/ "forecastDay":
	private String dia;
	private String tiempo;
	private String minTemp;
	private String maxtemp;
	private String icono;
	
	// Getters y Setters
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public String getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(String minTemp) {
		this.minTemp = minTemp;
	}
	public String getMaxtemp() {
		return maxtemp;
	}
	public void setMaxtemp(String maxtemp) {
		this.maxtemp = maxtemp;
	}
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}


}

/**
 * En la aplicación debemos saber siempre de qué país y ciudad estamos mostrando
 * la información, además se mostrará la predicción climatológica de los
 * próximos cuatro días de la ciudad elegida. De cada día se nos debe mostrar el
 * día del que se trata, la temperatura máxima y mínima en Celsius, el estado
 * del cielo (Soleado, Tormentas, etc…).
 * 
 * "forecastDate": "2020-10-16", "wxdesc": "", "weather": "Soleado", "minTemp":
 * "5", "maxTemp": "18", "minTempF": "41", "maxTempF": "64", "weatherIcon": 2402
 */