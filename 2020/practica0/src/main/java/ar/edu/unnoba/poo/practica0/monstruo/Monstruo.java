package ar.edu.unnoba.poo.practica0.monstruo;

import ar.edu.unnoba.poo.practica0.monstruo.brazo.Brazo;
import ar.edu.unnoba.poo.practica0.monstruo.brazo.BrazoDinosaurio;
import ar.edu.unnoba.poo.practica0.monstruo.cabeza.Cabeza;
import ar.edu.unnoba.poo.practica0.monstruo.cabeza.CabezaDragon;
import ar.edu.unnoba.poo.practica0.monstruo.cola.Cola;
import ar.edu.unnoba.poo.practica0.monstruo.cuerpo.Cuerpo;
import ar.edu.unnoba.poo.practica0.monstruo.cuerpo.CuerpoPeludo;
import ar.edu.unnoba.poo.practica0.monstruo.pierna.Pierna;

public class Monstruo {

    private Cabeza cabeza;
    private Cuerpo cuerpo;
    private Brazo brazo;
    private Pierna pierna;
    private Cola cola;

    public Cabeza getCabeza() {
        return cabeza;
    }

    public void setCabeza(Cabeza cabeza) {
        this.cabeza = cabeza;
    }

    public Cuerpo getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(Cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Brazo getBrazo() {
        return brazo;
    }

    public void setBrazo(Brazo brazo) {
        this.brazo = brazo;
    }

    public Pierna getPierna() {
        return pierna;
    }

    public void setPierna(Pierna pierna) {
        this.pierna = pierna;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public void dibujar() {
        dibujarCabeza();
        dibujarCuerpo();
        dibujarBrazos();
        dibujarPiernas();
        dibujarCola();
    }

    private void dibujarCola() {
        getCola().dibujar();
    }

    private void dibujarPiernas() {
        getPierna().dibujar();
    }

    private void dibujarBrazos() {
        getBrazo().dibujar();
    }

    private void dibujarCuerpo() {
        getCuerpo().dibujar();
    }

    public void dibujarCabeza() { getCabeza().dibujar(); }

    public static void main(String[] args) {
        Monstruo mio = new Monstruo();

        mio.setCabeza(new CabezaDragon());
        mio.setCuerpo(new CuerpoPeludo());
        mio.setBrazo(new BrazoDinosaurio());

        mio.dibujar();
    }

}
