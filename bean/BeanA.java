package com.example.demo.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA extends BeanSample implements InitializingBean, DisposableBean {

    public BeanA(String name, int value) {
        super(name, value);
    }

    public BeanA() {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA destroy called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA afterPropertiesSet called");
    }
}
