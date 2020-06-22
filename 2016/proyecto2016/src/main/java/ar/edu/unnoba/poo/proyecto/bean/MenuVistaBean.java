package ar.edu.unnoba.poo.proyecto.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="menuVistaBean")
@SessionScoped
public class MenuVistaBean {

	public static final String INICIO = "/vistas/inicio?faces-redirect=true";
	public static final String SALIR = "/vistas/salir?faces-redirect=true";
	
	
	public String altaProyecto() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< altaProyecto()");
		return "/vistas/altaProyecto?faces-redirect=true";
    }
     
    public String listadoProyectos() {
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< listadoProyectos()");
    	return "/vistas/listadoProyectos?faces-redirect=true";
    }
    
    public String detalleProyecto() {
    	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< detalleProyecto()");
    	return "/vistas/detalleProyecto";
    }
    
}
