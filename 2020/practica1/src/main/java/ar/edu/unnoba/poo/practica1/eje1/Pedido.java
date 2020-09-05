package ar.edu.unnoba.poo.practica1.eje1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private int numero;
	private Date fechaEntrega;
	private String cliente;
	
	private EstadoPedidoItf estado;
	
	private List<Articulo> articulos = new ArrayList<Articulo>(); 
	private List<Remito> remitos = new ArrayList<Remito>();
		
	public Pedido() {
		setEstado(new Abierto());
	}
		
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public EstadoPedidoItf getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoPedidoItf estado) {
		this.estado = estado;
	}
	
	public void agregarArticulo(Articulo a) throws NoIngresoArticuloException {
		estado.agregarArticulo(this, a);
	}
	
	public void agregarRemito(Remito r) throws NoIngresoRemitoException {
		estado.agregarRemito(this, r);
	}
	
	public void reAbrir() throws NoReabrirException {
		estado.reAbrir(this);
	}
	
	public void agregarNuevoArticulo(Articulo a) {
		articulos.add(a);
	}
	
	public void agregarNuevoRemito(Remito r) {
		remitos.add(r);
	}
		
}
