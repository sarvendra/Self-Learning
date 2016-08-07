package com.learning.springIdol;

import org.springframework.beans.factory.annotation.Qualifier;

@KeysInstrument
public class Piano implements Instrument {
    public void play() {
        System.out.println("pin pin pin");
    }
}
