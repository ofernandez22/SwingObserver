package principal;

import java.awt.EventQueue;

public class Programa {

	public static void main(String[] args) {
		/*EventQueue.invokeLater(
				new Runnable() {
					public void run(){
						JFrame f = new VistaFormularioPrincipal();
						f.setVisible(true);
					}
				}
		);*/
		
		EventQueue.invokeLater(new ThreadVentanas());
	}

}
