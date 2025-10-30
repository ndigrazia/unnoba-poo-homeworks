package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Usuario;

@Controller
public class RegistroController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    
   
    @GetMapping("/registro")
    public String registro() {
        return "registro";
    }

    @GetMapping("/usuarioRegistrado")
    public String usuarioRegistrado() {
        return "usuarioRegistrado";
    }

    @PostMapping("/registro")
    public String altaUsuario(Usuario usuario) {
        usuarioBusiness.insertUsuario(usuario);
        return "usuarioRegistrado";  
    }
}

