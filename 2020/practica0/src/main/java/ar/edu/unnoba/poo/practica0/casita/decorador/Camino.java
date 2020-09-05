package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Camino extends Decorador {

    public Camino(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Camino - " + super.dibujar();
    }
}
