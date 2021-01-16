package com.example.demo.controller;


import com.example.demo.service.SpecialistService;
import com.example.demo.service.model.Specialist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SpecialistController {
    private final SpecialistService specialistService;

    @Autowired
    public SpecialistController(SpecialistService specialistService){
        this.specialistService = specialistService;
    }

    @GetMapping(value = "/specialists")
    public ResponseEntity<List<Specialist>> getSpecialists(){
        return ResponseEntity.ok(specialistService.getSpecialists());
    }

    @PostMapping(value = "/specialists")
    public ResponseEntity<Specialist> addNewSpecialist(@RequestParam String name) {
        return ResponseEntity.ok(specialistService.addNewSpecialist(name));
    }

    @GetMapping(value = "/specialists/{name}")
    public  ResponseEntity<Specialist> getSpecialistByName(@PathVariable(name = "name") String name){
        return ResponseEntity.ok(specialistService.getSpecialistByName(name));
    }

    @DeleteMapping(value = "/specialists/{name}")
    public ResponseEntity<String> deleteSpecialistByName(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(specialistService.deleteSpecialistByName(name));
    }
}
