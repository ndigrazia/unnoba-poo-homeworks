package ar.edu.unnoba.poo.MMXIX.practica2.I.apply;

public class Condor extends Ave implements Voladora {

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

	public Tipo getTipo() {
		return Tipo.RAPACES;
	}

	public void volar() {
		
	}
}
