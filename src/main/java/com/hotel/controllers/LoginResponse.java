package com.hotel.controllers;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;

    private long expiresIn;
}
