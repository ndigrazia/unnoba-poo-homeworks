package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Chimenea extends Decorador {

    public Chimenea(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Chimenea - " + super.dibujar();
    }
}
