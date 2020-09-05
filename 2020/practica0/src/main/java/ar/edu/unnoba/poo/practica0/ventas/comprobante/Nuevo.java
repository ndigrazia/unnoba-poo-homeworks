package ar.edu.unnoba.poo.practica0.ventas.comprobante;

import ar.edu.unnoba.poo.practica0.ventas.Articulo;
import ar.edu.unnoba.poo.practica0.ventas.Comprobante;

public class Nuevo implements EstadoComprobante {

    @Override
    public void agregarArticulo(Comprobante comprobante, Articulo articulo, double precio) {
        comprobante.procesoAgregarArticulo(articulo, precio);
    }

    @Override
    public double montoTotal(Comprobante comprobante) {
        return 0;
    }

}
