package controlador;

import java.util.List;

public class Predicciones {
	
	private List<Prediccion> predicciones = null;

	@Override
	public String toString() {
		return "Predicciones [predicciones=" + predicciones + "]";
	}

	public List<Prediccion> getPredicciones() {
		return predicciones;
	}

	public void setPredicciones(List<Prediccion> predicciones) {
		this.predicciones = predicciones;
	}
}
