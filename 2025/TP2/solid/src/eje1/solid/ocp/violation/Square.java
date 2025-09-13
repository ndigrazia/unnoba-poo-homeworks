package eje1.solid.ocp.violation;

public class Square implements Figure {
	
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}
	public void setsetSide(double side) {
		this.side = side;
	}

}
