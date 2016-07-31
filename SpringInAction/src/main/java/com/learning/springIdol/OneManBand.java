package com.learning.springIdol;

import java.util.Collection;

public class OneManBand implements Performer {
    Collection<Instrument> instruments;
    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {}

    public void perform() {
        for(Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
