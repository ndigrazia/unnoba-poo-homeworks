package ar.edu.unnoba.poo.practica0.ventas.comprobante;

import ar.edu.unnoba.poo.practica0.ventas.Articulo;
import ar.edu.unnoba.poo.practica0.ventas.Comprobante;

public interface EstadoComprobante {

  public void agregarArticulo(Comprobante comprobante, Articulo articulo, double precio);

  public double montoTotal(Comprobante comprobante);

}
