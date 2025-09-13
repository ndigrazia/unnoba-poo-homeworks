package eje1.solid.ocp.follow;

public class Square implements Figure {
	
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}

	public double area() {
		return Math.pow(side, 2);
	}

}
