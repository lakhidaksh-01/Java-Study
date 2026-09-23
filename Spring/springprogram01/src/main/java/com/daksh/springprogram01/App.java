package com.daksh.springprogram01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.daksh.springprogram01.entities.*;
import com.daksh.springprogram01.config.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student std=context.getBean(Student.class);
		ApplicationContext context2=new AnnotationConfigApplicationContext(AppConfig.class);
		Student std2=(Student)context2.getBean("student");
	    std2.setName("kamal");
	    std2.setAge(19);
	    std2.setCity("New York");
	    std2.print();
    }
}
