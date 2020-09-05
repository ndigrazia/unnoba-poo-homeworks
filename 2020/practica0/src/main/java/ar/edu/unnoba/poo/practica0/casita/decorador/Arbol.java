package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Arbol extends Decorador {

    public Arbol(Elemento elemento){
        super(elemento);
    }

    @Override
    public String dibujar() {
        return "Arbol - " + super.dibujar();
    }
}
