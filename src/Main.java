import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import pp.Car;
import pp.Cars;
import pp.Emp;
//import pp.Emps;
//import pp.Trainer;
import pp.Emps;
import pp.Trainer;
import pp.Vendor;

public class Main {

	public static void main(String[] args) {
		/*1)setter injection using primitives
		ApplicationContext cx=new ClassPathXmlApplicationContext("ap.xml");
		Emp e=(Emp) cx.getBean("e");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getJob());*/
		
		//2)setter injection using dependent classes
		/*ApplicationContext cx=new ClassPathXmlApplicationContext("ap1.xml");
       Emps e=(Emps) cx.getBean("e");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getAddress());*/
		
		//3)setter injection using collection list with system defined objects
		/*ApplicationContext cx=new ClassPathXmlApplicationContext("ap2.xml");
		Trainer t=(Trainer) cx.getBean("t");
		t.show();*/
		
		//4)setter injection using collection list with user defined objects
		/*ApplicationContext cx=new ClassPathXmlApplicationContext("ap3.xml");
		Vendor v=(Vendor) cx.getBean("v");
		v.show();*/		
		
		//5)setter injection using collection Map with system defined objects
		/*ApplicationContext cx=new ClassPathXmlApplicationContext("ap4.xml");
		Car c=(Car) cx.getBean("c");
		c.show();*/
		//6)setter injection using collection Map with user defined objects
		ApplicationContext cx=new ClassPathXmlApplicationContext("ap5.xml");
		Cars c=(Cars) cx.getBean("c");
		c.show();


		
	}

}
