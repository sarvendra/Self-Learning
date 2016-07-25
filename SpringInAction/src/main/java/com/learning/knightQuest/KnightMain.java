package com.learning.knightQuest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Knight.xml");
        Knight knight = (Knight)context.getBean("knight");
        knight.embarkOnQuest();
    }
}
