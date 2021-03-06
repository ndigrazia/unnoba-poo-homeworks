package ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.Bono;
import ar.edu.unnoba.poo.practica0.pacienteDispatching.Turno;

public class EstadoTurnoLlego extends EstadoTurno {
	
	public void puedoCargarBono(Turno turno, Bono bono){
		turno.cargarBonoLlego(bono);
	};

	public void puedoLlamar(Turno turno){
		turno.llamarLlego();
	};
	
	public void ingreso(Turno turno){
		turno.ingresoLlego();
	};
}
