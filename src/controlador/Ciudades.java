package controlador;

import java.util.List;

public class Ciudades {
	
	private List<Ciudad> predicciones = null;

	@Override
	public String toString() {
		return "Predicciones [predicciones=" + predicciones + "]";
	}

	public List<Ciudad> getPredicciones() {
		return predicciones;
	}

	public void setPredicciones(List<Ciudad> predicciones) {
		this.predicciones = predicciones;
	}
}
