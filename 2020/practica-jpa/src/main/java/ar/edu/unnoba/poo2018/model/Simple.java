package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Actividades_Simples")
@PrimaryKeyJoinColumn(referencedColumnName="nro")
public class Simple extends Actividad {
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "actividad")
	private List<Impacto> impactos = new ArrayList<Impacto>();

	public void addObjetivo(int peso, Objetivo objetivo) {
		impactos.add(new Impacto(peso, objetivo));
	}

	public List<Impacto> getImpactos() {
		return impactos;
	}

	public void setImpactos(List<Impacto> impactos) {
		this.impactos = impactos;
	}

	@Override
	public String toString() {
		return "Simple: "+ getNombre() +" [impactos=" + impactos + "]";
	}
	
}
