package ar.edu.unnoba.poo.solid.lsp.problema;

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
		 r2.setBase(3);
		 r2.setAltura(4);
		
		 System.out.println("Rectangulo (" + 
				 r2.getAltura() + ", " +
				 r2.getBase() +") - test : "+ (m.calculateArea(r2)==12));
		
		 m.calculateArea(r2);
	 }
}
