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
 * En la aplicaci�n debemos saber siempre de qu� pa�s y ciudad estamos mostrando
 * la informaci�n, adem�s se mostrar� la predicci�n climatol�gica de los
 * pr�ximos cuatro d�as de la ciudad elegida. De cada d�a se nos debe mostrar el
 * d�a del que se trata, la temperatura m�xima y m�nima en Celsius, el estado
 * del cielo (Soleado, Tormentas, etc�).
 * 
 * "forecastDate": "2020-10-16", "wxdesc": "", "weather": "Soleado", "minTemp":
 * "5", "maxTemp": "18", "minTempF": "41", "maxTempF": "64", "weatherIcon": 2402
 */