package ar.edu.unnoba.poo.MMXIX.practica2.doble_dispatching;

public class Visitor1 implements Visitor {

	public void visit(ConcreteElementA a) {
		a.operation1();
	}

	public void visit(ConcreteElementB b) {
		b.operation();
	}

}
