package com.example.hw1;

import com.example.hw1.animal.Pet;
import com.example.hw1.config.BeansConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        Pet pet = context.getBean(Pet.class);
        pet.printPet();
    }
}
