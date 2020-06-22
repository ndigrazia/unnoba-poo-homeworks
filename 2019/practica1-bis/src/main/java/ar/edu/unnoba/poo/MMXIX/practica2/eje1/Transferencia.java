package ar.edu.unnoba.poo.MMXIX.practica2.eje1;

public class Transferencia extends Visitor {
	
	private String cbuorigen;
	
	public Transferencia(String cbuorigen) {
		super();
		this.cbuorigen = cbuorigen;
	}

	public String getCbuorigen() {
		return cbuorigen;
	}

	public void setCbuorigen(String cbuorigen) {
		this.cbuorigen = cbuorigen;
	}

	public void visit(Venta b) {
		b.pagarTransferencia(cbuorigen);
	}

	@Override
	public void execute() {
		((Venta) getElement()).pagarTransferencia(cbuorigen);
	}
	
}
