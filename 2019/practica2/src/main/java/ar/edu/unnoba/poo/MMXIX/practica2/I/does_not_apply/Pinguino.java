package ar.edu.unnoba.poo.MMXIX.practica2.I.does_not_apply;

public class Pinguino extends Ave {

	public Pinguino() {
		super(Pico.CORTO_PEQUEÑO);
	}

	@Override
	public Comida getTipoComida() {
		return Comida.PECES;
	}

	@Override
	public String toString() {
		return "Pinguino";
	}
	
	public Tipo getTipo() {
		return Tipo.ACUATICAS;
	}

	public void nadar() {	
	}

	public void volar() {
	}
	
}
