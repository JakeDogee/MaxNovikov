package com.example.hw1.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    public BeanC() {
        System.out.println(this.getClass().getSimpleName());
    }
}
