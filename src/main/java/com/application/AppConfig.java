package com.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.application")
public class AppConfig {

    @Bean
    public IInstrument guitar(){
        return new Guitar();
    }

    @Bean
    public IMusician guitarist(){
        return new Guitarist();
    }

    @Bean
    public IInstrument piano(){
        return new Piano();
    }

    @Bean
    public IMusician pianist(){
        return new Pianist();
    }
}
