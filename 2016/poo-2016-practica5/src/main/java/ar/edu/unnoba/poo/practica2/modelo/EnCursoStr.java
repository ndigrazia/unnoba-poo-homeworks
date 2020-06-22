package ar.edu.unnoba.poo.practica2.modelo;

public class EnCursoStr extends EstadoObraStr {

	@Override
	public boolean isConcluida() {
		return false;
	}

    @Override
	public void cambiarEstado(Obra o) {
		o.setTipo(TipoEstadoObra.FINALIDAD);
	}
  
}