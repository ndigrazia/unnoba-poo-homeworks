package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

public abstract class Visitor {
	
	public abstract void addArticulo(PedidoStock p, Articulo a);
	
	public abstract void addArticulo(PedidoContable p, Articulo a);
	
	public abstract void addRemito(PedidoStock p, Remito r);
	
	public abstract void addRemito(PedidoContable p, Remito r);
	
}
