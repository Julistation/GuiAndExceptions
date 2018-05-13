package modelo;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Estudiante {
	
	private String nombre, apellido, genero;
	private int edad, numeroCursos;
	private ArrayList <Curso> cursos;
	
	public Estudiante(String nombre, String apellido, String genero, int edad){
		this.nombre= nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.numeroCursos=0;
		
		cursos = new ArrayList <Curso>();
	}

	public String darNombre() {
		return nombre;
	}

	public void cambiarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String darApellido() {
		return apellido;
	}

	public void cambiarApellido(String apellido) {
		this.apellido = apellido;
	}

	public String darGenero() {
		return genero;
	}

	public void cambiarGenero(String genero) {
		this.genero = genero;
	}

	public int darEdad() {
		return edad;
	}

	public void cambiarEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<Curso> darCursos() {
		return cursos;
	}

	public void cambiarCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public boolean seBusca(String pNombre){
		boolean encontrado = false;
		for (int i = 0; i < cursos.size() && !encontrado; i++) {
			if (cursos.get(i).darNombre().equalsIgnoreCase(pNombre)) {
				encontrado = true;
			}
		}
		return encontrado;
	}
	
	public void agregarCurso(Curso curso) throws Exception{
		if (seBusca(curso.darNombre())) {
			throw new Exception("El curso que intenta ingresar ya existe");
		}
		else {
			cursos.add(curso);
			numeroCursos ++;
		}
	}
	
	public int darCantidadCursos(){
		return numeroCursos;
	}
}

