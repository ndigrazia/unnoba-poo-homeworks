package ar.edu.unnoba.poo.practica2.extras.herramientas;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unnoba.poo.practica2.modelo.Fase;
import ar.edu.unnoba.poo.practica2.modelo.Ingeniero;
import ar.edu.unnoba.poo.practica2.modelo.Obra;
import ar.edu.unnoba.poo.practica2.modelo.Persona;
import ar.edu.unnoba.poo.practica2.modelo.Proyecto;

public class Poblador {
	
	private static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String args[]){
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    	EntityManager em = emf.createEntityManager();
        	
        try
        {
        	em.getTransaction().begin();
        	Poblador.popular(em);
        	em.getTransaction().commit();
        } catch(Exception e) {
        	em.getTransaction().rollback();
        }
        
        em.close();
        emf.close();	
    }
    
    private static java.util.Date deStringToDate(String fecha) {
        try {
            return formatoFecha.parse(fecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static void popular(EntityManager em) {
    	Persona persona1 = new Persona("24329961", "Nelson Di Grazia", deStringToDate("10/04/1975"),
    			"Calle 9 678", "123456");
    	em.persist(persona1);
    	 
    	Ingeniero ingeniero1 = new Ingeniero("123456", "Ingeniero-1", persona1, 120.00f, 1);
    	em.persist(ingeniero1);

    	Fase f1 = new Fase("Fase-1", 120, ingeniero1);
    	em.persist(f1);

    	Obra obra1 = new Obra("Obra-1", deStringToDate("12/10/2016"), 122, ingeniero1);
    	obra1.cambiarEstado();
        em.persist(obra1);
    	
        f1.addObra(obra1);
        em.merge(f1);
        
        Proyecto proyecto1 = new Proyecto("Proyecto-1", deStringToDate("12/10/2016"), deStringToDate("12/12/2016"), 1233, ingeniero1);
        em.persist(proyecto1);
        
        proyecto1.addFase(f1);
        em.merge(proyecto1);
    }
    
}
