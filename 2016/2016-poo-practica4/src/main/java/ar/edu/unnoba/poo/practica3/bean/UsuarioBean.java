package ar.edu.unnoba.poo.practica3.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="servicio")
@SessionScoped
public class UsuarioBean {
	
	public boolean validarUsuario(String nombre, String clave) {
		return nombre.equalsIgnoreCase("admin") && clave.equalsIgnoreCase("poo");
	}

}
