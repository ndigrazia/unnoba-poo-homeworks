package ar.edu.unnoba.poo.practica2.extras.herramientas;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import ar.edu.unnoba.poo.practica2.util.JPARecurso;

public class GeneradorDDL {
	
   public static void main(String args[]){
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "create");
        
        EntityManagerFactory emf = new JPARecurso().getEMF(properties);
        emf.createEntityManager().close();
        emf.close();
    }
   
}
