package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.List;

public class Simple extends Actividad {
	
	private List<Impacto> impactos = new ArrayList<Impacto>();

	public void addObjetivo(int peso, Objetivo objetivo) {
		impactos.add(new Impacto(peso, objetivo));
	}

	public List<Impacto> getImpactos() {
		return impactos;
	}
}
