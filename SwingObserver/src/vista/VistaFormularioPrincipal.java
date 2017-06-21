package vista;

//con control+shift+o agrega los import solo
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import modelo.SuperModelo;


public class VistaFormularioPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	private SuperModelo modelo;
	
	public VistaFormularioPrincipal(){
		this.setTitle("Formulario principal");
		this.setSize(320, 200);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		modelo = new SuperModelo();
		modelo.setValor(20);
		
		JMenuBar barra = new JMenuBar();
		
		JMenu formularios = new JMenu("Formularios");
		barra.add(formularios);
		
		JMenuItem formTextbox = new JMenuItem("Con TextBox");
		formularios.add(formTextbox);
		formTextbox.addActionListener (
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {						
						JFrame f2 = new VistaConTextbox(modelo);
						f2.setVisible(true);						
					}				
				}
		);	
		
		JMenuItem formConSlider = new JMenuItem("Con TextSlider");
		formularios.add(formConSlider);
		formConSlider.addActionListener (
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {						
						JFrame f2 = new VistaConSlider(modelo);
						f2.setVisible(true);						
					}				
				}
		);	
		
		this.setJMenuBar(barra);		
	}

}
