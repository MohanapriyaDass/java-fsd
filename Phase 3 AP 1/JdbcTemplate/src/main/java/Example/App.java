package example;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main( String[] args )
    {
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        Student s=ac.getBean(Student.class);
        StudentDAO dao=ac.getBean(StudentDAO.class);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the id value");
        s.setId(sc.nextInt());
        System.out.println("enter the name value");
        s.setName(sc.next());
        System.out.println("enter the email id");
        s.setEmail(sc.next());
        
        int row=dao.insert(s);
        if(row>0) {
        	System.out.println("insertion is successful");
        }
        else {
        	System.out.println("insertion failed");
        }
        
        
        //retrieve
        System.out.println();
        System.out.println();
        List<Student> r=dao.retrieve();
        for(Student ss:r) {
        	System.out.println(ss.getId()+" "+ss.getName()+" "+ss.getEmail());
        }
        
           
    }

}
