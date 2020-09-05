package ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.Bono;
import ar.edu.unnoba.poo.practica0.pacienteDispatching.Turno;

public class Ingreso extends EstadoTurno {

	public void puedoCargarBono(Turno turno, Bono bono){
		turno.cargarBonoIngreso(bono);
	};
	
	public void puedoLlamar(Turno turno){
		turno.llamarIngreso();
	};
	
	public void ingreso(Turno turno){
		turno.ingresoIngreso();
	};
}
