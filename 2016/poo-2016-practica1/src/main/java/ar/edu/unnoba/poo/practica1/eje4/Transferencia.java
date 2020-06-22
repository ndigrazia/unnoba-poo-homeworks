package ar.edu.unnoba.poo.practica1.eje4;

public class Transferencia implements FormaPago {
	
	private String cbuorigen;
	
	public Transferencia(String cbuorigen) {
		super();
		this.cbuorigen = cbuorigen;
	}

	public void pagar(float importe) {
		Banco.transferir(cbuorigen, importe);		
	}

	public String getCbuorigen() {
		return cbuorigen;
	}

	public void setCbuorigen(String cbuorigen) {
		this.cbuorigen = cbuorigen;
	}

}
