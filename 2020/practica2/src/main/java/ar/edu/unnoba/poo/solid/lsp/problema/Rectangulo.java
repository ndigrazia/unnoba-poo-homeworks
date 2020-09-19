package ar.edu.unnoba.poo.solid.lsp.problema;

public class Rectangulo implements Figura {
	
	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double area() {
		return base * altura;
	}

}
