package ar.edu.unnoba.poo.practica1.eje4;

public class Venta {

	private FormaPago formaPago;

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}
	
	public void cobrar() {
		formaPago.pagar(calcularPrecioaPagar());
	}

	private float calcularPrecioaPagar() {
		return 0;
	}
	
}
