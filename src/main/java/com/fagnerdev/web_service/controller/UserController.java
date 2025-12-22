package com.fagnerdev.web_service.controller;


import com.fagnerdev.web_service.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "maria", "teste", "outro teste", "mais um ");
        return ResponseEntity.ok().body(user);
    }
}
