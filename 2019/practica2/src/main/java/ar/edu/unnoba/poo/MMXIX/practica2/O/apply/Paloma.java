package ar.edu.unnoba.poo.MMXIX.practica2.O.apply;

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
	
}
