package ar.edu.unnoba.poo.practica0.ventas.formaPago;

public class Tarjeta implements FormaPago {
    @Override
    public double descuento(double precio) {
        return precio;
    }
}
