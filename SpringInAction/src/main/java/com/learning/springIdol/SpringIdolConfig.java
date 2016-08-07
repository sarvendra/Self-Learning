package com.learning.springIdol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {
    // beans declaration
    @Bean
    public Performer duke() {
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("panda");
        return kenny;
    }

    @Bean
    public Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer carl() {
        return new PoeticJuggler(sonnet29());
    }
}
