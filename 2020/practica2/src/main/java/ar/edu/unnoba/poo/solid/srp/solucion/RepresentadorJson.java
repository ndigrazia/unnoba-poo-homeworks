package ar.edu.unnoba.poo.solid.srp.solucion;

public class RepresentadorJson implements Represetador {

	public void mostarArea(GestorFigura gf) {
		System.out.println("{\"area\":" + gf.area() +"}" );
	}

}
