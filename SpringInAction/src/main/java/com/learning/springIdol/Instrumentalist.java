package com.learning.springIdol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Instrumentalist implements Performer {
    private String song;
    @Autowired(required = false)
    @StringedInstrument
    private Instrument instrument;

    public Instrumentalist() {}

    public void perform() {
        System.out.println("Playing " + song);
        instrument.play();
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
