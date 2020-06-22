package ar.edu.unnoba.poo.MMXIX.practica2.I.does_not_apply;

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

	public Tipo getTipo() {
		return Tipo.RAPACES;
	}

	public void volar() {
		
	}

	public void nadar() {
	}
}
