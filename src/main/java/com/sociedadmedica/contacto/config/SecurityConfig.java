package com.sociedadmedica.contacto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // Desactivamos CSRF para permitir POST desde el front sin token
                .csrf(csrf -> csrf.disable())
                // Configuramos qué rutas son públicas
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/contacto/**").permitAll()  // TODO: aquí tu API de contacto
                        .anyRequest().permitAll()                         // o ajustar según lo que uses
                );

        return http.build();
    }
}