package com.example.demo.bean;

public class BeanSample {
    private String name;
    private int value;

    public BeanSample(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public BeanSample() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanSample{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
