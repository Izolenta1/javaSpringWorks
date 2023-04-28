package com.example.prac14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/footballer")
public class FootballerController {
    @Autowired
    private FootballerRepos footballerRepos;


    @PostMapping
    public ResponseEntity createFootballer(@RequestBody Footballer footballer) {
        footballerRepos.create(footballer);
        return ResponseEntity.ok(HttpStatus.OK);
    }


    @DeleteMapping
    public ResponseEntity deleteFootballer(@RequestParam int id) {
        footballerRepos.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getFootballerById(@RequestParam int id) {
        return ResponseEntity.ok(footballerRepos.getFootballerById(id));
    }
}
