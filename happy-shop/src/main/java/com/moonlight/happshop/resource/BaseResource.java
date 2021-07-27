package com.moonlight.happshop.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//api
@RestController
@RequestMapping
public class BaseResource {
    @GetMapping("/api")
    public ResponseEntity Test(){
        return ResponseEntity.ok().body("Long ga");
    }
}
