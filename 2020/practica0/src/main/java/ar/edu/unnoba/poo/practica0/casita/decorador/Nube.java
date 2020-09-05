package ar.edu.unnoba.poo.practica0.casita.decorador;

import ar.edu.unnoba.poo.practica0.casita.decorador.Decorador;

public class Nube extends Decorador {

    public Nube(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Nube - " + super.dibujar();
    }
}
