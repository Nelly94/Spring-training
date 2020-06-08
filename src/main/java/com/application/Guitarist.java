package com.application;

public class Guitarist implements IMusician{

    private IInstrument instrument;

    public IInstrument getInstrument() {
        return instrument;
    }

    public void setInstrument(IInstrument instrument) {
        this.instrument = instrument;
    }

    public void play() {

    }
}
