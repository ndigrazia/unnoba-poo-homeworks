package com.example.torneos.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import jakarta.annotation.PostConstruct;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {

    // 10 días en milisegundos (ver de usar como variable de contexto)
    private static final long EXPIRATION_TIME = 10L * 24 * 60 * 60 * 1000; 

    @Value("${jwt.secret-key:MiClavePorDefecto}")
    private String secretKey;
    
    private Algorithm algorithm;

    @PostConstruct
    private void init() {
        this.algorithm = Algorithm.HMAC512(secretKey);
    }

    /**
     * Genera un token JWT con el subject (email) como claim principal.
     * El token expira en 10 días y se firma con HMAC512.
     */
    public String generateToken(String subject) {
        String token = JWT.create()
                .withSubject(subject)
                .withIssuedAt(new Date())
                .withExpiresAt(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .sign(algorithm);

        return "Bearer " + token;
    }

    public boolean verify(String token) {
        try {
            String cleanToken = token.replace("Bearer ", "");
            JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(cleanToken);
            return true;
        } catch (JWTVerificationException e) {
            return false;
        }
    }

    public String getSubject(String token) {
        try {
            String cleanToken = token.replace("Bearer ", "");
            DecodedJWT decoded = JWT.require(algorithm).build().verify(cleanToken);
            return decoded.getSubject();
        } catch (JWTVerificationException e) {
            return null;
        }
    }
    
}
