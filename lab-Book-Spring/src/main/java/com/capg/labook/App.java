package com.capg.labook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.labook.Employee;
import com.capg.labook.EmployeeConfiguration;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        
        Employee e=(Employee)context.getBean("emp");
        SBU sbu=e.getSbuDetails();
//        SBU sbu=(SBU)context.getBean("sbu");
        System.out.println("Employee Details.."+"\n ------------------------");
        System.out.println(e);
        System.out.println("SBU DEtails = "+sbu);
    }
}
