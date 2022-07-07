package com.example.hw1.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {

    private List<Animal> list;

    @Autowired
    public Pet(List<Animal> list) {
        this.list = list;
    }

    public void printPet(){
        list.forEach(name -> System.out.println(name.getClass().getSimpleName()));
    }
}