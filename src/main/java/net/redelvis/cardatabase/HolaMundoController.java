package net.redelvis.cardatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/")
    public String hello() {
        return "Hola Mundo, from Spring Boot 2!";
    }
}
