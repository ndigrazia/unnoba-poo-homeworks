package ar.edu.unnoba.poo.MMXIX.practica2.doble_dispatching;

public class ConcreteElementA implements Element {

	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void operation1() {
		System.out.println("V1 - ConcreteElementA.operation()");
	}

	public void operation2() {
		System.out.println("V2 - ConcreteElementA.operation()");
	}
}
