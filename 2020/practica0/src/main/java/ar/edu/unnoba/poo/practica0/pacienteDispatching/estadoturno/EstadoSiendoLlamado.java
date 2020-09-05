package ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.Bono;
import ar.edu.unnoba.poo.practica0.pacienteDispatching.Turno;

public class EstadoSiendoLlamado extends EstadoTurno {
	
	public void puedoCargarBono(Turno turno, Bono bono){
		turno.cargarBonoSiendoLlamado(bono);
	};
	
	public void puedoLlamar(Turno turno){
		turno.llamarSiendoLlamado();
	};
	
	public void ingreso(Turno turno){
		turno.ingresoSiendoLlamado();
	};
		
}
