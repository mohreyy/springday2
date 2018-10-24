package com.cg.employee.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employee.service.Employee;
import com.cg.employee.service.SBU;


public class Main {
	public static void main(String args[])
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		Employee employee=(Employee) app.getBean("emp");
		employee.getEmployee();
		
        SBU sbu=(SBU) app.getBean("sbucode");
        sbu.getSBU();
		
		
		
	}
}
