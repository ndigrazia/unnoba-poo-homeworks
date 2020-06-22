package ar.edu.unnoba.poo.proyecto.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import ar.edu.unnoba.poo.proyecto.modelo.Proyecto;
import ar.edu.unnoba.poo.proyecto.servicio.ProyectoServicioItf;

@ManagedBean(name="listadoProyectosBean")
@ViewScoped//@RequestScoped
public class ListadoProyectosBean {
	
	@ManagedProperty(value="#{ProyectoBean}")
	private ProyectoServicioItf servicio; 
	
	private List<Proyecto> proyectos;
		
	@PostConstruct
	public void cargarProyectos() {		
		proyectos = servicio.obtenerProyectos();
	}

	public List<Proyecto> getProyectos() {
		return this.proyectos;	
	}
	
	public ProyectoServicioItf getServicio() {
		return servicio;
	}

	public void setServicio(ProyectoServicioItf servicio) {
		this.servicio = servicio;
	}
}
