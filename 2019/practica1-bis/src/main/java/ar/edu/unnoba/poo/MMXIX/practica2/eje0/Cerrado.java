package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

public class Cerrado extends Visitor {

	@Override
	public void addArticulo(PedidoStock p, Articulo a) {
	}

	@Override
	public void addArticulo(PedidoContable p, Articulo a) {
		p.agregarArticuloContable(a);
	}

	@Override
	public void addRemito(PedidoStock p, Remito r) {
	}

	@Override
	public void addRemito(PedidoContable p, Remito r) {
		p.agregarRemitoContable(r);
	}
	
}
