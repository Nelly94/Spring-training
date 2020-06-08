package com.application;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectInterceptor {

    @Pointcut("execution(* com.application.*.toString(..))")
    public void intercept(){

    }

    @Before("intercept()")
    public void interceptToString(){
        System.out.println("Intercept...");
    }

    @AfterReturning(pointcut="intercept()", returning="result")
    public void interceptorToStringReturning(String result){
        //System.out.println(result);
        System.out.println("An instrument is being played");
    }

    @Before("@annotation(com.application.MyAnnotation)")
    public void beforeAnnotation(){
        System.out.println("Hi from my annotation!");
    }
}
