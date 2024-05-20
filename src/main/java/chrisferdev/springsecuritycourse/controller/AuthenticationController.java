package chrisferdev.springsecuritycourse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chrisferdev.springsecuritycourse.dto.AuthenticationRequest;
import chrisferdev.springsecuritycourse.dto.AuthenticationResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(
            @RequestBody @Valid AuthenticationRequest authRequest){
        return null;
    }

    @GetMapping("/public -access")
    public String publicAccessEndpoint(){
        return "este endpoint es público";
    }
}
