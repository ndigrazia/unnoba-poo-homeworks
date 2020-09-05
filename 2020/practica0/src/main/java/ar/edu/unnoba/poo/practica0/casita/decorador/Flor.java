package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Flor extends Decorador {

    public Flor(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Flores - " + super.dibujar();
    }
}
