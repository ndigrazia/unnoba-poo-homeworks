package ar.edu.unnoba.poo.proyecto.servicio;

import java.util.List;

import ar.edu.unnoba.poo.proyecto.modelo.Proyecto;

public interface ProyectoServicioItf {

	public void grabar(Proyecto entity);
	
	public Proyecto buscarProyectoPorId(long id);
	
	public List<Proyecto> obtenerProyectos();
	
	public void borrar(long id);
	
}
