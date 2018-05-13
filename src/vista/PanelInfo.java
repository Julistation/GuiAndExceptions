package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class PanelInfo extends JPanel{
	
	private JLabel lbNombre;
	private JLabel lbApellido;
	private JLabel lbGenero;
	private JLabel lbEdad;
	private JLabel lbCursos;
	
	public PanelInfo(){
		
		lbNombre = new JLabel("Nombre: ");
		lbApellido = new JLabel("Apellido: ");
		lbGenero = new JLabel("Genero: ");
		lbEdad = new JLabel("Edad: ");
		lbCursos = new JLabel("Cursos: ");
		
		setBorder(new TitledBorder("Informacion del estudiante"));
		setLayout(new GridLayout(5, 1, 2, 2));
		
		add(lbNombre);
		add(lbApellido);
		add(lbGenero);
		add(lbEdad);
		add(lbCursos);
	}
	
	public void enviarInfo(String nombre, String apellido, String genero, int edad) {
		lbNombre.setText("Nombre: " + nombre);
		lbApellido.setText("Apellido: " + apellido);
		lbGenero.setText("Genero: " + genero);
		lbEdad.setText("Edad: " + Integer.toString(edad));
		validate();
	}
	
	public void enviarCursos(int cantidad){
		lbCursos.setText("Cursos: " + Integer.toString(cantidad));
	}
}

