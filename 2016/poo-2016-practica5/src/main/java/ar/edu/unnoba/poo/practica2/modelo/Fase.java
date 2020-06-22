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
public class Fase extends GenericoEntity {
  
  @Id
  @SequenceGenerator(name = "ID_FASE_SEQ", sequenceName="SEQ_FASE", allocationSize=1, initialValue=1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_FASE_SEQ")
  private long nro;
  private String descripcion;
  private int horasGestion;
  
  
  
  
  @ManyToOne(fetch=FetchType.LAZY)
  private Responsable dirige;	
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "FASE") 
  private List<Obra> obras = new ArrayList<Obra>();
  
  @Version
  protected int version;
  
  public Fase(){
  }
  
  public Fase(String desc, int horasGestion, Responsable dirige) {
	this.descripcion = desc;
	this.horasGestion = horasGestion;
	this.dirige = dirige;
  }
  
  public float porcentajeDeAvance() {
	  return totalObrasFinalizadas()/totalObras();
  }
  
  public int totalObrasFinalizadas() {
	  int t=0;
	  
	  for(Obra o: obras) {
		  if(o.isConcluida())
			  t++;
	  }
	  
	  return t;
  }
  
  public float costo() {
	  float t = 0.0f;
	  
	  for(Obra o:obras)
		  t+=o.costo();
	  
	  return t + (horasGestion * dirige.getValorHora());
  }

  public String getDescripcion() {
	  return descripcion;
  }
	
  public void setDescripcion(String desc) {
	  this.descripcion = desc;
  }
	
  public long getNro() {
	  return nro;
  }
	
  public void setNro(long nro) {
	  this.nro = nro;
  }
	
  public int getHorasGestion() {
	  return horasGestion;
  }
	
  public void setHorasGestion(int horasGestion) {
	  this.horasGestion = horasGestion;
  }
	
  public Responsable getDirige() {
	  return dirige;
  }
	
  public void setDirige(Responsable dirige) {
	  this.dirige = dirige;
  }
	
  public List<Obra> getObras() {
	  return obras;
  }
	
  public void setObras(List<Obra> obras) {
	  this.obras = obras;
  }
  
  public void addObra(Obra e) {
	  obras.add(e);
  }
  
  public void removeObra(Obra e) {
	  obras.remove(e);
  }
  
  public int totalObras() {
	  return obras.size();
  }
  
}