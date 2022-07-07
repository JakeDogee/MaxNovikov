package com.example.hw1.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanB() {
        System.out.println(this.getClass().getSimpleName());
    }
}
