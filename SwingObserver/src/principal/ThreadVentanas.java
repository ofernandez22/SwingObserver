package principal;

import javax.swing.JFrame;

import vista.VistaFormularioPrincipal;

public class ThreadVentanas implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		JFrame f = new VistaFormularioPrincipal();
		f.setVisible(true);

		//JFrame f2 = new VistaConSlider();
		//f2.setVisible(true);
	}
}
