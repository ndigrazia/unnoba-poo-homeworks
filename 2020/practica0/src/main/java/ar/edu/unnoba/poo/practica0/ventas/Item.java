package ar.edu.unnoba.poo.practica0.ventas;

public class Item {

    private Articulo articulo;
    private int cantidad;
    private double precio;

    public Item(Articulo articulo, int cantidad, double precio) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double monto() {
        return cantidad *  precio;
    }
}
