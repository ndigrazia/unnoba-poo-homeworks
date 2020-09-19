package ar.edu.unnoba.poo.solid.lsp.solucion;

public class Cuadrado implements Figura {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double area() {
		return lado * lado;
	}

}