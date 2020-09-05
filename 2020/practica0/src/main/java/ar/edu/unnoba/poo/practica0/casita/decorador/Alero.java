package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Alero extends Decorador {

    public Alero(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Alero en la puerta - " + super.dibujar();
    }
}
