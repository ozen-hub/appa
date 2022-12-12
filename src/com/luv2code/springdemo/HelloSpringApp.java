package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // load the spring configuration
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // retrieve beans
        Coach theCouch = context.getBean("myCouch",Coach.class);
        // call methods
        System.out.println(theCouch.getDailyWorkout());
        // close the context
        System.out.println(theCouch.getDailyFortune());
        context.close();
    }
}
