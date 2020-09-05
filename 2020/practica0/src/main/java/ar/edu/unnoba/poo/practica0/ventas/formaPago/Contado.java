package ar.edu.unnoba.poo.practica0.ventas.formaPago;

public class Contado implements FormaPago {
    @Override
    public double descuento(double precio) {
        return precio * 0.70;
    }
}
