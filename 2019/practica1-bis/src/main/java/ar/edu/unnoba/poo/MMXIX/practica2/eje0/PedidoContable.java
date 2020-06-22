package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

public class PedidoContable extends Pedido {

	@Override
	public void agregarArticulo(Articulo a) {
		getVisitor().addArticulo(this, a);
	}

	@Override
	public void agregarRemito(Remito r) {
		getVisitor().addRemito(this, r);
	}
	
	public void agregarArticuloContable(Articulo a) {
		articulos.add(a);
	}

	public void agregarRemitoContable(Remito a) {
		remitos.add(a);
	}
	
}
