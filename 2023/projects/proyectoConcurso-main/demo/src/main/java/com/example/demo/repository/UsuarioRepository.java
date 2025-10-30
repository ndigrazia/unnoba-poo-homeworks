package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, String> {

    //se elimina por mail que es clave primaria de Usuario.
    void deleteById(String usuarioId);
        
}