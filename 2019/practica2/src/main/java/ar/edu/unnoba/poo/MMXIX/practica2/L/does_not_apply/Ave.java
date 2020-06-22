package ar.edu.unnoba.poo.MMXIX.practica2.L.does_not_apply;

public abstract class Ave {

    private Pico pico;
    
    public Ave(Pico pico) {
		this.pico = pico;
	}
	
    public Pico getPico() {
		return pico;
	}
    
	public void setPico(Pico pico) {
		this.pico = pico;
	}

	public abstract Comida getTipoComida();
	
	
}
