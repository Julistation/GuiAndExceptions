package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel{
	
	private JButton promedio, mejor, menosc, agregarC, agregarE; 
	private VentanaPrincipal ventana;
	
	public PanelOperaciones(VentanaPrincipal pVentana){
		ventana= pVentana;
		setLayout(new GridLayout(5, 1));
		setBorder(new TitledBorder("Operaciones"));
		
		promedio=new JButton("Calcula promedio");
		promedio.setActionCommand(ventana.PROMEDIO);
		promedio.addActionListener(ventana);
		add(promedio);
		
		mejor=new JButton("Curso mejor nota");
		mejor.setActionCommand(ventana.MEJOR);
		mejor.addActionListener(ventana);
		add(mejor);
		
		menosc=new JButton("Cursos menos creditos");
		menosc.setActionCommand(ventana.MENOSC);
		menosc.addActionListener(ventana);
		add(menosc);
		
		agregarC=new JButton("Agregar curso");
		agregarC.setActionCommand(ventana.AGREGARCURSO);
		agregarC.addActionListener(ventana);
		add(agregarC);
		
		agregarE=new JButton("Agregar Estudiante");
		agregarE.setActionCommand(ventana.AGREGARESTUDIANTE);
		agregarE.addActionListener(ventana);
		add(agregarE);
	}
}

