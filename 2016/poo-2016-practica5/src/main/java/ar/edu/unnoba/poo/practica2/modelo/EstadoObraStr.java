package ar.edu.unnoba.poo.practica2.modelo;

public abstract class EstadoObraStr {
	
	public float costo(Obra o, float valor) {
	  return o.costoBasico() * valor;
	}

  	public abstract boolean isConcluida();
  
  	public abstract void cambiarEstado(Obra o);

}