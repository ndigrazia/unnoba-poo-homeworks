package ar.edu.unnoba.poo.practica3.modelo;

import java.util.Date;

public class Proyecto {

  private long nro;
  private String descripcion;
  private Date fechaInicio;
  private Date fechaTerminacion;
  private int horasCoordinacion;
  
  public Proyecto() {
  }

  public long getNro() {
	  return nro;
  }

  public void setNro(long nro) {
	  this.nro = nro;
  }

  public String getDescripcion() {
	  return descripcion;
  }
	
  public void setDescripcion(String desc) {
	  this.descripcion = desc;
  }
	
  public Date getFechaInicio() {
	  return fechaInicio;
  }
	
  public void setFechaInicio(Date fechaInicio) {
	  this.fechaInicio = fechaInicio;
  }
	
  public Date getFechaTerminacion() {
	  return fechaTerminacion;
  }
	
  public void setFechaTerminacion(Date fechaTerminacion) {
	  this.fechaTerminacion = fechaTerminacion;
  }
	
  public int getHorasCoordinacion() {
	  return horasCoordinacion;
  }
	
  public void setHorasCoordinacion(int horasCoordinacion) {
	  this.horasCoordinacion = horasCoordinacion;
  }
	
}