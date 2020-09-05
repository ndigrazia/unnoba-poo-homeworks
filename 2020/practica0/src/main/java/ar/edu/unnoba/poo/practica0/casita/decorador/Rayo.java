package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Rayo extends Decorador {

    public Rayo(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Rayo - " + super.dibujar();
    }
}
