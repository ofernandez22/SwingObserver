package modelo;

import observer.Observado;

public class SuperModelo extends Observado {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		this.actualizarObservadores();
	}
}
