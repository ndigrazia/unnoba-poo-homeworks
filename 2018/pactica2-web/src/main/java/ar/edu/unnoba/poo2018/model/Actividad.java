package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Actividad {
	
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String resolucion;
	private String expediente;
	private Convocatoria convocatoria;
	private LineaEstrategica linea;
	private Ambito ambito;
	
	private List<Usuario> responsables = new ArrayList<Usuario>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	
	public Convocatoria getConvocatoria() {
		return convocatoria;
	}
	public void setConvocatoria(Convocatoria convocatoria) {
		this.convocatoria = convocatoria;
	}
	
	public LineaEstrategica getLinea() {
		return linea;
	}
	public void setLinea(LineaEstrategica linea) {
		this.linea = linea;
	}
	
	public Ambito getAmbito() {
		return ambito;
	}
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
	public void addUsuario(Usuario u) {
		responsables.add(u);
	}
	public void removeUsuario(Usuario u) {
		responsables.remove(u);
	}
	
	public abstract List<Impacto> getImpactos();
	 
}
