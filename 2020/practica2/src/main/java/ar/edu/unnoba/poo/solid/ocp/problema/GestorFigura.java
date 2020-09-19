package ar.edu.unnoba.poo.solid.ocp.problema;

import java.util.Vector;

public class GestorFigura {

	private Vector<Figura> figuras = new Vector<Figura>();
	
	public void addFigura(Figura f) {
		figuras.add(f);
	}
	
	public double area() {
		double t = 0;
		
		/*¨Que pasa si se quiere agregar mas figuras*/
		for (Figura f :figuras) { 
			if(f instanceof Circulo) {
				t += Math.PI * Math.pow(((Circulo)f).getRadio(), 2);
			}
			if (f instanceof Cuadrado) {
				t += Math.PI * Math.pow(((Cuadrado)f).getLado(), 2);
			}
		}
		
		return t;
	}
	
}
