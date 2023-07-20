
package com.garcia.proyPortfolio.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*Necesito una ruta publica */

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    //especificamos los metodos
    
    /*Recuerda que el AuthController se relaciona con el service*/
    private final AuthService authService;
    
    
    @PostMapping(value = "login")
    /*El ResponseEntity va a estar representando toda la respuesta http
    incluye los códigos de estado, los encabezados, el cuerpo de respuesta, 
    nos brinda flexibilidad y personaliza la respuesta
    */
    
    //el en caso del login el servicio irá a buscar el usuario autenticado
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));//ahora devolvemos un objeto de tipo response entity
    }
    
    
    //en el caso del register el servicio creará un nuevo registro de usuario
    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }
    
    
}
