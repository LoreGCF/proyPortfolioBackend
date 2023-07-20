
package com.garcia.proyPortfolio.User;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer> {
    
    //devuelve un objeto de tipo optional, puede devolver nulo
    Optional<User>findByUsername(String username);
    
    
}
