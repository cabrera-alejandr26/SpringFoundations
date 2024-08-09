package com.example.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello From Component Vehicle Bean");
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroying Vehicle Bean...");
    }
}
