package com.cg.springdemotwo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemotwo.service.Mobile;

public class MyApplicationTest {

	public static void main(String args[])
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		
		Mobile mobile=(Mobile) app.getBean("mob");
		mobile.printMobileDetails();
	}
}
