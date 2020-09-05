package ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.Bono;
import ar.edu.unnoba.poo.practica0.pacienteDispatching.Turno;

public class EstadoEnEspera extends EstadoTurno {

	public void puedoCargarBono(Turno turno, Bono bono){
		turno.cargarBonoEnEspera(bono);
	};
	
	public void puedoLlamar(Turno turno){
		turno.llamarEnEspera();
	};
	
	public void ingreso(Turno turno){
		turno.ingresoEnEspera();
	};
}
