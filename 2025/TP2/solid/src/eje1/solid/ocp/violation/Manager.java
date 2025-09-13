package eje1.solid.ocp.violation;

import java.util.Vector;

public class Manager {

	private Vector<Figure> figures = new Vector<Figure>();
	
	public void addFigure(Figure f) {
		figures.add(f);
	}
	
	public double area() {
		double t = 0;
		
		/*�Que pasa si se quiere agregar mas figuras*/
		for (Figure f :figures) { 
			if(f instanceof Circle) {
				t += Math.PI * Math.pow(((Circle)f).getRadio(), 2);
			}
			if (f instanceof Square) {
				t += Math.PI * Math.pow(((Square)f).getSide(), 2);
			}
		}
		
		return t;
	}
	
}
