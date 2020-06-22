package ar.edu.unnoba.poo.MMXIX.practica2.eje1;

public class Internet extends Visitor {

	private String usuario;
	
	public Internet(String usuario) {
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public void execute() {
		((Venta) getElement()).pagarInternet(usuario);
	}
	
}
