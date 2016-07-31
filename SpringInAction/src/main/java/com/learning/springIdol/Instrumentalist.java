package com.learning.springIdol;

public class Instrumentalist implements Performer {
    private String song;
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
