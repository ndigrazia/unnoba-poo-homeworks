package ar.edu.unnoba.poo2018.extras.herramientas;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ar.edu.unnoba.poo2018.model.Ambito;
import ar.edu.unnoba.poo2018.model.Compuesto;
import ar.edu.unnoba.poo2018.model.Convocatoria;
import ar.edu.unnoba.poo2018.model.LineaEstrategica;
import ar.edu.unnoba.poo2018.model.Objetivo;
import ar.edu.unnoba.poo2018.model.Simple;
import ar.edu.unnoba.poo2018.model.Usuario;

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
    	Usuario u = new Usuario("nedigrazia", "123456", false);
    	em.persist(u);
    	/*u = em.find(Usuario.class, u.getNombre());
    	em.remove(u);*/
    	
    	LineaEstrategica l = new LineaEstrategica();
    	l.setNombre("Linea1");
    	em.persist(l);
    	
    	Ambito a = new Ambito();
    	a.setNombre("Ambito1");
    	em.persist(a);
    	
    	Convocatoria c = new Convocatoria();
    	c.setNombre("Convocatoria1");
    	em.persist(c);
    	
    	Objetivo o1 = new Objetivo();
    	o1.setNombre("Objetivo1");
    	em.persist(o1);
    	
    	Objetivo o2 = new Objetivo();
    	o2.setNombre("Objetivo2");
    	em.persist(o2);
    	
    	//Simple
    	Simple s = new Simple();
    	s.setAmbito(a);
    	s.setConvocatoria(c);
    	s.setExpediente("Expediente1");
    	s.setFechaInicio(deStringToDate("04/10/2018"));
    	s.setFechaFin(deStringToDate("04/10/2018"));
    	s.setLinea(l);
    	s.setNombre("Simple1");
    	em.persist(s);
    	
    	s.addObjetivo(12, o1);
    	s.addObjetivo(10, o2);
    	em.merge(s);
    	
    	System.out.println(s);
    	
    	//Simple
    	Compuesto co = new Compuesto();
    	co.setAmbito(a);
    	co.setConvocatoria(c);
    	co.setExpediente("Expediente2");
    	co.setFechaInicio(deStringToDate("04/10/2018"));
    	co.setFechaFin(deStringToDate("04/10/2018"));
    	co.setLinea(l);
    	co.setNombre("Compuesto2");
    	em.persist(co);
    	
    	co.addUsuario(u);
    	co.addActividad(s);
    	
    	em.merge(co);
    	
    	System.out.println(co);
    	
    	System.out.println(co.getImpactos());

    }
}
