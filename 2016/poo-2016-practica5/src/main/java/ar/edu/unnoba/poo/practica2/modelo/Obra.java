package ar.edu.unnoba.poo.practica2.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class Obra extends GenericoEntity {

  @Id
  @SequenceGenerator(name = "ID_OBRA_SEQ", sequenceName="SEQ_OBRA", allocationSize=1, initialValue=1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_OBRA_SEQ")
  private long nro;
  private String obra;
  @Temporal(TemporalType.DATE)
  private Date fechaTerminacion;
  private int horasTrabajo;
  
  @ManyToOne(fetch=FetchType.LAZY)
  private Responsable realiza;
  
  @Enumerated(EnumType.STRING)
  private TipoEstadoObra tipo;
  
  @Version
  protected int version;
  
  public Obra(){
	  tipo = TipoEstadoObra.PROYECTADA;
  }
  
  public Obra(String obra, Date fechaTerminacion, int horasTrabajo,
		  Responsable realiza) {
	this();
	this.obra = obra;
	this.fechaTerminacion = fechaTerminacion;
	this.horasTrabajo = horasTrabajo;
	this.realiza = realiza;
  }

  public float costo() {
	 return tipo.costo(this);
  }

  public float costoBasico() {
	  return horasTrabajo * realiza.getValorHora();
  }

  public String getObra() {
	  return obra;
  }
	
  public void setObra(String obra) {
	  this.obra = obra;
  }
	
  public boolean isConcluida() {
	return tipo.isConcluida();
  }

  public Date getFechaTerminacion() {
	  return fechaTerminacion;
  }

  public void setFechaTerminacion(Date fechaTerminacion) {
	  this.fechaTerminacion = fechaTerminacion;
  }

  public int getHorasTrabajo() {
	  return horasTrabajo;
  }

  public void setHorasTrabajo(int horasTrabajo) {
	  this.horasTrabajo = horasTrabajo;
  }

  public Responsable getRealiza() {
	  return realiza;
  }

  public void setRealiza(Responsable realiza) {
	  this.realiza = realiza;
  }

  public TipoEstadoObra getTipo() {
	   return tipo;
  }

  public void setTipo(TipoEstadoObra tipo) {
	  this.tipo = tipo;
  }
  
  public void cambiarEstado() {
	 tipo.cambiarEstado(this);
  }

  public long getNro() {
	return nro;
  }

  public void setNro(long nro) {
	this.nro = nro;
  }
   
}