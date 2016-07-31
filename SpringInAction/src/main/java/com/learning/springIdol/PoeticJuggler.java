package com.learning.springIdol;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanbags, Poem poem) {
        super(beanbags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("while juggling he recites ..");
        poem.recite();
    }
}
