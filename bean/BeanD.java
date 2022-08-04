package com.example.demo.bean;

public class BeanD extends BeanSample{

    public BeanD(String name, int value) {
        super(name, value);
    }

    public BeanD() {
    }

    public void init() {
        System.out.println("BeanD init called");
    }

    public void destroy() {
        System.out.println("BeanD destroy called");
    }
}
