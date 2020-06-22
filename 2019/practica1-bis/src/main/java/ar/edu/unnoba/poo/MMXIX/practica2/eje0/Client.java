package ar.edu.unnoba.poo.MMXIX.practica2.eje0;

import java.sql.Date;
import java.time.LocalDate;

public class Client {

	public Client() {
	}
	
	public static void main(String[] args) {
		PedidoStock p = new PedidoStock();
		p.setCliente("Cliente");
		p.setNumero(123);
		p.setFechaEntrega(Date.valueOf(LocalDate.now()));
		
		p.accept(new Abierto());
		
		p.agregarArticulo(new Articulo());
		
		System.out.println(p.cantidadArticulos());
	}
	
}
