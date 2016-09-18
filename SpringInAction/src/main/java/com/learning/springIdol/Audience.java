package com.learning.springIdol;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void takeSeats() {
        System.out.println("The audience is taking their seats");
    }

    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }

    public void applaud() {
        System.out.println("The audience is clapping CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        System.out.println("Boo! We want our money back");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats");
            System.out.println("The audience is turning off their cell phones");
            long start = System.currentTimeMillis();
            joinPoint.proceed();
            long end = System.currentTimeMillis();
            System.out.println("The performance took " + (end - start) + " milliseconds");
            System.out.println("The audience is clapping CLAP CLAP CLAP CLAP");
        } catch (Throwable t) {
            System.out.println("Boo! We want our money back");
        }
    }
}
