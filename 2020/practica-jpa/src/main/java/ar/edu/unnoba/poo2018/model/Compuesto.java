package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Actividades_Compuestas")
@PrimaryKeyJoinColumn(referencedColumnName="nro")
public class Compuesto extends Actividad {

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "Actividades_Relacionadas",
		joinColumns = @JoinColumn(name = "actividad_compuesta_id"),
		inverseJoinColumns = @JoinColumn(name = "actividad_id")
	)
	private List<Actividad> actividades = new ArrayList<Actividad>();
	
	public List<Actividad> getActividades() {
		return actividades;
	}
	
	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	
	public void addActividad(Actividad a) {
		actividades.add(a);
	}
	public void removeActividad(Actividad a) {
		actividades.remove(a);
	}

	public List<Impacto> getImpactos() {
		HashMap<Objetivo, ImpactoEstategiaPromedio> promedios =
				new HashMap<Objetivo, ImpactoEstategiaPromedio>();
		
		for(Actividad a: actividades) {
			for (Impacto i: a.getImpactos()) {
				Objetivo o = i.getObjetivo();
				
				ImpactoEstategiaPromedio it = promedios.get(o);
				
				if(it==null)
					promedios.put(o, new ImpactoEstategiaPromedio(o, i.getPeso()));
				else 
					it.acumularPeso(i.getPeso());
			}
		}
		
		/*Function<ImpactoEstategiaPromedio, Impacto> funcion = new Function<ImpactoEstategiaPromedio, Impacto>() {
		@Override
		public Impacto apply(ImpactoEstategiaPromedio t) {
			return t.aImpacto();
		}
		};*/

		//Lambda Expression
		List<Impacto> impactos = promedios.values().stream()
			.map(impactoPromedio -> impactoPromedio.aImpacto()).collect(Collectors.toList());

		
		return impactos;
	}

	private class ImpactoEstategiaPromedio {
		private Objetivo objetivo;
		
		private int peso = 0;
		private int cantidad = 0;
		
		public ImpactoEstategiaPromedio(Objetivo o, int p) {
			objetivo = o;
			acumularPeso(p);
		}
		
		public void acumularPeso(int p) {
			peso+=p;
			++cantidad;
		}
		
		public Impacto aImpacto() {
			return new Impacto(peso / cantidad, objetivo); 
		}
	}

	@Override
	public String toString() {
		return "Compuesto: " + getNombre() + " [actividades=" + actividades + "]";
	}
	
}
