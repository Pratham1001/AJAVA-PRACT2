package student_pratham ;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("");
		Student s1 = (Student) ctx.getBean("studentBean");
		System.out.print(s1.toString());
    }
}