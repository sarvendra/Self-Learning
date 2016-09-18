package com.learning.springIdol;

public class Magician implements MindReader {
    private String thoughts;

    public void interceptThoughts(String thoughts){
        System.out.println("Magician is intercepting thinker's thoughts");
        this.thoughts = thoughts;
    }

    public String getThoughts(){
        return thoughts;
    }
}
