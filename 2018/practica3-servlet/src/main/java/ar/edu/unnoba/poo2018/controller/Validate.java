package ar.edu.unnoba.poo2018.controller;

public class Validate {

	private static final String USER = "poo2018@unnoba.edu.ar";
	private static final String PASS = "poo2018@unnoba.edu.ar";
	
	public static boolean checkUser(String email,String pass) {
		return email.equals(USER) && pass.equals(PASS);
	}
}
