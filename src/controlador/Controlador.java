package controlador;

import java.util.ArrayList;

import modelo.Curso;
import modelo.BestProf;
import vista.VentanaPrincipal;

public class Controlador {
	
	private VentanaPrincipal ventana;
	private BestProf modelo;
	
	public Controlador(){
		ventana = new VentanaPrincipal(this);
		modelo = new BestProf();
	}
	
	public void agregarEstudiante(String nombre, String apellido, String genero, int edad){
		modelo.agregarEstudiante(nombre, apellido, genero, edad);
		ventana.aviso("El estudiante fue agregado");
	}
	
	public void promedio(){
		
		try {
			double promedioEstudiante = modelo.darPromedio();
			ventana.aviso("El promedio del estudiante es " + promedioEstudiante);
		} catch (Exception e) {
			ventana.error(e.getMessage());
		}
	}
	
	public void mejorCalificado(){
		try {
			String mejor = modelo.darCursoMejorCalificado();
			ventana.aviso("El curso con mejor nota es " + mejor);
		} catch (Exception e) {
			ventana.error(e.getMessage());
		}
	}
	
	public void darCursoMenosCreditos(int pCreditos) {
		try {
			int menoresIguales = modelo.darCursosMenosCreditos(pCreditos);
			ventana.aviso("Tiene " + menoresIguales + " cursos con menos o igual creditos que " + pCreditos);
		} catch (Exception e) {
			ventana.error(e.getMessage());
		}
	}
	
	public void agregarCurso(String nombre, int numCreditos, double calificacion) {
		try {
			modelo.agregarCurso(new Curso(nombre, numCreditos, calificacion));
			ventana.aviso("Curso agregado correctamente");
		} catch (Exception e) {
			ventana.error(e.getMessage());
		}
	}
	
	public int actualizarCantidad(){
		int cantidad = modelo.darCantidadCursos();
		return cantidad;
	}
}
