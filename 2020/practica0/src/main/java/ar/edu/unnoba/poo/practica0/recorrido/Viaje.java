package ar.edu.unnoba.poo.practica0.recorrido;

public class Viaje {

    private Recorrido recorrido;

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public String recorrer() {
        return recorrido.recorrer();
    }

    public static void main(String[] args) {
        Viaje v = new Viaje();

        v.setRecorrido(new RecorridoEconomico());

        System.out.println(v.recorrer());
    }
}
