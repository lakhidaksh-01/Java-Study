package com.daksh.springprogram04;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.daksh.springprogram04.config.SpringConfig;
import com.daksh.springprogram04.entities.*;
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Restaurant r = context.getBean(Restaurant.class);
        r.setName("punabi dhaba ");
        Chef ch=context.getBean(Chef.class);
        ch.setName("daksh");
        ch.setExperience(2);
        r.print();
    }
}
