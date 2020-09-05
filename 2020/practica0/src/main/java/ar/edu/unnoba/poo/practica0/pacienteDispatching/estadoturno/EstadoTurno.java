package ar.edu.unnoba.poo.practica0.pacienteDispatching.estadoturno;

import ar.edu.unnoba.poo.practica0.pacienteDispatching.Bono;
import ar.edu.unnoba.poo.practica0.pacienteDispatching.Turno;

public abstract class EstadoTurno {

    public void puedoCargarBono(Turno turno, Bono bono){};

    public void puedoLlamar(Turno turno){};

    public void ingreso(Turno turno){};
    
}
