package com.learning.springIdol;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("longwire")
public class Saxophone implements Instrument {
    public void play() {
        System.out.println("peep tink tink");
    }
}
