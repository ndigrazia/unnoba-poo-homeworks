package com.registro.usuarios.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.registro.usuarios.controlador.dto.UsuarioRegistroDTO;
import com.registro.usuarios.modelo.Usuario;


public interface UsuarioServicio extends UserDetailsService{
	// Metodo para guardar usuarios
	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	// Metodo para mostrar los usuarios
	public List<Usuario> listarUsuarios();
	
}
