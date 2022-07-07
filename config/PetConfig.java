package com.example.hw1.config;

import com.example.hw1.animal.Cheetah;
import com.example.hw1.animal.Spider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"com.example.hw1.animal"}, excludeFilters =
@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class))
@Configuration
public class PetConfig {
    @Bean
    @Primary
    public Cheetah cheetah1() {
        return new Cheetah();
    }

    @Bean
    @Qualifier()
    public Cheetah cheetah2() {
        return new Cheetah();
    }
}
