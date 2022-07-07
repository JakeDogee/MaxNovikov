package com.example.hw1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "com.example.hw1.beans")
@Configuration
@Import(OtherConfig.class)
public class BeansConfig {
}
