package com.example.torneos.util;

import com.password4j.Hash;
import com.password4j.Password;

public class PasswordEncoder {

    public String encode(String rawPassword) {
       Hash hash = Password.hash(rawPassword).withBcrypt();
       return hash.getResult();
    }

    public boolean verify(String rawPassword, String encodedPassword) {
        if (rawPassword == null || encodedPassword == null) {
            throw new IllegalArgumentException("Los parámetros no pueden ser nulos");
        }

        // Verifica la contraseña contra el hash
        return Password.check(rawPassword, encodedPassword).withBcrypt();
    }
   
}
