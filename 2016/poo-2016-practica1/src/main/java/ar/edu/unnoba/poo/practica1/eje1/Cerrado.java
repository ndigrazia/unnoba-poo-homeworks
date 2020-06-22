package ar.edu.unnoba.poo.practica1.eje1;

public class Cerrado implements EstadoPedidoItf {

	public boolean agregarArticulo(Pedido p, Articulo a) {
		return false;
	}

	public boolean agregarRemito(Pedido p, Remito r) {
		p.agregarNuevoRemito(r);
		return true;
	}

	public boolean reAbrir(Pedido p) {
		p.setEstado(new Abierto());
		return true;
	}

}
