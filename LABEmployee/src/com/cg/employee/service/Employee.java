package com.cg.employee.service;

public class Employee extends SBU {
	
	int Id;
	String Name;
	int salary;
	int age;
	SBU BU;
	
	
	public SBU getBU() {
		return BU;
	}
	public void setBU(SBU bU) {
		this.BU = bU;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void getEmployee()
	{
		System.out.println("Employe ID:"+Id);
		System.out.println("Employe Name:"+Name);
		System.out.println("Employe Salary:"+salary);
		//System.out.println("Employe BU:"+BU);
		System.out.println("Employe Age:"+age);
	}
	

}
