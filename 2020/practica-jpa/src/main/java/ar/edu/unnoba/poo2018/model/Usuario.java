package ar.edu.unnoba.poo2018.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Usuarios")
@NamedQueries({
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u"),
@NamedQuery(name="Usuario.findNombre", query="SELECT u FROM Usuario u where u.nombre = :id")
})
public class Usuario {

	@Id
	private String nombre;
	private String clave;
	private boolean administrador;
	
	public Usuario() {
	}
	
	public Usuario(String nombre, String clave, boolean administrador) {
		this.nombre = nombre;
		this.clave = clave;
		this.administrador = administrador;
	}

	@Version
	protected int version;
	
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
	
	public boolean isAdministrador() {
		return administrador;
	}
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", clave=" + clave + ", administrador=" + administrador + "]";
	}
	
}
