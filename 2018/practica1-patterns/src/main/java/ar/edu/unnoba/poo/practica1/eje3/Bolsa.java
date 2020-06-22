package ar.edu.unnoba.poo.practica1.eje3;

import java.util.ArrayList;
import java.util.List;

public class Bolsa implements Componente {

	private static final double PROCENTAJE = 0.10; 
	
	private List<Componente> componentes = new ArrayList<Componente>();
	
	public double precio() {
		double p = 0;
		
		for(Componente c : componentes)
			p+=c.precio();
		
		return p - (p * PROCENTAJE);
	}

	public void addComponente(Componente c) {
		componentes.add(c);
	}
	
}
