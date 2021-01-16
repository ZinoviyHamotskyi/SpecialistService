package com.example.demo.service;


import com.example.demo.service.model.Specialist;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface SpecialistService {
    Specialist addNewSpecialist(String name);
    Specialist getSpecialistByName(String name);
    List<Specialist> getSpecialists();
    String deleteSpecialistByName(String name);
    UUID getId(String name);
    Specialist getSprcialistById(UUID id);
}
