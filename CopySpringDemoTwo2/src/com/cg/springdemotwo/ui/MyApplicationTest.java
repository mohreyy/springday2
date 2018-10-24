package com.cg.springdemotwo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springdemotwo.service.MobileServiceImpl;



public class MyApplicationTest {

	public static void main(String args[])
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		        MobileServiceImpl mob=(MobileServiceImpl) app.getBean("mobileservice");
				mob.getAllMobile();
		
		
	}
}
