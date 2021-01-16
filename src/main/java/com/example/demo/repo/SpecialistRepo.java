package com.example.demo.repo;

import com.example.demo.service.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface SpecialistRepo extends JpaRepository<Specialist, UUID> {
    Specialist getSpecialistByName(String name);
    void deleteByName(String name);

    Specialist getSpecialistById(UUID id);
}
