package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // retrieve beans
        Coach theCouch = context.getBean("myCricketCoach",CricketCouch.class);
        // call methods
        System.out.println(theCouch.getDailyWorkout());
        // close the context
        System.out.println(theCouch.getDailyFortune());
        context.close();
    }
}
