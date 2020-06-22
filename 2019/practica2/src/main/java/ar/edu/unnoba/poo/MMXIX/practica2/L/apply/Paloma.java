package ar.edu.unnoba.poo.MMXIX.practica2.L.apply;

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
}
