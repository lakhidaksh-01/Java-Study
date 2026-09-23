package com.daksh.springprogram03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.daksh.springprogram03.config.SpringConfig;
import com.daksh.springprogram03.entities.Restaurant;

public class App {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Restaurant r = context.getBean(Restaurant.class);

        r.print();
    }
}