package ar.edu.unnoba.poo.practica0.paciente;

import ar.edu.unnoba.poo.practica0.paciente.turno.EstadoEnEspera;
import ar.edu.unnoba.poo.practica0.paciente.turno.EstadoSiendoLlamado;
import ar.edu.unnoba.poo.practica0.paciente.turno.EstadoTurno;

public class Turno {

	private EstadoTurno estadoTurno;

	public void cambiarEstado(EstadoTurno estadoTurno){
		 this.estadoTurno = estadoTurno;
	}

    public void cargarBono(Bono bono) {
        estadoTurno.puedoCargarBono(this, bono);
    }

    public void processCargarBono(Bono bono) {
        cambiarEstado(new EstadoEnEspera());
    }

    public void llamar() {
        estadoTurno.puedoLlamar(this);
    }
    
    public void processLLamar() {
        //envio SMS y muestro en TV
        cambiarEstado(new EstadoSiendoLlamado());
    }

    public void ingreso() {
        estadoTurno.ingreso(this);
    }

}
