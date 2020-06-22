package ar.edu.unnoba.poo.MMXIX.practica2.doble_dispatching;

public class ConcreteElementB implements Element {

	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void operation() {
		System.out.println("ConcreteElementB.operation()");
	}
}
