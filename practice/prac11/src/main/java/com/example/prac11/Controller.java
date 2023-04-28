package com.example.prac11;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("Сервер работает");
    }
}
