package com.example.demo.service.model;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "specialists")
@EnableAutoConfiguration
public final class Specialist {
    @Id
    private UUID id;
    private String name;
    private boolean isFree;

    public Specialist(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.isFree = true;
    }

    public Specialist() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
