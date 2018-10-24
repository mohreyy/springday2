package com.cg.springdemotwo.service;

import org.springframework.stereotype.Component;

@Component("mob")   //<bean id="" class=""></bean>
public class Mobile {
int mobileId;
String mobileName;
double mobprice;


public int getMobileId() {
	return mobileId;
}


public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}


public String getMobileName() {
	return mobileName;
}


public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}


public double getMobprice() {
	return mobprice;
}


public void setMobprice(double mobprice) {
	this.mobprice = mobprice;
}


public void printMobileDetails()
{
	//System.out.println("Id is" +mobileId+ " Name is " +mobileName+" "+ "mobile price" +" "+ mobprice);
	System.out.println("In Mobile data");

	
	
}
}
