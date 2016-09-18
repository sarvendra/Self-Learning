package com.learning.springIdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) context.getBean("kenny");
        Contestant contestant = (Contestant) performer;
        contestant.receiveAwards();
    }
}
