package ar.edu.unnoba.poo.MMXIX.practica1.eje2;

public class Impresora {

	private String name;
	
	public Impresora(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
