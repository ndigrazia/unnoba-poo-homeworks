package ar.edu.unnoba.poo.practica1.eje3;

public class Caja implements Componente {

	private double precio;
	
	public Caja(double p) {
		precio = p;
	}
	
	public double precio() {
		return precio;
	}

}
