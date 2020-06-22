package ar.edu.unnoba.poo.MMXIX.practica2.eje1;

public abstract class Visitor {

	private Element element;
	
	public Visitor() {
	}
	
	public void visit(Element e) {
		this.element = e;
	}
	
	public Element getElement() {
		return element;
	}
	
	public abstract void execute();

}
