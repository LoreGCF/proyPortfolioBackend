
package com.garcia.proyPortfolio.Jwt;


import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


@Service
public class JwtService {
    
    private static final String SECRET KEY=256bitkeygenerator ;

   public String getToken(UserDetails user) {
        return getToken(new HashMap<>(), user);
    }
    
   public String getToken(Map<String, Object> extraClaims, UserDetails user){
   
       return Jwts
               .builder()
               .setClaims(extraClaims)
               .setSubject(user.getUsername())
               .setIssuedAt(new Date(System.currentTimeMillis()))
               .setExpiration(new Date(System.currentTimeMillis()+1000*60*24))
               .signWith(getKey(), SignatureAlgorithm.HS256)
               .compact();
       
   }

   
   //min 43
    private Key getKey() {
        
    }
   
   
}
