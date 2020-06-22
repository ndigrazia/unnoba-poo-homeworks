package ar.edu.unnoba.poo.proyecto.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
@NamedQueries({
@NamedQuery(name="Proyecto.findAll", query="SELECT p FROM Proyecto p"),
})
public class Proyecto {

  @Id
  @SequenceGenerator(name = "ID_PROYECTO_SEQ", sequenceName="SEQ_PROYECTO", allocationSize=1, initialValue=1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PROYECTO_SEQ")
  private long nro;
  private String descripcion;
  private Date fechaInicio;
  private Date fechaTerminacion;
  private int horasCoordinacion;
  
  /*@ManyToOne(fetch=FetchType.LAZY)
  private Responsable controla;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "PROYECTO")
  private List<Fase> fases = new ArrayList<Fase>();*/
  
  @Version
  protected int version;
  
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