package com.registro.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	// Genera una consulta para buscar un usuario por su dirección de correo electrónico basándose en el nombre del método (findByEmail).
	public Usuario findByEmail(String email);
	
}
