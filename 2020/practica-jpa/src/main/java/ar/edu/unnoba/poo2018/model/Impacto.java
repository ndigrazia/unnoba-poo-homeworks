package ar.edu.unnoba.poo2018.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Impactos")
public class Impacto {
	
	@Id
	@SequenceGenerator(name = "ID_IMPACTO_SEQ", sequenceName="SEQ_IMPACTO", allocationSize=1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_IMPACTO_SEQ")
	private long nro;
	
	private int peso;
	
	@Version
	protected int version;

	@ManyToOne(fetch=FetchType.LAZY)
	private Objetivo objetivo;

	public Impacto() {
	}
	
	public Impacto(int peso, Objetivo objetivo) {
		this.peso = peso;
		this.objetivo = objetivo;
	}

	public long getNro() {
		return nro;
	}
	public void setNro(long nro) {
		this.nro = nro;
	}

	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	@Override
	public String toString() {
		return "Impacto [nro=" + nro + ", peso=" + peso + ", objetivo=" + objetivo + "]";
	}
	
}
