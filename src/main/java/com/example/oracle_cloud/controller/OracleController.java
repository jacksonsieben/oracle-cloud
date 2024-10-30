package com.example.oracle_cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oracle")
public class OracleController {
    @GetMapping("/on")
    public String isOn() {
        return "Server Oracle Cloud is Online!";
    }

    @GetMapping("/off")
    public String isOff() {
        return "Server Oracle Cloud is not Offline!";
    }
}
