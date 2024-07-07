package br.com.rodrigo.canary_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CanaryController {
  @GetMapping("resource")
    public String resource() {
        return "Canary Service";
    }
}
