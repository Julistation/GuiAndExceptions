package modelo;

import java.util.ArrayList;

public class BestProf {

	private Estudiante estudiante;

	public BestProf() {

	}

	public void agregarEstudiante(String nombre, String apellido, String genero, int edad) {
		estudiante = new Estudiante(nombre, apellido, genero, edad);
	}

	public double darPromedio() throws Exception {
		double acumulado = 0;
		int cantidad = 0;
		double promedio = 0;

		if (estudiante == null) {
			throw new Exception("No hay estudiantes en el sistema");
		}
		ArrayList<Curso> cursos = estudiante.darCursos();

		if (cursos.isEmpty()) {
			throw new Exception("El estudiante aun no registra cursos");
		}

		for (int i = 0; i < cursos.size(); i++) {
			acumulado += cursos.get(i).darCalificacion();
			cantidad++;
		}

		if (cantidad != 0) {
			promedio = acumulado / cantidad;
		}
		return promedio;
	}

	public String darCursoMejorCalificado() throws Exception {
		String mejor = " ";
		double notaRegistrada = 0;

		if (estudiante == null) {
			throw new Exception("No hay estudiantes en el sistema");
		}
		ArrayList<Curso> cursos = estudiante.darCursos();

		if (cursos.isEmpty()) {
			throw new Exception("El estudiante aun no registra cursos");
		}

		for (int i = 0; i < cursos.size(); i++) {
			if (cursos.get(i).darCalificacion() > notaRegistrada) {
				mejor = cursos.get(i).darNombre();
				notaRegistrada = cursos.get(i).darCalificacion();
			}
		}

		return mejor;
	}

	public int darCursosMenosCreditos(int pCreditos) throws Exception {
		int cantidad = 0;

		if (estudiante == null) {
			throw new Exception("No hay estudiantes en el sistema");
		}

		ArrayList<Curso> cursos = estudiante.darCursos();

		if (cursos.isEmpty()) {
			throw new Exception("El estudiante aun no registra cursos");
		}

		for (int i = 0; i < cursos.size(); i++) {
			if (cursos.get(i).darCreditos() <= pCreditos) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public void agregarCurso(Curso curso) throws Exception {
		if (estudiante == null) {
			throw new Exception("No hay estudiantes en el sistema");
		}
		estudiante.agregarCurso(curso);
	}
	
	public int darCantidadCursos(){
		int cantidad = estudiante.darCantidadCursos();
		return cantidad;
	}
}

