package ar.edu.unnoba.poo.practica3.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="proyectoBean")
@RequestScoped
public class ProyectoBean {
	
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
	
	public String crear() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< crear()");
		return "/vistas/inicio?faces-redirect=true";
	}
	
	private Object seleccionado;
	
	public Object getSeleccionado() {
		return seleccionado;
	}
	public void setSeleccionado(Object seleccionado) {
		System.out.println("CARGAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + seleccionado);
		this.seleccionado = seleccionado;
		nro = (String) seleccionado;
	}
	public void cargar(Object o) {
		/*nro = String.valueOf(seleccionado.getNro());
		descripcion = seleccionado.getDescripcion();
		fechaInicio = seleccionado.getFechaInicio();
		fechaTerminacion = seleccionado.getFechaTerminacion();
		horasCoordinacion = seleccionado.getHorasCoordinacion();*/	
	}
}
