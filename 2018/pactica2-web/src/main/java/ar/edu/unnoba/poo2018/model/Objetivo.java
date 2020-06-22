package ar.edu.unnoba.poo2018.model;

public class Objetivo {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
				return true;
		return nombre.equals(((Objetivo)obj).getNombre());
	}
	
	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	
}
