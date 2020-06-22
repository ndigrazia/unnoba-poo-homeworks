package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

public class PedidoStock extends Pedido {

	@Override
	public void agregarArticulo(Articulo a) {
		getVisitor().addArticulo(this, a);
	}

	@Override
	public void agregarRemito(Remito r) {
		getVisitor().addRemito(this, r);
	}
	
	public void agregarArticuloStock(Articulo a) {
		articulos.add(a);
	}

	public void agregarRemitoStock(Remito a) {
		remitos.add(a);
	}
	
}
