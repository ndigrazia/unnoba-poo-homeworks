package ar.edu.unnoba.poo.practica3.bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//import org.primefaces.event.SelectEvent;

import ar.edu.unnoba.poo.practica3.modelo.Proyecto;

@ManagedBean(name="listadoProyectosBean")
@ViewScoped//@RequestScoped
public class ListadoProyectosBean {
	
	private List<Proyecto> proyectos;
	
	//private Proyecto proyectoSeleccionado;
		
	public void cargarProyectos() {
		proyectos = new ArrayList<Proyecto>();
		
		Calendar c = GregorianCalendar.getInstance();
		
		Proyecto p = new Proyecto();
		p.setNro(1);
		p.setDescripcion("Desc-1");
		p.setFechaInicio(c.getTime());
		p.setFechaTerminacion(c.getTime());
		p.setHorasCoordinacion(10);
		proyectos.add(p);
		
		p = new Proyecto();
		p.setNro(2);
		p.setDescripcion("Desc-2");
		p.setFechaInicio(c.getTime());
		p.setFechaTerminacion(c.getTime());
		p.setHorasCoordinacion(12);
		proyectos.add(p);
		
		p = new Proyecto();
		p.setNro(3);
		p.setDescripcion("Desc-3");
		p.setFechaInicio(c.getTime());
		p.setFechaTerminacion(c.getTime());
		p.setHorasCoordinacion(13);
		proyectos.add(p);
	}

	public List<Proyecto> getProyectos() {
		if (this.proyectos == null) {
			this.cargarProyectos();
		}
		
		return this.proyectos;	
	}

	/*public Proyecto getProyectoSeleccionado() {
		return proyectoSeleccionado;
	}

	public void setProyectoSeleccionado(Proyecto proyectoSeleccionado) {
		if(proyectoSeleccionado!=null)
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< " + proyectoSeleccionado.getNro());
		else 
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< proyectoSeleccionado es nulo.");
		this.proyectoSeleccionado = proyectoSeleccionado;
	}

	public void registroSeleccionado(SelectEvent event) {
		 setProyectoSeleccionado((Proyecto) event.getObject());
	}*/
	
}
