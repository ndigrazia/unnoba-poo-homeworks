package eje1.solid.lsp.violation;

public class Main {

	public double calculateArea(Rectangle r) {
		return r.area();
	}
	
	 public static void main(String[] args) {
		 Main m = new Main();
		 
		 Rectangle r1 = new Rectangle();
		 r1.setBase(3);
		 r1.setHeight(4);
		 
		 System.out.println("Rectangle (" + 
				 r1.getHeight() + ", " +
				 r1.getBase() +") - test : "+ (m.calculateArea(r1)==12));
		 
		 Square r2 = new Square();
		 r2.setBase(3);
		 r2.setHeight(4);
		
		 System.out.println("Square (" + 
				 r2.getHeight() + ", " +
				 r2.getBase() +") - test : "+ (m.calculateArea(r2)==12));
		
		 m.calculateArea(r2);
	 }
}
