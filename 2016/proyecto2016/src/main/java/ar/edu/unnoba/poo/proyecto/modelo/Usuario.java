package ar.edu.unnoba.poo.proyecto.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USUARIO database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u"),
@NamedQuery(name="Usuario.findNombre", query="SELECT u FROM Usuario u where u.nombre = :id")
})
public class Usuario implements Serializable {
	
	@Id
	private String nombre;
	private String clave;
	
	@Version
	protected int version;

	public Usuario() {
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean validarClave(String c) {
		return clave.equalsIgnoreCase(c);
	}

}