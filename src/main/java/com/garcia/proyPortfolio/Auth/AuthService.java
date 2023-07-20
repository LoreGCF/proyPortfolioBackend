
package com.garcia.proyPortfolio.Auth;


import com.garcia.proyPortfolio.Jwt.JwtService;
import com.garcia.proyPortfolio.User.Role;
import com.garcia.proyPortfolio.User.User;
import com.garcia.proyPortfolio.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
class AuthService {
    
    private final UserRepository userRepository;
    
    //necesito que el token se genere automaticamente por ello creo el jwtservice
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    
    public AuthResponse login(LoginRequest request){
    return null;
    } 
    
    public AuthResponse register(RegisterRequest request){
    User user = User.builder()
            .username(request.getUsername())
            .password(request.getPassword())
            .firstname(request.getFirstname())
            .lastname(request.getLastname())
            .country(request.getCountry())
            .role(Role.USER)
            .build();
    
    userRepository.save(user);
    
    return AuthResponse.builder()
            .token(jwtService.getToken(user))
            .build();
    
            } 
    
}
