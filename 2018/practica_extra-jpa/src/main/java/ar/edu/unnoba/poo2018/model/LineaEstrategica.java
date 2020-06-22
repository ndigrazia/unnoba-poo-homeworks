package ar.edu.unnoba.poo2018.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Lineas")
public class LineaEstrategica {

	@Id
	@SequenceGenerator(name = "ID_LINEA_SEQ", sequenceName="SEQ_LINEA", allocationSize=1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_LINEA_SEQ")
	private long nro;
	
	private String nombre;
	
	@Version
	protected int version;

	public long getNro() {
		return nro;
	}
	public void setNro(long nro) {
		this.nro = nro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "LineaEstrategica [nro=" + nro + ", nombre=" + nombre + "]";
	}
	
}
