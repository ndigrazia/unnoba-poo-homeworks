package ar.edu.unnoba.poo.practica1.eje1;

public class Abierto implements EstadoPedidoItf {

	public boolean agregarArticulo(Pedido p, Articulo a) {
		p.agregarNuevoArticulo(a);
		return true;
	}

	public boolean agregarRemito(Pedido p, Remito r) {
		return false;
	}

	public boolean reAbrir(Pedido p) {
		return false;
	}

}
