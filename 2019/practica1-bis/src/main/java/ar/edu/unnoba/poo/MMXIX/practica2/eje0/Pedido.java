package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.edu.unnoba.poo.MMXIX.practica2.eje0.Element;

public abstract class Pedido implements Element {

	private Visitor visitor;
	
	private int numero;
	private Date fechaEntrega;
	private String cliente;
	
	protected List<Articulo> articulos = new ArrayList<Articulo>(); 
	protected List<Remito> remitos = new ArrayList<Remito>();
		
	public Pedido() {
	}
	
	public void accept(Visitor v) {
		visitor = v;
	}
	
	protected Visitor getVisitor() {
		return visitor;
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

	public int cantidadArticulos() {
		return articulos.size();
	}
	
	public abstract void agregarArticulo(Articulo a);
	
	public abstract void agregarRemito(Remito r);

}
