package ar.edu.unnoba.poo2018.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

public class Compuesto extends Actividad {

	private List<Actividad> actividades = new ArrayList<Actividad>();
	
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
	
}
