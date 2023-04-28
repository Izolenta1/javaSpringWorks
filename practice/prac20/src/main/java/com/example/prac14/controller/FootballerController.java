package com.example.prac14.controller;

import com.example.prac14.service.FootballerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/footballer")
public class FootballerController {
    @Autowired
    private FootballerService footballerService;

    @GetMapping
    public ResponseEntity getFootballerClubs(@RequestParam int id) {
        return ResponseEntity.ok(footballerService.getFootballerById(id));
    }
}
