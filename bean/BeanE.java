package com.example.demo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE extends BeanSample{

    public BeanE(String name, int value) {
        super(name, value);
    }

    public BeanE() {
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("BeanE postConstructMethod called");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("BeanE preDestroyMethod called");
    }
}
