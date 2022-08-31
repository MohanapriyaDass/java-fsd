package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//       Airtel a=new Airtel();   //here we create object manually
//       a.typeOfSim();
//       a.dataTypeOfSim();
//       
//       Idea i=new Idea();
//       i.dataTypeOfSim();
//       i.typeOfSim();
    	
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	//Airtel ob=ac.getBean(Airtel.class); //calling bean class
    	//Airtel ob=(Airtel)ac.getBean("airtel"); //calling the bean id
//    	ob.dataTypeOfSim();
//    	ob.typeOfSim(); //request obj from design pattern
    	
    
    	
    	Airtel ob=ac.getBean(Airtel.class); //calling bean class
    	System.out.println(ob.getCost());
    	
    	Idea id=ac.getBean(Idea.class);
    	id.display();
    }
}
