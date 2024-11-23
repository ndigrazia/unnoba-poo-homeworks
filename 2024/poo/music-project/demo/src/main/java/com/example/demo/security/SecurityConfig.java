package com.example.demo.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@RequiredArgsConstructor
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public static final String ADMIN = "admin";
    public static final String USER = "user";

    private final JwtConverter jwtConverter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable() // H2 Console no funciona bien con CSRF habilitado
        .headers().frameOptions().disable() // Permite la carga del iframe de H2 Console
        .and()
        .authorizeHttpRequests((authz) ->
                authz//.requestMatchers(HttpMethod.GET, "/api/hello").permitAll()
                .requestMatchers(HttpMethod.GET, "/playlist/**").hasRole(ADMIN)
                .requestMatchers(HttpMethod.GET, "/songs/**").hasRole(USER).requestMatchers(HttpMethod.GET,
                                "/other-resource/**").hasAnyRole(ADMIN,USER)
                .requestMatchers("/h2-console/**").permitAll()
                .anyRequest().denyAll());

        http.sessionManagement(sess -> sess.sessionCreationPolicy(
                SessionCreationPolicy.STATELESS));
        http.oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> jwt.jwtAuthenticationConverter(jwtConverter)));

        return http.build();
    }

}