package com.example.demo.bpp;

import com.example.demo.bean.BeanSample;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanSample checkBeans) {
            if (checkBeans.getName() != null && checkBeans.getValue() > 0) {
                return bean;
            }
            checkBeans.setName("DEFAULT");
            checkBeans.setValue(1);
            System.out.println("Fail to validate bean " + beanName + ". Default values are set.");
        }
        return bean;
    }
}
