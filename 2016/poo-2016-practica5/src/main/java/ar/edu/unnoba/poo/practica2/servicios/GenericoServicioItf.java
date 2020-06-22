package ar.edu.unnoba.poo.practica2.servicios;

import java.util.List;
import java.util.Map;

public interface GenericoServicioItf<T,K> {

	public void crear(T entidad);
	
	public T buscar(Class<T> clazz, K clave);
	
	public T actualizar(T entidad);
	
	public void borrar(T entidad);
	
	public List<T> buscarConConsultaNombrada(String consulta);
	
	public List<T> buscarConConsultaNombrada(String consulta, int limite);
	
	public List<T> buscarConConsultaNombrada(String consulta, Map<String, Object> parametros);
	
	public List<T> buscarConConsultaNombrada(String consulta, Map<String, Object> parametros, int limite);

}
