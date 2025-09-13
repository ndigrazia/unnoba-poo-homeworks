package eje1.solid.lsp.follow;

public class Main {

	public double calculateArea(Rectangle r) {
		return r.area();
	}
	
	 public static void main(String[] args) {
		 Main m = new Main();
		 
		 Rectangle r1 = new Rectangle();
		 r1.setBase(3);
		 r1.setheight(4);
		 
		 System.out.println("Rectangle (" + 
				 r1.getheight() + ", " +
				 r1.getBase() +") - test : "+ (m.calculateArea(r1)==12));
		 
		 Square r2 = new Square();
		 r2.setSide(3);
		 
		 //No puede ser invocada la opearacion calculateArea porque Cuadrado no es un Rectangulo
		 //m.calculateArea(r2);
	 }
}
