package com.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("piano")
public class Piano implements IInstrument {
    @Override
    public String toString() {
        return "Piano{}";
    }
}
