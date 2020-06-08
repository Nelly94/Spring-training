package com.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guitarist implements IMusician{

    @Autowired
    private IInstrument instrument;

    /*public Guitarist(IInstrument instrument) {
        this.instrument = instrument;
    }*/

    public IInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    public void play() {
        System.out.println(instrument.toString());
    }
}
