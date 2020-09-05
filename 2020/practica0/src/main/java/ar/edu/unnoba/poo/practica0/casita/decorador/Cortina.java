package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Cortina extends Decorador {

    public Cortina(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Cortina - " + super.dibujar();
    }
}
