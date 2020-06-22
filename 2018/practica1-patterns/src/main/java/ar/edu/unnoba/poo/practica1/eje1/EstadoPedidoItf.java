package ar.edu.unnoba.poo.practica1.eje1;

public interface EstadoPedidoItf {

	public boolean agregarArticulo(Pedido p, Articulo a);
	
	public boolean agregarRemito(Pedido p, Remito r);
	
	public boolean reAbrir(Pedido p);
	
}
