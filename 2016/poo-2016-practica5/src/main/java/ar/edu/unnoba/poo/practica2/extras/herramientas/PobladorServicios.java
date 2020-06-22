package ar.edu.unnoba.poo.practica2.extras.herramientas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ar.edu.unnoba.poo.practica2.modelo.Fase;
import ar.edu.unnoba.poo.practica2.modelo.Ingeniero;
import ar.edu.unnoba.poo.practica2.modelo.Obra;
import ar.edu.unnoba.poo.practica2.modelo.Persona;
import ar.edu.unnoba.poo.practica2.modelo.Proyecto;
import ar.edu.unnoba.poo.practica2.servicios.FaseServicio;
import ar.edu.unnoba.poo.practica2.servicios.IngenieroServicio;
import ar.edu.unnoba.poo.practica2.servicios.ObraServicio;
import ar.edu.unnoba.poo.practica2.servicios.PersonaServicio;
import ar.edu.unnoba.poo.practica2.servicios.ProyectoServicio;
import ar.edu.unnoba.poo.practica2.util.JPARecurso;

public class PobladorServicios {
	
	private static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String args[]){
		JPARecurso recurso = new JPARecurso();
		PobladorServicios.popular(recurso);
		recurso.liberar();
    }
    
    private static java.util.Date deStringToDate(String fecha) {
        try {
            return formatoFecha.parse(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void popular(JPARecurso recurso) {
    	PersonaServicio ps = new PersonaServicio();
    	ps.setRecurso(recurso);
    	
    	IngenieroServicio is = new IngenieroServicio();
    	is.setRecurso(recurso);
    	
    	ObraServicio os = new ObraServicio();
    	os.setRecurso(recurso);
    	
    	ProyectoServicio prs = new ProyectoServicio();
    	prs.setRecurso(recurso);
    	
    	FaseServicio fs = new FaseServicio();
    	fs.setRecurso(recurso);
    	
    	Persona persona1 = new Persona("24329961", "Nelson Di Grazia", deStringToDate("10/04/1975"),
    			"Calle 9 678", "123456");
    	ps.crear(persona1);
    	
    	Ingeniero ingeniero1 = new Ingeniero("123456", "Ingeniero-1", persona1, 120.00f, 1);
    	is.crear(ingeniero1);

    	Fase f1 = new Fase("Fase-1", 120, ingeniero1);
    	fs.crear(f1);

    	Obra obra1 = new Obra("Obra-1", deStringToDate("12/10/2016"), 122, ingeniero1);
    	obra1.cambiarEstado();
        os.crear(obra1);
    	
        f1.addObra(obra1);
        Fase fn = fs.actualizar(f1);
        
        Proyecto proyecto1 = new Proyecto("Proyecto-1", deStringToDate("12/10/2016"), deStringToDate("12/12/2016"), 1233, ingeniero1);
        prs.crear(proyecto1);
        
    	proyecto1.addFase(fn);
        prs.actualizar(proyecto1);
        
        imprimirListaProyecto(prs.buscarConConsultaNombrada("Proyecto.findAll"));
        imprimirListaProyecto(prs.buscarConConsultaNombrada("Proyecto.findAll", 2));
        
        Map<String, Object> parametros = new HashMap<String, Object>();
        parametros.put("hora", 1500);
        
        imprimirListaProyecto(prs.buscarConConsultaNombrada("Proyecto.findHorasMenorA", parametros));
    }
    
    private static void imprimirListaProyecto(List<Proyecto> proyectos) {
    	for(Proyecto p : proyectos) {
    		System.out.println(p);
    	}
    }
    
}
