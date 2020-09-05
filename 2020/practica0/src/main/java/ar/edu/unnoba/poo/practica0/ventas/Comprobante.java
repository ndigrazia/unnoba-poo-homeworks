package ar.edu.unnoba.poo.practica0.ventas;

import ar.edu.unnoba.poo.practica0.ventas.comprobante.EstadoComprobante;
import ar.edu.unnoba.poo.practica0.ventas.formaPago.FormaPago;

import java.util.ArrayList;
import java.util.List;

public class Comprobante {

    private FormaPago pago;
    private Cliente cliente;
    private EstadoComprobante estado;

    private List<Item> items = new ArrayList<Item>();

    public FormaPago getPago() {
        return pago;
    }
    public void setPago(FormaPago pago) {
        this.pago = pago;
    }

    public void agregarArticulo(Articulo articulo, double precio) {
        estado.agregarArticulo(this,articulo, precio);
    }

    //Usado por el Estado Nuevo
    public void procesoAgregarArticulo(Articulo articulo, double precio) {
        Item item = new Item(articulo, 1, precio);
        items.add(item);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double montoTotal() {
        return estado.montoTotal(this);
    }

    //Usado por el Estado Cerrado
    public double procesoCalcularMontoTotal() {
        double m = 0;

        for(Item i:items)
            m+=i.monto();

        return m;
    }

    public double montoConDescuentos() {
        double m = montoTotal();

        if(pago != null)
            return pago.descuento(m);

        return m;
    }

    public void setEstado(EstadoComprobante e) {
        estado = e;
    }
}
