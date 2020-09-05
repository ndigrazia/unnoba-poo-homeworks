package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Balcon extends Decorador {

    public Balcon(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Balcon - " + super.dibujar();
    }
}
