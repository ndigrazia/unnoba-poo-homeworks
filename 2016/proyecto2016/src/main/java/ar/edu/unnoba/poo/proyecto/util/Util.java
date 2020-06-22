package ar.edu.unnoba.poo.proyecto.util;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class Util {

	public static FacesContext getContext() {
		return FacesContext.getCurrentInstance();
	}
				
	public static HttpSession getSession() {
		return (HttpSession) getContext().getExternalContext().getSession(false);
	}

	public static void addAttributeToSession(String a, String v) {
		HttpSession session = Util.getSession();
	    session.setAttribute(a, v);
	}
	
	public static Object getAttributeFromSession(String a) {
		HttpSession session = Util.getSession();
	    return session.getAttribute(a); 
	}
	
}
