package eje1.solid.ocp.follow;

import java.util.Vector;

public class Manager {

	private Vector<Figure> figures = new Vector<Figure>();
	
	public void addFigura(Figure f) {
		figures.add(f);
	}
	
	public double area() {
		double t = 0;
		
		for (Figure f :figures) 
			t+=f.area();
		
		return t;
	}

}
