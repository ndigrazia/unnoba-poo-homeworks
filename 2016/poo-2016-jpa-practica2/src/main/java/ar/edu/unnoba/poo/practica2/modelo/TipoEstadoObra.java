package ar.edu.unnoba.poo.practica2.modelo;

public enum TipoEstadoObra {

	PROYECTADA(1, 0.2f, new ProyectadaStr()), 
	ENCURSO(2, 0.5f, new EnCursoStr()), 
	FINALIDAD(3, 1f, new FinalizadaStr());

	private int tipo;
	private float valor;
	private EstadoObraStr str;

	TipoEstadoObra(int tipo, float valor, EstadoObraStr str) {
		this.tipo = tipo;
		this.valor = valor;
		this.str = str;
	}

	public float getTipo() {
		return tipo;
	}
	
	public float getValor() {
		return valor;
	}

	public boolean isConcluida() {
		return str.isConcluida();
	}
	  
  	public void cambiarEstado(Obra o) {
  		str.cambiarEstado(o);
  	}
  	
  	public float costo(Obra o) {
  	  return str.costo(o, valor);
  	}
  	
}
