package com.daksh.springprogram03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.daksh.springprogram03.entities.Cheif;
import com.daksh.springprogram03.entities.Restaurant;

@Configuration
public class SpringConfig {

    @Bean
    public Cheif cheif() {
        Cheif ch = new Cheif();
        return ch;
    }

    @Bean
    public Restaurant restaurant() {

        // Constructor Injection
        Restaurant res = new Restaurant(cheif());

        return res;
    }
}