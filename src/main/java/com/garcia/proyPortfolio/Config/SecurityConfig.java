
package com.garcia.proyPortfolio.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;



//9 min
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    //creamos el método para restringir acceso a rutas
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        
        return http
                .csrf(csrf
                        -> csrf
                        .disable()
                )
                .authorizeHttpRequests(authRequest ->
                authRequest
                        .requestMatchers("/auth/**").permitAll() //para loguearse o registrarse está permitido
                        .anyRequest().authenticated()   //todos los demas deben autenticarse
                )
                .formLogin(withDefaults())
                .build();
    
        
    
    
    }



    
    
}
