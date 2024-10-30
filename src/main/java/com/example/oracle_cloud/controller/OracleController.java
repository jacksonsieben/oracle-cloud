package com.example.oracle_cloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oracle")
public class OracleController {
    @GetMapping("/on")
    public ResponseEntity<String> isOn() {
        return ResponseEntity.ok().body("Server Oracle Cloud is Online!");
    }

    @GetMapping("/error")
    public ResponseEntity<String> error() {
        return ResponseEntity.internalServerError().body("Internal Server Error");
    }
}
