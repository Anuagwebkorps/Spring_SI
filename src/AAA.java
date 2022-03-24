import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pp.Address;
import pp.Emps;

public class AAA {
           public static void main(String args[])
           {
        	   ApplicationContext ac=new ClassPathXmlApplicationContext("ap1.xml");
        	     Emps e=(Emps)ac.getBean("e");
        System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress());


        	        
           }
}
