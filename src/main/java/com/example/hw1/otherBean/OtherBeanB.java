package com.example.hw1.otherBean;

import com.example.hw1.beans.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {
    BeanB beanB;
    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
        System.out.println(this.getClass().getSimpleName() + ". " + beanB.getClass().getSimpleName() + " was injected through the setter");
    }
}
