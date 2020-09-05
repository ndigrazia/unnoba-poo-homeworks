package ar.edu.unnoba.poo.practica0.ventas.comprobante;

import ar.edu.unnoba.poo.practica0.ventas.Articulo;
import ar.edu.unnoba.poo.practica0.ventas.Comprobante;

public class Cerrado implements EstadoComprobante {

    @Override
    public void agregarArticulo(Comprobante comprobante, Articulo articulo, double precio) {
    }

    @Override
    public double montoTotal(Comprobante comprobante) {
        return comprobante.procesoCalcularMontoTotal();
    }

}
