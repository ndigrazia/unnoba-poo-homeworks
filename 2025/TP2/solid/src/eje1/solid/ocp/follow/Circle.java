package eje1.solid.ocp.follow;

public class Circle implements Figure {

	private double radio;

	public Circle(double radio) {
		super();
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
}
