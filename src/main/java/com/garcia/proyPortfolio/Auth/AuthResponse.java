
package com.garcia.proyPortfolio.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //para getters y setters
@Builder //para luego construir objetos
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    String token;
    
    
}
