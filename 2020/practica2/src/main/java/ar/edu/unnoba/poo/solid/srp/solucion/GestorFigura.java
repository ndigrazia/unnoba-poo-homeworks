package ar.edu.unnoba.poo.solid.srp.solucion;

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
	
	
}
