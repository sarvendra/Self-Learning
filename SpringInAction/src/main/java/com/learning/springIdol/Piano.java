package com.learning.springIdol;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("stringed")
public class Piano implements Instrument {
    public void play() {
        System.out.println("pin pin pin");
    }
}
