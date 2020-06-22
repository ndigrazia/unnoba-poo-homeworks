package ar.edu.unnoba.poo.practica2.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Persona {

    @Id
	private String nroDocumento;
	private String nombreYApellido;
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;

	@Version
	protected int version;
	
	public Persona(){
	}
  
	public Persona(String nroDocumento, String nombreYApellido, Date fechaNacimiento,
	 String direccion, String telefono) {
		this.nroDocumento = nroDocumento;
		this.nombreYApellido = nombreYApellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}