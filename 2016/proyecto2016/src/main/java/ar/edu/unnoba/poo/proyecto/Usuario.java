package ar.edu.unnoba.poo.proyecto;

public class Usuario {

	private final static String ADMIN_USER = "admin";
	private final static String ADMIN_PASS = "poo";
	
	public static final boolean login(String user, String pass) {
		return user.equalsIgnoreCase(ADMIN_USER) &&
				pass.equalsIgnoreCase(ADMIN_PASS);
	}

}
