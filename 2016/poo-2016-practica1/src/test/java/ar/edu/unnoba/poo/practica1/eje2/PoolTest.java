package ar.edu.unnoba.poo.practica1.eje2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class PoolTest {

    private Pool pool;
	private Impresora impresora;
	
	@Before
	public void ejecutarAntesDeCadaTest() {
		System.out.println("@Before: ejecutarAntesDeCadaTest");
		
		pool = Pool.getInstancia();
		impresora = new Impresora("Impresora-1");
		
	}
	
	@Test
	public void testGetInstancia() {
		System.out.println("@Test: testGetInstancia()");
		assertNotNull(pool);
	}

	@Test
	public void testObtenerImpresora() {
		System.out.println("@Test: testObtenerImpresora()");
		try {
			int anterior = pool.tamano();
			pool.liberarImpresora(impresora);
			pool.obtenerImpresora();
			int actual = pool.tamano();
			assertEquals(anterior, actual);
		} catch (Exception e) {
			fail("No se espera que una excepcion sea lanzada.");
		}
	}

	@Test
	public void testObtenerExceptionSinImpresoraEnPool() {
		System.out.println("@Test: testObtenerImpresora()");
		try {
			int actual = pool.tamano();
			
			for(int i=0;i<actual;i++ ) 
				pool.obtenerImpresora();	
			
			pool.obtenerImpresora();
			
			fail("Se espera que una excepcion sea lanzada.");
		} catch (Exception e) {
			assertThat(e.getMessage(), is("No tengo mas impresoras en el pool."));
		}
	}
	
	@Test
	public void testLiberarImpresora() {
		System.out.println("@Test: testLiberarImpresora()");
		int anterior = pool.tamano();
		pool.liberarImpresora(impresora);
		int actual = pool.tamano();
		assertEquals(anterior+1, actual);
	}
	
	@After
	public void ejecutarDespuesDeCadaTest() {
		System.out.println("@After: ejecutarDespuesDeCadaTest");
		
		pool = null;
	}

}
