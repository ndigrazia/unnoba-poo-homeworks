package ar.edu.unnoba.poo.practica0.pacienteDispatching;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno.*;
import ar.edu.unnoba.poo.practica0.pacienteDispatching.turno.*;

public class Main {

	public static void main(String[] args) {
		EstadoEnEspera estado = new EstadoEnEspera();
		
		Turno t = new TurnoTV();

		t.cargarBono(estado, new Bono());
	}

}
