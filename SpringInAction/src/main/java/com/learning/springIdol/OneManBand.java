package com.learning.springIdol;

import java.util.Map;

public class OneManBand implements Performer {
    Map<String, Instrument> instruments;
    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments;
    }

    public OneManBand() {}

    public void perform() {
        for(String key : instruments.keySet()) {
            System.out.println("instrument " + key);
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }
}
