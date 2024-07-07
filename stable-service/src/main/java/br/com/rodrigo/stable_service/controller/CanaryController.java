package br.com.rodrigo.stable_service.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CanaryController {
    @GetMapping("resource")
    public String resource() {
        return "Stable Service";
    }
    
}
