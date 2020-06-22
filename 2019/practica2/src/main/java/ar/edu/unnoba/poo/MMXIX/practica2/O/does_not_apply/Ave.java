package ar.edu.unnoba.poo.MMXIX.practica2.O.does_not_apply;

public class Ave {

    private Pico pico;
    private String tipo;
    
    public Ave(Pico pico, String tipo) {
		super();
		this.pico = pico;
		this.tipo = tipo;
	}
	
    public Pico getPico() {
		return pico;
	}
    
	public void setPico(Pico pico) {
		this.pico = pico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
