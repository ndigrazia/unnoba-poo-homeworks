package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Perro extends Decorador {

    public Perro(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Perro - " + super.dibujar();
    }
}
