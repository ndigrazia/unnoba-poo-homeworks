package ar.edu.unnoba.poo.MMXIX.practica2.eje1;

public class Client {

	public Client() {
	}
	
	public static void main(String[] args) {
		Venta v = new Venta(320.00f);
		v.accept(new Transferencia("1234567890"));
		v.pagar();
	}
	
}
