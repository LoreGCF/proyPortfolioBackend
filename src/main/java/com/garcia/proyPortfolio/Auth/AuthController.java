
package com.garcia.proyPortfolio.Auth;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*Necesito una ruta publica */

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    //especificamos los metodos
    
    @PostMapping(value = "login")
    public String login() {
        return "Login from public endpoint";
    }
    
    
    @PostMapping(value = "register")
    public String register(){
        return "Register from public endpoint";
    }
    
    
}
