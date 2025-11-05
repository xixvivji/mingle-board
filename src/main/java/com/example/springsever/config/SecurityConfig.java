package com.example.springsever.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Security configuration for development.
 * WARNING: This configuration is NOT suitable for production use.
 * For production, implement proper authentication and authorization.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())  // TODO: Enable CSRF protection for production
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()  // TODO: Add proper authorization rules
            );
        return http.build();
    }
}
