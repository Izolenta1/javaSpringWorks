package com.example.prac14;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import org.json.JSONObject;

@RestController
@RequestMapping("/footballer")
public class FootballerController {
    private ArrayList<Footballer> footballerMas = new ArrayList<Footballer>();

    @PostMapping
    public ResponseEntity createFootballer(@RequestBody String footballer) {
        JSONObject jsonFootballer = new JSONObject(footballer);

        String name = (String) jsonFootballer.get("firstName");
        String last = (String) jsonFootballer.get("lastName");

        Footballer footballerObj = new Footballer(name, last);
        footballerMas.add(footballerObj);

        return ResponseEntity.ok(HttpStatus.OK);
    }


    @DeleteMapping
    public ResponseEntity deleteFootballer(@RequestBody String footballer) {
        JSONObject jsonFootballer = new JSONObject(footballer);

        String name = (String) jsonFootballer.get("firstName");
        String last = (String) jsonFootballer.get("lastName");

        Footballer footballerObj = new Footballer(name, last);

        for (int i = 0; i < footballerMas.size(); i++) {
            if (footballerMas.get(i).getFootballer().equals(footballerObj.getFootballer())) {
                footballerMas.remove(i);
                break;
            }
        }

        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAllFootballers() {
        String returnStr = "";

        for (Footballer item : footballerMas) {
            returnStr = returnStr + item.getFootballer() + "\n";
        }

        return ResponseEntity.ok(returnStr);
    }
}
