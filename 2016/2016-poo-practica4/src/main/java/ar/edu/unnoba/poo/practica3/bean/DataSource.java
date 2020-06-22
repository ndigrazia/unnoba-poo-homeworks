package ar.edu.unnoba.poo.practica3.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import ar.edu.unnoba.poo.practica3.model.Proyecto;

@ManagedBean(name="data")
@ApplicationScoped
public class DataSource {
	
	private List<Proyecto> proyectos = new ArrayList<Proyecto>();

	@PostConstruct
	public void iniciar() {
		proyectos.add(new Proyecto("1"));
		proyectos.add(new Proyecto("2"));
		proyectos.add(new Proyecto("3"));
		proyectos.add(new Proyecto("4"));
		proyectos.add(new Proyecto("5"));
	}
	
	public List<Proyecto> listadoProyectos() {
		return proyectos;
	}
	
	public void addProyecto(Proyecto p) {
		proyectos.add(p);
	}
	
}
