
package com.garcia.proyPortfolio.Demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//aquí se coloca la api que hemos creado. Los métodos protegidos
//recordar que spring security protege por defecto todos los endpoint, hay que configurarlos, todas están protegidas.
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DemoController {
    
    @PostMapping(value = "demo")
    public String welcome(){
    return "Welcome from secure endpoint";
    }
            
    
}
