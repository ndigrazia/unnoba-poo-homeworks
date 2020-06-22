package ar.edu.unnoba.poo.practica3.bean;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ar.edu.unnoba.poo.practica3.Usuario;
import ar.edu.unnoba.poo.practica3.util.Util;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	
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
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>login()");
		
		if (!Usuario.login(name, password)) {
			ResourceBundle rb = ResourceBundle.getBundle("resources.Bundle");
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL,"",rb.getString("noValidateUser"));
			Util.getContext().addMessage("", message);
			return null;
		}
		
		loggedIn = true;
		
		return "/vistas/inicio?faces-redirect=true";
	}
	
	public String logout() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>logout()");
		
		loggedIn = false;
		
		name = "";
		password = "";
		
		return "/vistas/salir?faces-redirect=true";
	}
	
	public boolean isLoggedIn() {
        return loggedIn;
    }
 
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
 
}
