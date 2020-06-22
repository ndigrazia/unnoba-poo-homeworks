package ar.edu.unnoba.poo.proyecto.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import ar.edu.unnoba.poo.proyecto.modelo.Proyecto;
import ar.edu.unnoba.poo.proyecto.servicio.ProyectoServicioItf;

@ManagedBean(name="proyectoBean")
@ViewScoped
public class ProyectoBean {
	
	private long nro;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaTerminacion;
	private int horasCoordinacion;
	
	private Object seleccionado;
	
	@ManagedProperty(value="#{ProyectoBean}")
	private ProyectoServicioItf servicio; 
	
	public long getNro() {
		return nro;
	}
	public void setNro(long nro) {
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
		
		Proyecto p = new Proyecto();
		
		p.setDescripcion(descripcion);
		p.setFechaInicio(fechaInicio);
		p.setFechaTerminacion(fechaTerminacion);
		p.setHorasCoordinacion(horasCoordinacion);
		
		servicio.grabar(p);
		
		return MenuVistaBean.INICIO;//"/vistas/inicio?faces-redirect=true";
	}
	
	public Object getSeleccionado() {
		return seleccionado;
	}
	
	public void setSeleccionado(Object seleccionado) {
		System.out.println("CARGAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + seleccionado);
		this.seleccionado = seleccionado;
		cargar(Long.valueOf((String) seleccionado));
	}
	
	public void cargar(long id) {
		Proyecto p = servicio.buscarProyectoPorId(id);
		
		nro = id;
		descripcion = p.getDescripcion();
		fechaInicio = p.getFechaInicio();
		fechaTerminacion = p.getFechaTerminacion();
		horasCoordinacion = p.getHorasCoordinacion();	
	}
	
	public ProyectoServicioItf getServicio() {
		return servicio;
	}

	public void setServicio(ProyectoServicioItf servicio) {
		this.servicio = servicio;
	}
	
	public String borrar() {
		System.out.println("BORRAR>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + nro);
		servicio.borrar(nro);
		return MenuVistaBean.INICIO;
	}
}
