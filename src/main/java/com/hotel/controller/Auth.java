//package com.hotel.controller;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/auth")
//public class Auth {
//
//    private final Auth authService;
//
//    public Auth(Auth authService) {
//        this.authService = authService;
//    }
//
//    @PostMapping("/register")
//    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
//        return authService.register(request);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest request) {
//        return authService.login(request);
//    }
//}
