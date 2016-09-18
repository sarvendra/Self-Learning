package com.learning.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        MindReader performer = (MindReader) context.getBean("magician");
        Thinker volunteer = (Thinker) context.getBean("volunteer");
        volunteer.thinkOfSomething("queen of hearts");
        System.out.println((performer.getThoughts()));
    }
}
