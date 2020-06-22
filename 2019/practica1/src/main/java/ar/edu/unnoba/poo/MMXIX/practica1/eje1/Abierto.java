package ar.edu.unnoba.poo.MMXIX.practica1.eje1;

public class  Abierto implements EstadoPedidoItf {

	public void agregarArticulo(Pedido p, Articulo a) throws NoIngresoArticuloException {
		p.agregarNuevoArticulo(a);
	}

	public void agregarRemito(Pedido p, Remito r) throws NoIngresoRemitoException{
		throw new NoIngresoRemitoException();
	}

	public void reAbrir(Pedido p) throws NoReabrirException {
		throw new NoReabrirException();
	}

}
