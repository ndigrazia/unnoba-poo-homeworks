package ar.edu.unnoba.poo.practica0.casita.decorador;

public class Decorador implements Elemento {

    public Elemento elemento;

    public Decorador(Elemento elemento){
        this.elemento = elemento;
    }

    public Elemento getElemento() {
        return elemento;
    }

	public String dibujar() {
		 return elemento.dibujar();
	}
   
}
