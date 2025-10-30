package com.example.demo.util;

import com.password4j.Hash;
import com.password4j.Password;

public class PasswordEncoder {

    public String encode(String rawPassword) {
      if (rawPassword == null || rawPassword.isEmpty()) {
            throw new IllegalArgumentException("El password no puede ser nulo o vacío");
        }

        // Genera el hash Bcrypt
        Hash hash = Password.hash(rawPassword).withBCrypt();
        return hash.getResult();
    }

     public boolean verify(String rawPassword, String encodedPassword) {
        if (rawPassword == null || encodedPassword == null) {
            throw new IllegalArgumentException("Los parámetros no pueden ser nulos");
        }

        // Verifica la contraseña contra el hash
        return Password.check(rawPassword, encodedPassword).withBCrypt();
    }
}
