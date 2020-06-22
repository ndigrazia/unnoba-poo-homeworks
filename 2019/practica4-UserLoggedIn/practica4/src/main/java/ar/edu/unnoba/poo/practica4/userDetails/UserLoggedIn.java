package ar.edu.unnoba.poo.practica4.userDetails;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UserLoggedIn extends User {

	private ar.edu.unnoba.poo.practica4.entities.User user;
	
	public UserLoggedIn(String username, String password, Collection<? extends GrantedAuthority> authorities, ar.edu.unnoba.poo.practica4.entities.User user) {
		super(username, password, authorities);
		this.user = user;
	}

	public ar.edu.unnoba.poo.practica4.entities.User getUser() {
		return user;
	}

	public void setUser(ar.edu.unnoba.poo.practica4.entities.User user) {
		this.user = user;
	}
}