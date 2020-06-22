package ar.edu.unnoba.poo.practica3.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="usuario")
@SessionScoped
public class UsuarioControlBean {
	
	@ManagedProperty(value="#{servicio}")
	private UsuarioBean servicio;
	
	private String nombre;
	private String clave;
	
	public UsuarioControlBean() {
	}

	public String login() {
		if (servicio.validarUsuario(nombre, clave))
			   return "welcome";
		return "nowelcome";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public UsuarioBean getServicio() {
		return servicio;
	}

	public void setServicio(UsuarioBean servicio) {
		this.servicio = servicio;
	}
	
	public String logout() {
		return "index";
	}

}
