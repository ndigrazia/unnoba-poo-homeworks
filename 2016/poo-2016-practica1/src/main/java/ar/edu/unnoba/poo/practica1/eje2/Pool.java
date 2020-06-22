package ar.edu.unnoba.poo.practica1.eje2;

import java.util.Stack;

public class Pool {

	public static final int CANTIDAD = 10;
	
	private Stack<Impresora> impresoras = new Stack<Impresora>();
	
	private static Pool instancia = null;
	
	private Pool() {
		agregarImpresorasAlPool();
	}
	
	private void agregarImpresorasAlPool() {
		for(int x=0; x<CANTIDAD; x++) {
			impresoras.push(new Impresora(String.valueOf(x)));
		}
	}
	
	public static Pool getInstancia() {
		if(instancia == null)
			instancia = new Pool();

		return instancia;
	}
	
	public synchronized int tamano() {
		return impresoras.size();
	}
	
	public synchronized Impresora obtenerImpresora() throws Exception {
		 if(!impresoras.isEmpty())
			 return impresoras.pop();
		 
		throw new Exception("No tengo mas impresoras en el pool.");
	}
	 
	 public synchronized void liberarImpresora(Impresora impresora)  {
		 impresoras.add(impresora);
	 }

	 public static void main(String[] args) {
		Pool pool = Pool.getInstancia();
		
		try {
			Impresora p1 = pool.obtenerImpresora();
			System.out.println(p1);
			pool.liberarImpresora(p1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
