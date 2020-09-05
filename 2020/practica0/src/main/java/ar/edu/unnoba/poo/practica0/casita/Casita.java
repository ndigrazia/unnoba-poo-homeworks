package ar.edu.unnoba.poo.practica0.casita;

import ar.edu.unnoba.poo.practica0.casita.decorador.Base;
import ar.edu.unnoba.poo.practica0.casita.decorador.Cortina;
import ar.edu.unnoba.poo.practica0.casita.decorador.Elemento;
import ar.edu.unnoba.poo.practica0.casita.decorador.Nube;
import ar.edu.unnoba.poo.practica0.casita.decorador.Perro;
import ar.edu.unnoba.poo.practica0.casita.decorador.Techo;

public class Casita {
    public static void main(String[] args){
        Elemento e = new Nube(new Perro(new Cortina(new Techo(new Base()))));
        System.out.println(e.dibujar());
    }
}
