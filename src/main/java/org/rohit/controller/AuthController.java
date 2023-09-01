package org.rohit.controller;

import org.rohit.dto.JwtRequest;
import org.rohit.dto.JwtResponse;
import org.rohit.security.JwtHelper;
import org.rohit.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private AuthService authService;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtHelper helper;

    private final Logger logger = LoggerFactory.getLogger(AuthController.class);
    @PostMapping("/auth")
    public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {
        System.out.println("controller auth");
        authService.doAuthenticate(request.getUsername(), request.getPassword());

        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUsername());
        String token = this.helper.generateToken(userDetails);

        JwtResponse response = JwtResponse.builder()
                .access_token(token)
                .expires_in(1800)
                .refresh_expires_in(1800)
                .refresh_token("")
                .token_type("Bearer")
                .build();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
