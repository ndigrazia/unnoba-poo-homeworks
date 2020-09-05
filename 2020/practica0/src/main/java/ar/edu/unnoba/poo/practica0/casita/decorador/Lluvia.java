package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Lluvia extends Decorador {

    public Lluvia(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Lluvia - " + super.dibujar();
    }
}
