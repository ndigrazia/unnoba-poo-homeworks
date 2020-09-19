package ar.edu.unnoba.poo.solid.srp.solucion;

public class Circulo implements Figura {

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
}
