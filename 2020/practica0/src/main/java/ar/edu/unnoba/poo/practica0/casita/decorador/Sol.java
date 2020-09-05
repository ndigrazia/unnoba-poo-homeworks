package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Sol extends Decorador {

    public Sol(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Sol - " + super.dibujar();
    }
}
