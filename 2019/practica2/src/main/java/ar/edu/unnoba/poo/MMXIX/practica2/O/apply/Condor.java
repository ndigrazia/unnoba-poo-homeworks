package ar.edu.unnoba.poo.MMXIX.practica2.O.apply;

public class Condor extends Ave {

	public Condor() {
		super(Pico.GANCHO);
	}

	@Override
	public Comida getTipoComida() {
		return Comida.CARNIVORO;
	}
	
	@Override
	public String toString() {
		return "Condor";
	}
	
}
