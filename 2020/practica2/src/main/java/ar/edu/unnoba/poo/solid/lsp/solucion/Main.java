package ar.edu.unnoba.poo.solid.lsp.solucion;

public class Main {

	public double calculateArea(Rectangulo r) {
		return r.area();
	}
	
	 public static void main(String[] args) {
		 Main m = new Main();
		 
		 Rectangulo r1 = new Rectangulo();
		 r1.setBase(3);
		 r1.setAltura(4);
		 
		 System.out.println("Rectangulo (" + 
				 r1.getAltura() + ", " +
				 r1.getBase() +") - test : "+ (m.calculateArea(r1)==12));
		 
		 Cuadrado r2 = new Cuadrado();
		 r2.setLado(3);
		 
		 //No puede ser invocada la opearacion calculateArea porque Cuadrado no es un Rectangulo
		 //m.calculateArea(r2);
	 }
}
