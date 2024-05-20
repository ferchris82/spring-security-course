package chrisferdev.springsecuritycourse.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import chrisferdev.springsecuritycourse.dto.AuthenticationRequest;
import chrisferdev.springsecuritycourse.dto.AuthenticationResponse;
import chrisferdev.springsecuritycourse.entity.User;
import chrisferdev.springsecuritycourse.repository.UserRepository;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    public AuthenticationResponse login (AuthenticationRequest authRequest){

        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                    authRequest.getUsername(), authRequest.getPassword()
        );            
        
        authenticationManager.authenticate(authToken);

        User user = userRepository.findByUsername(authRequest.getUsername()).get();
        
        String jwt = jwtService.generateToken(user, generateExtraClaims(user));
        
        return new AuthenticationResponse(jwt);       
    }

    private Map<String, Object> generateExtraClaims(User user){
        
    }
}
