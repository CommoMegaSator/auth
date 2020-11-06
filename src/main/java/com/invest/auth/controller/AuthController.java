package com.invest.auth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public ResponseEntity getData(){
        return new ResponseEntity("Naruto & Sasuke become friends!", HttpStatus.OK);
    }
}
