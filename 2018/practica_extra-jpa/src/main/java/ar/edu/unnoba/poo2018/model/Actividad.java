package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "Actividades")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Actividad {
	
	@Id
	@SequenceGenerator(name = "ID_ACTIVIDAD_SEQ", sequenceName="SEQ_ACTIVIDAD", allocationSize=1, initialValue=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ACTIVIDAD_SEQ")
	private long nro;
	private String nombre;
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	@Temporal(TemporalType.DATE)
	private Date fechaFin;
	private String resolucion;
	private String expediente;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Convocatoria convocatoria;
	@ManyToOne(fetch=FetchType.LAZY)
	private LineaEstrategica linea;
	@ManyToOne(fetch=FetchType.LAZY)
	private Ambito ambito;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "Responsables",
		joinColumns = @JoinColumn(name = "actividad_id"),
		inverseJoinColumns = @JoinColumn(name = "usuario_id")
	)
	private List<Usuario> responsables = new ArrayList<Usuario>();
	
	@Version
	protected int version;

	public long getNro() {
		return nro;
	}
	public void setNro(long nro) {
		this.nro = nro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	public String getExpediente() {
		return expediente;
	}
	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}
	
	public Convocatoria getConvocatoria() {
		return convocatoria;
	}
	public void setConvocatoria(Convocatoria convocatoria) {
		this.convocatoria = convocatoria;
	}
	
	public LineaEstrategica getLinea() {
		return linea;
	}
	public void setLinea(LineaEstrategica linea) {
		this.linea = linea;
	}
	
	public Ambito getAmbito() {
		return ambito;
	}
	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
	
	public void addUsuario(Usuario u) {
		responsables.add(u);
	}
	public void removeUsuario(Usuario u) {
		responsables.remove(u);
	}
	
	@Override
	public String toString() {
		return "Actividad [nro=" + nro + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", resolucion=" + resolucion + ", expediente=" + expediente + ", convocatoria="
				+ convocatoria + ", linea=" + linea + ", ambito=" + ambito + ", responsables=" + responsables + "]";
	}
	
	public abstract List<Impacto> getImpactos();
	
}
