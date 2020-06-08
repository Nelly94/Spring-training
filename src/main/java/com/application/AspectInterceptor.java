package com.application;

public class AspectInterceptor {


    public void interceptToString(){
        System.out.println("Intercept...");
    }

    public void interceptorToStringReturning(String result){
        System.out.println("An instrument is being played");
    }
}
