package ar.edu.unnoba.poo.practica0.paciente.turno;

import ar.edu.unnoba.poo.practica0.paciente.Bono;
import ar.edu.unnoba.poo.practica0.paciente.Turno;

public class EstadoTurnoLlego extends EstadoTurno {
	
	public void puedoCargarBono(Turno turno, Bono bono){
		 turno.processCargarBono(bono);
	}

}
