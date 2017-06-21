package vista;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import modelo.SuperModelo;
import observer.IObservador;

public class VistaConSlider 
	extends JFrame
	implements IObservador{ 

	private static final long serialVersionUID = 1L;
	private SuperModelo modelo;
	JSlider slider = null;

	public VistaConSlider(SuperModelo model){
		this.setTitle("Formulario con JSlider");
		this.setSize(350, 70);
		this.setLocation(100, 100);
		
		this.modelo = model;
		this.modelo.registrarObservador(this);
		
		slider = new JSlider(JSlider.HORIZONTAL, 0,100,50);
		slider.addChangeListener(
				new ChangeListener(){
					@Override
					public void stateChanged(ChangeEvent arg0) {						
						modelo.setValor(slider.getValue());
					}
					
				}
		);
		slider.setValue(this.modelo.getValor());
		this.add(slider);
		
	}

	@Override
	public void actualizar() {
		this.slider.setValue(this.modelo.getValor());
		
	}
}
