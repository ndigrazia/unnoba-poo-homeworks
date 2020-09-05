package ar.edu.unnoba.poo.practica0.paciente.turno;

import ar.edu.unnoba.poo.practica0.paciente.Bono;
import ar.edu.unnoba.poo.practica0.paciente.Turno;

public abstract class EstadoTurno {

    public void puedoCargarBono(Turno turno, Bono bono){};

    public void puedoLlamar(Turno turno){};

    public void ingreso(Turno turno){};
    
}
