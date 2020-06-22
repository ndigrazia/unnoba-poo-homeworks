package ar.edu.unnoba.poo.proyecto.bean;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import ar.edu.unnoba.poo.proyecto.servicio.UsuarioServicioItf;
import ar.edu.unnoba.poo.proyecto.util.Util;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	
	@ManagedProperty(value="#{UsuarioBean}")
	private UsuarioServicioItf servicio; 
	
	private boolean loggedIn;
	
	private String name;
	private String password;
	
	public LoginBean() {
		loggedIn = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validate() {
		if (!servicio.validarUsuario(name, password)){
			ResourceBundle rb = ResourceBundle.getBundle("resources.Bundle");
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL,"",rb.getString("noValidateUser"));
			Util.getContext().addMessage("", message);
			return null;
		}
		
		loggedIn = true;
		
		return MenuVistaBean.INICIO;//"/vistas/inicio?faces-redirect=true";
	}
	
	public String logout() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>logout()");
		
		loggedIn = false;
		
		name = "";
		password = "";
		
		return MenuVistaBean.SALIR;//"/vistas/salir?faces-redirect=true";
	}
	
	public boolean isLoggedIn() {
        return loggedIn;
    }
 
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    public UsuarioServicioItf getServicio() {
		return servicio;
	}

	public void setServicio(UsuarioServicioItf servicio) {
		this.servicio = servicio;
	}
 
}
