package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioEncontradoController {
    @GetMapping("/usuarioEncontrado")
    public String usuarioEncontrado() {
        return "usuarioEncontrado";
    }
}
