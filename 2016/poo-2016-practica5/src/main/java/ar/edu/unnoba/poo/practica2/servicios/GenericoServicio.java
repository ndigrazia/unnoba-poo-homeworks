package ar.edu.unnoba.poo.practica2.servicios;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import ar.edu.unnoba.poo.practica2.util.JPARecurso;

public class GenericoServicio<T, K> implements GenericoServicioItf<T, K> {

	private JPARecurso recurso;
	
	@Override
	public void crear(T entidad) {
		EntityManager em = recurso.getEMF().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(entidad);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new RuntimeException(e);
		} finally {
			em.close();
	    }
	}

	@Override
	public T buscar(Class<T> clazz, K clave) {
		EntityManager em = recurso.getEMF().createEntityManager();
		
		try {
			return em.find(clazz, clave);
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
	    }
	}

	@Override
	public T actualizar(T entidad) {
		EntityManager em = recurso.getEMF().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			T nuevo = em.merge(entidad);
			tx.commit();
			return nuevo;
 		} catch (Exception e) {
			tx.rollback();
			throw new RuntimeException(e);
		} finally {
			em.close();
	    }
	}

	@Override
	public void borrar(T entidad) {
		EntityManager em = recurso.getEMF().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.remove(entidad);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			throw new RuntimeException(e);
		} finally {
			em.close();
	    }
	}

	@Override
	public List<T> buscarConConsultaNombrada(String consulta) {
		EntityManager em = recurso.getEMF().createEntityManager();
		
		List<T> resultado = em.createNamedQuery(consulta).getResultList();
		
		em.close();
		
		return resultado;
	}

	@Override
	public List<T> buscarConConsultaNombrada(String consulta, int limite) {
		EntityManager em = recurso.getEMF().createEntityManager();
		
		List<T> resultado = em.createNamedQuery(consulta)
				.setMaxResults(limite).getResultList();
		 
		em.close();
		
		return resultado;

	}

	@Override
	public List<T> buscarConConsultaNombrada(String consulta, Map<String, Object> parametros) {
		return buscarConConsultaNombrada(consulta, parametros, 0);
	}

	@Override
	public List<T> buscarConConsultaNombrada(String consulta, Map<String, Object> parametros, int limite) {
		EntityManager em = recurso.getEMF().createEntityManager();
		
		Set<Entry<String, Object>> params = parametros.entrySet();
		  
		Query query = em.createNamedQuery(consulta);
	    
		if(limite > 0)
			query.setMaxResults(limite);
	      
		for (Entry<String, Object> entry : params) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
		
		return query.getResultList();
	}
	
	public JPARecurso getRecurso() {
		return recurso;
	}

	public void setRecurso(JPARecurso recurso) {
		this.recurso = recurso;
	}

}
