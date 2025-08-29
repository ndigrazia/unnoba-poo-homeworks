package practica1.eje1;

public class Cerrado implements EstadoPedidoItf {

	public void agregarArticulo(Pedido p, Articulo a) throws NoIngresoArticuloException{
		throw new NoIngresoArticuloException();
	}

	public void agregarRemito(Pedido p, Remito r) {
		p.agregarNuevoRemito(r);
	}

	public void reAbrir(Pedido p) {
		p.setEstado(new Abierto());
	}

}
