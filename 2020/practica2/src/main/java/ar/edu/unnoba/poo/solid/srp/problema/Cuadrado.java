package ar.edu.unnoba.poo.solid.srp.problema;

public class Cuadrado implements Figura {
	
	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}

	public double area() {
		return Math.pow(lado, 2);
	}

}
