package ar.edu.unnoba.poo.practica3.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="detalleProyectoBean")
@RequestScoped
public class DetalleProyectoBean {
	
	private String nro;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaTerminacion;
	private int horasCoordinacion;
	
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTerminacion() {
		return fechaTerminacion;
	}
	public void setFechaTerminacion(Date fechaTerminacion) {
		this.fechaTerminacion = fechaTerminacion;
	}
	public int getHorasCoordinacion() {
		return horasCoordinacion;
	}
	public void setHorasCoordinacion(int horasCoordinacion) {
		this.horasCoordinacion = horasCoordinacion;
	}
	
	public String cerrar() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< crear()");
		return "/vistas/inicio?faces-redirect=true";
	}
	
}
