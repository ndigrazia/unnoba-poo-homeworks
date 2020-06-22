package ar.edu.unnoba.poo.MMXIX.practica2.I.does_not_apply;

public class Paloma extends Ave {

	public Paloma() {
		super(Pico.CORTO_PEQUEÑO);
	}

	@Override
	public Comida getTipoComida() {
		return Comida.GRANIVORO;
	}

	@Override
	public String toString() {
		return "Paloma";
	}
	
	public Tipo getTipo() {
		return Tipo.TERRESTRE;
	}

	public void volar() {
	}

	public void nadar() {
	}
}
