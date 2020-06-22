package ar.edu.unnoba.poo.MMXIX.practica2.eje1;

public class Venta implements Element {

	private float importe;
	private Visitor visitor;
	
	public Venta(float importe) {
		this.importe = importe;
	}

	public void accept(Visitor v) {
		v.visit(this);
		visitor = v;
	}
	
	public void pagarCredito(String nombreTarjeta, String numero, String digitos) {
		Tarjeta.cobrar(nombreTarjeta, numero, digitos, importe);		
	}

	public void pagarInternet(String usuario) {
		PayPal.cobrar(usuario, importe);		
	}
	
	public void pagarTransferencia(String cbuorigen) {
		Banco.transferir(cbuorigen, importe);
	}
	
	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public void pagar() {
		visitor.execute();
	}
	
}
