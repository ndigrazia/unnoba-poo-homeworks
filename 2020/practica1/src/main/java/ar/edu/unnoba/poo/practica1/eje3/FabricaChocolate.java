package ar.edu.unnoba.poo.practica1.eje3;

public class FabricaChocolate {

	public static void main(String[] args) {
		Caja c1 = new Caja(12.0);
		Caja c2 = new Caja(2.0);
		Caja c3 = new Caja(30.0);
		
		Bolsa b = new Bolsa();
		b.addComponente(c1);
		b.addComponente(c2);
		
		System.out.println(c3.precio());
		System.out.println(b.precio());
	}
}
