package com.url.url_shortener.controller;


import com.url.url_shortener.dtos.LoginRequest;
import com.url.url_shortener.dtos.RegisterRequest;
import com.url.url_shortener.models.User;
import com.url.url_shortener.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/public/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequestRequest) {
        return ResponseEntity.ok(userService.authenticateUser(loginRequestRequest));
    }

    @PostMapping("/public/register")
    public ResponseEntity<?> registerUser(@RequestBody  RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        user.setRole("ROLE_USER");
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

}
