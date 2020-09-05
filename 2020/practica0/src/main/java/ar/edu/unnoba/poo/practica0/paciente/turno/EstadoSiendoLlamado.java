package ar.edu.unnoba.poo.practica0.paciente.turno;

import ar.edu.unnoba.poo.practica0.paciente.Turno;

public class EstadoSiendoLlamado extends EstadoTurno {
	
	public void puedoLlamar(Turno turno) {
		turno.processLLamar();
	}
	
	public void ingreso(Turno turno) {
		turno.cambiarEstado(new Ingreso());
	}

}
