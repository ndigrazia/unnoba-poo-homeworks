package ar.edu.unnoba.poo.practica1.eje1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ar.edu.unnoba.poo.practica1.eje1.Articulo;
import ar.edu.unnoba.poo.practica1.eje1.Cerrado;
import ar.edu.unnoba.poo.practica1.eje1.Entregado;
import ar.edu.unnoba.poo.practica1.eje1.Pedido;
import ar.edu.unnoba.poo.practica1.eje1.Remito;

public class PedidoTest {
	private Pedido pedido;
	private Remito remito;
	private Articulo articulo;
	private Cerrado cerrado;
	private Entregado entregado;
	
	@Before
	public void ejecutarAntesDeCadaTest() {
		System.out.println("@Before: ejecutarAntesDeCadaTest");

		pedido = new Pedido();
		remito = new Remito();
		articulo = new Articulo();
		cerrado = new Cerrado();
		entregado = new Entregado();
	}
	 	 
	@Test
	public void testAgregarArticuloEstadoAbierto() {
		System.out.println("@Test: testAgregarArticuloEstadoAbierto");
		assertTrue(pedido.agregarArticulo(articulo));
	}
	
	@Test
	public void testAgregarArticuloEstadoCerrado() {
		System.out.println("@Test: testAgregarArticuloEstadoCerrado");
		pedido.setEstado(cerrado);
		assertFalse(pedido.agregarArticulo(articulo));
	}
	
	@Test
	public void testAgregarArticuloEstadoEntregado() {
		System.out.println("@Test: testAgregarArticuloEstadoEntregado");
		pedido.setEstado(entregado);
		assertFalse(pedido.agregarArticulo(articulo));
	}
	
	@Test
	public void testAgregarRemitoEstadoAbierto() {
		System.out.println("@Test: testAgregarRemitoEstadoAbierto");
		assertFalse(pedido.agregarRemito(remito));
	}
	
	@Test
	public void testAgregarRemitoEstadoCerrado() {
		System.out.println("@Test: testAgregarRemitoEstadoCerrado");
		pedido.setEstado(cerrado);
		assertTrue(pedido.agregarRemito(remito));
	}
	
	@Test
	public void testAgregarRemitoEstadoEntregado() {
		System.out.println("@Test: testAgregarRemitoEstadoEntregado");
		pedido.setEstado(entregado);
		assertFalse(pedido.agregarRemito(remito));
	}
	
	@Test
	public void testReabrirRemitoEnEstadoAbierto() {
		System.out.println("@Test: testReabrirRemitoEnEstadoAbierto");
		assertFalse(pedido.reAbrir());
	}
	
	@Test
	public void testReabrirRemitoEnEstadoCerrado() {
		System.out.println("@Test: testReabrirRemitoEnEstadoCerrado");
		pedido.setEstado(cerrado);
		assertTrue(pedido.reAbrir());
	}
	
	@Test
	public void testReabrirRemitoEnEstadoEntregado() {
		System.out.println("@Test: testReabrirRemitoEnEstadoEntregado");
		pedido.setEstado(entregado);
		assertFalse(pedido.reAbrir());
	}
	
	@After
	public void ejecutarDespuesDeCadaTest() {
		System.out.println("@After: ejecutarDespuesDeCadaTest");
		
		pedido = null;
		remito = null;
		articulo = null;
		cerrado = null;
		entregado = null;
	}
	 	 
}
