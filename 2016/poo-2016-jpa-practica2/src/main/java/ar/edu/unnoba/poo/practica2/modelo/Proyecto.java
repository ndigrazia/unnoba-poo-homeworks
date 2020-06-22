package ar.edu.unnoba.poo.practica2.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
public class Proyecto {

  @Id
  @SequenceGenerator(name = "ID_PROYECTO_SEQ", sequenceName="SEQ_PROYECTO", allocationSize=1, initialValue=1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PROYECTO_SEQ")
  private long nro;
  private String descripcion;
  private Date fechaInicio;
  private Date fechaTerminacion;
  private int horasCoordinacion;
  
  @ManyToOne(fetch=FetchType.LAZY)
  private Responsable controla;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "PROYECTO")
  private List<Fase> fases = new ArrayList<Fase>();
  
  @Version
  protected int version;
  
  public Proyecto() {
  }
  
  public Proyecto(String desc, Date fechaInicio, Date fechaTerminacion, 
		  int horasCoordinacion, Responsable responsable) {
	this.descripcion = desc;
	this.fechaInicio = fechaInicio;
	this.fechaTerminacion = fechaTerminacion;
	this.horasCoordinacion = horasCoordinacion;
	this.controla = responsable;
  }

  public float porcentajeDeAvance() {
	  float t = 0.0f;
	  
	  int top = totalObras();
	  
	  for(Fase f:fases) {
		  float paf=f.porcentajeDeAvance();
		  int tof=f.totalObras();
		  
		  t+=(tof/top) * paf ;
	  }
	  
	  return t * 100;
  }
  
  private int totalObras() {
	int t=0;
	
    for(Fase f:fases) {
    	t+=f.totalObras();
    }
    
    return t;
  }

  public float costo() {
	  float t = 0.0f;
	  
	  for(Fase f:fases)
		  t+=f.costo();
	  
	  return t + (horasCoordinacion) * controla.getValorHora();
  }
  
  public void addFase(Fase f) {
	  fases.add(f);
  }

  public void removeFase(Fase f) {
	  fases.remove(f);
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
	
  public List<Fase> getFases() {
	  return fases;
  }
	
  public void setFases(List<Fase> fases) {
	  this.fases = fases;
  }

  public Responsable getControla() {
	return controla;
  }

  public void setControla(Responsable responsable) {
	this.controla = responsable;
  }
  
}