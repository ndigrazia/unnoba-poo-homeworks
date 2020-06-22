package ar.edu.unnoba.poo.practica1.eje4;

public class Internet implements FormaPago {

	private String usuario;
	
	public Internet(String usuario) {
		this.usuario = usuario;
	}

	public void pagar(float importe) {
		PayPal.cobrar(usuario,importe);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
