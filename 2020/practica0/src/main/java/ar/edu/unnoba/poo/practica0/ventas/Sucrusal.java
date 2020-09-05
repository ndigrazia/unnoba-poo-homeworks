package ar.edu.unnoba.poo.practica0.ventas;

import java.util.ArrayList;
import java.util.List;

public class Sucrusal {

    private List<Comprobante> comprobantes = new ArrayList<Comprobante>();
    private List<Articulo> articulos = new ArrayList<Articulo>();

    public void addArticulo(Articulo a) {
        articulos.add(a);
    }

    public void addComprobante(Comprobante c) {
        comprobantes.add(c);
    }

    public double montoTotal() {
        double m = 0;

        for(Comprobante c:comprobantes)
            m+=c.montoTotal();

            return m;
    }

    public double montoConDescuentos() {
        double m = 0;

        for(Comprobante c:comprobantes)
            m+=c.montoConDescuentos();

        return m;
    }

}
