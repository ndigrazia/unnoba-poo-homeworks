package ar.edu.unnoba.poo.practica0.paciente.turno;

import ar.edu.unnoba.poo.practica0.paciente.Turno;

public class EstadoEnEspera extends EstadoTurno {

	public void puedoLlamar(Turno turno){
		turno.processLLamar();
	}
	
}
