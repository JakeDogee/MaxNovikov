package com.example.hw1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = "com.example.hw1.otherBean")
@Import(PetConfig.class)
public class OtherConfig {
}
