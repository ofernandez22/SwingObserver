package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.SuperModelo;
import observer.IObservador;

public class VistaConTextbox  
	extends JFrame
	implements IObservador, ActionListener{ /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SuperModelo modelo;
	private JTextField txt = null;

	public VistaConTextbox(SuperModelo modelo){
		this.setTitle("Formulario con TextBox");
		this.setSize(350, 70);
		this.setLocation(100, 100);
		
		this.modelo = modelo;
		this.modelo.registrarObservador(this);
		
		//ACA Hay que crear un JTextField 
		//y un JButton
		//this.setLayout(new GridLayout(1,2));
		this.setLayout(null);
		this.setResizable(false);
		
		txt = new JTextField();		
		txt.setText(String.valueOf(this.modelo.getValor()));		
		txt.setBounds(5, 5, 200, 26);
		this.add(txt);
		
		JButton boton = new JButton();
		boton.setBounds(205,5,130,25);
		boton.setText("Cambiar Valor");
		boton.addActionListener(this);
		this.add(boton);
		

	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		txt.setText(String.valueOf(this.modelo.getValor()));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{
			int valorEntero = Integer.parseInt(txt.getText());
			this.modelo.setValor(valorEntero);
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Fallo la conversion");
		}
	}
}
