package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

public class Abierto extends Visitor {

	@Override
	public void addArticulo(PedidoStock p, Articulo a) {
		p.agregarArticuloStock(a);
	}

	@Override
	public void addArticulo(PedidoContable p, Articulo a) {
	}

	@Override
	public void addRemito(PedidoStock p, Remito r) {
		p.agregarRemitoStock(r);
	}

	@Override
	public void addRemito(PedidoContable p, Remito r) {
	}
	
}
