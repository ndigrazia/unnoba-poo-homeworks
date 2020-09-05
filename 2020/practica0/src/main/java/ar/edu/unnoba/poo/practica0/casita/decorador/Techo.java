package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Techo extends Decorador {

    public Techo(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Techo a 2 aguas - " + super.dibujar();
    }
}
