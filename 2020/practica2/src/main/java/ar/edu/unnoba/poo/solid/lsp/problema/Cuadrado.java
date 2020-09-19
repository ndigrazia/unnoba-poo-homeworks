package ar.edu.unnoba.poo.solid.lsp.problema;

public class Cuadrado extends Rectangulo {
	
	public void setBase(double valor) {
		super.setBase(valor);
		super.setAltura(valor);
	}

	public void setAltura(double valor) {
		super.setBase(valor);
		super.setAltura(valor);
	}
}
