package ar.edu.unnoba.poo.MMXIX.practica2.doble_dispatching;

public class Visitor2 implements Visitor {

	public void visit(ConcreteElementA a) {
		a.operation2();
	}

	public void visit(ConcreteElementB b) {
		b.operation();
	}

}
