package eje1.solid.lsp.follow;

public class Rectangle implements Figure {
	
	private double base;
	private double height;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

	public double area() {
		return base * height;
	}

}
