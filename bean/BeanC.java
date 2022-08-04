package com.example.demo.bean;

public class BeanC extends BeanSample{

    public BeanC(String name, int value) {
        super(name, value);
    }

    public BeanC() {
    }

    public void init() {
        System.out.println("BeanC init called");
    }

    public void destroy() {
        System.out.println("BeanC destroy called");
    }
}
