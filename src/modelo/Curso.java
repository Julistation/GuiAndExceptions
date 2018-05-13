package modelo;

public class Curso {
	
	private String nombre;
	private int creditos;
	private double calificacion;
	
	public Curso(String nombre, int creditos, double calificacion) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.calificacion = calificacion;
	}

	public String darNombre() {
		return nombre;
	}

	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}

	public int darCreditos() {
		return creditos;
	}

	public void cambiarCreditos(int creditos) {
		this.creditos = creditos;
	}

	public double darCalificacion() {
		return calificacion;
	}

	public void cambiarCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
