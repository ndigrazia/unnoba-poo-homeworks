package eje1.solid.lsp.follow;

public class Square implements Figure {
	
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double area() {
		return side * side;
	}

}