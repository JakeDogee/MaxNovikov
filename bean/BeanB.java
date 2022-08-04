package com.example.demo.bean;

public class BeanB extends BeanSample{

    public BeanB(String name, int value) {
        super(name, value);
    }

    public BeanB() {
    }

    public void init() {
        System.out.println("BeanB init called");
    }

    public void destroy() {
        System.out.println("BeanB destroy called");
    }

    public void secondInit() {
        System.out.println("BeanB secondInit called");
    }
}
