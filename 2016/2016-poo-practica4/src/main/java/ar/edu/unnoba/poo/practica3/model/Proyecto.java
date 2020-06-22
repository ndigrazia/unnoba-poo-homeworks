package ar.edu.unnoba.poo.practica3.model;

public class Proyecto {

	private String codigo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Proyecto(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	public String toString() {
		return "Proyecto: " + codigo;
	}

}
