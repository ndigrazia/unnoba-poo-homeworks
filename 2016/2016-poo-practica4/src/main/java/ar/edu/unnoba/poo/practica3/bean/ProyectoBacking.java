package ar.edu.unnoba.poo.practica3.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import ar.edu.unnoba.poo.practica3.model.Proyecto;

@ManagedBean(name="viewProyecto")
@ViewScoped
public class ProyectoBacking {

	@ManagedProperty(value="#{data}")
	private DataSource servicio;
	
	public List<Proyecto> listadoProyectos() {
		return servicio.listadoProyectos();
	}
	
	public void addProyecto(Proyecto p) {
		servicio.addProyecto(p);
	}

	public DataSource getServicio() {
		return servicio;
	}

	public void setServicio(DataSource servicio) {
		this.servicio = servicio;
	}

}
