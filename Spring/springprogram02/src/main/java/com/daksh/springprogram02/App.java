package com.daksh.springprogram02;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.daksh.springprogram02.enities.*;
import com.daksh.springprogram02.config.*;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student st=context.getBean(Student.class);
        st.setAge(21);
        st.setCity("mohali");
        st.setName("Daksh Lakhi");
        st.print();
    }
}
