package ar.edu.unnoba.poo.solid.srp.problema;

import java.util.Vector;

public class GestorFigura {

	private Vector<Figura> figuras = new Vector<Figura>();
	
	public void addFigura(Figura f) {
		figuras.add(f);
	}
	
	public double area() {
		double t = 0;
		
		for (Figura f :figuras) 
			t+=f.area();
		
		return t;
	}
	
	/*Que pasa si quierop mostrar el area en diferentes formatos de salida?**/
	public void mostrarAreaComoCadena() {
		System.out.println("Area total: " + area());
	}
	
	public void mostrarAreaComoJson() {
	}
	
	public void mostrarAreaComoXml() {
	}

}
