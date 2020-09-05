package ar.edu.unnoba.poo.practica1.eje1;

public interface EstadoPedidoItf {

	public void agregarArticulo(Pedido p, Articulo a) throws NoIngresoArticuloException;
	
	public void agregarRemito(Pedido p, Remito r) throws NoIngresoRemitoException;
	
	public void reAbrir(Pedido p) throws NoReabrirException;
	
}
