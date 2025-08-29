package practica1.eje1;

public class Entregado implements EstadoPedidoItf {

	public void agregarArticulo(Pedido p, Articulo a) throws NoIngresoArticuloException{
		throw new NoIngresoArticuloException();
	}

	public void agregarRemito(Pedido p, Remito r) throws NoIngresoRemitoException {
		throw new NoIngresoRemitoException();
	}

	public void reAbrir(Pedido p) throws NoReabrirException {
		throw new NoReabrirException();
	}

}
