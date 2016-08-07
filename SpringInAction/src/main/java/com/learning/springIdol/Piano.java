package com.learning.springIdol;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@KeysInstrument
public class Piano implements Instrument {
    public void play() {
        System.out.println("pin pin pin");
    }
}
