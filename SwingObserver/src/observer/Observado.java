package observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {
	private List<IObservador> observadores = new ArrayList<IObservador>();
	
	public void registrarObservador(IObservador obs){
		this.observadores.add(obs);
	}
	
	public void actualizarObservadores(){
		for (IObservador obs : this.observadores){
			obs.actualizar();
		}
	}
}
