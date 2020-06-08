package com.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.application")
@ImportResource("classpath:application-context.xml")
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

    @Bean
    public AspectInterceptor aspectInterceptor(){
        return new AspectInterceptor();
    }
}
