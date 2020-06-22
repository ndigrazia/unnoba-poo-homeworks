package ar.edu.unnoba.poo.practica1.eje4;

public class Credito implements FormaPago {

	private String nombreTarjeta;
	private String numero;
	private String digitos;
	
	public Credito(String nombreTarjeta, String numero, String digitos) {
		super();
		this.nombreTarjeta = nombreTarjeta;
		this.numero = numero;
		this.digitos = digitos;
	}

	public void pagar(float importe) {
		Tarjeta.cobrar(nombreTarjeta, numero, digitos, importe);		
	}

	public String getNombreTarjeta() {
		return nombreTarjeta;
	}

	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDigitos() {
		return digitos;
	}

	public void setDigitos(String digitos) {
		this.digitos = digitos;
	}

}
