package com.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("guitar")
public class Guitar implements IInstrument{
    @Override
    public String toString() {
        return "Guitar{}";
    }
}
