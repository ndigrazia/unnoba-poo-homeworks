package ar.edu.unnoba.poo.MMXIX.practica2.eje1;

public class Credito extends Visitor {

	private String nombreTarjeta;
	private String numero;
	private String digitos;
	
	public Credito(String nombreTarjeta, String numero, String digitos, float importe) {
		super();
		this.nombreTarjeta = nombreTarjeta;
		this.numero = numero;
		this.digitos = digitos;
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
	
	@Override
	public void execute() {
		((Venta) getElement()).pagarCredito(nombreTarjeta, numero, digitos);
	}

}
