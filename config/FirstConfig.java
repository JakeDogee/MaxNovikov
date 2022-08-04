package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Import(SecondConfig.class)
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.example.demo.bfpp",
        "com.example.demo.bpp"})
public class FirstConfig {
}
