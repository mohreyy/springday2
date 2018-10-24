package com.cg.springdemotwo.service;

import java.util.List;

public class Mobile {
int mobileId;
String mobileName;
double price;
//Inventory invent;        //by ref
List<Inventory> invent;



//public Mobile(int mobId,String mobilename,double price) //by constructor
//{
//	
//	this.mobileId=mobId;
//	this.mobileName=mobilename;
//	this.price=price;
//	
//}

public void setInvent(List<Inventory> invent) {
	this.invent = invent;
}



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



public double getPrice() {
	return price;
}



public void setPrice(double price) {
	this.price = price;
}


//
//public Inventory getInvent() {            //for INventory invent
//	return invent;
//}
//
//
//
//public void setInvent(Inventory invent) {
//	this.invent = invent;
//}




public void printMobileDetails()
{
	System.out.println("Id is" +mobileId+ " Name is " +mobileName+" "+ "mobile price" +" "+ price);
	for(Inventory in:invent)
	{
	System.out.println("Mobile count is"+" "+in.mobileCount+" "+"Mobile Company is"+" "+in.mobileCompany);
	
	}
}
}
