package ar.edu.unnoba.poo.practica0.pacienteDispatching;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno.EstadoTurno;

public abstract class Turno {

	public void cargarBono(EstadoTurno estado, Bono bono) {
		estado.puedoCargarBono(this, bono);
    }
    
    public void llamar(EstadoTurno estado) {
    	estado.puedoLlamar(this);
    }
    
    public void ingreso(EstadoTurno estado) {
    	estado.ingreso(this);
    }

    public abstract void cargarBonoSiendoLlamado(Bono bono);
    
    public abstract void cargarBonoLlego(Bono bono);
    
    public abstract void cargarBonoEnEspera(Bono bono);
    
    public abstract void cargarBonoIngreso(Bono bono);
    
    public abstract void llamarSiendoLlamado();
    
    public abstract void llamarLlego();
    
    public abstract void llamarEnEspera();
    
    public abstract void llamarIngreso();
        
    public abstract void ingresoSiendoLlamado();
    
    public abstract void ingresoLlego();
    
    public abstract void ingresoEnEspera();
    
    public abstract void ingresoIngreso();
    
}