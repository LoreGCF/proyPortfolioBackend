
package com.garcia.proyPortfolio.Jwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) 
            throws ServletException, IOException {
        
     //este método va a hacer todos los filtros relacionados al token
     
     //lo primero obteber el token del request
     
     final String token = getTokenFromRequest(request);
     
     
     if (token == null){
     filterChain.doFilter(request, response);
     return;
     
     }
     
     filterChain.doFilter(request, response);
     
     
        
    }

    private String getTokenFromRequest(HttpServletRequest request) {
        final String authHeader=request.getHeader(HttpHeaders.AUTHORIZATION);
        
        if(StringUtils.hasText(authHeader) && authHeader.startsWith("Bearer ")){
        
            return authHeader.substring(7);
        
        }
        return null;
    }
     
    
}
