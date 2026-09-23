package springprogram1.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springprogram1.entities.Student;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student std=context.getBean(Student.class);
		std.print();
	}
}
