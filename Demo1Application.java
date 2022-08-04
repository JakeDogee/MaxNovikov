package com.example.demo;

import com.example.demo.config.FirstConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(FirstConfig.class);
        System.out.println();
        for (String s :
                context.getBeanDefinitionNames()) {
            System.out.println(s);
        }
        System.out.println();
        Arrays.stream(context.getBeanDefinitionNames())
                .map(context::getBeanDefinition)
                .forEach(System.out::println);
        System.out.println();
        context.close();
    }

}
