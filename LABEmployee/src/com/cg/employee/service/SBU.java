package com.cg.employee.service;

public class SBU {

	int sbuId;
	String sbuName;
	String sbuHead;
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public void getSBU()
	{
		System.out.println("SBUId:"+sbuId);
		System.out.println("SbuName:"+sbuName);
		System.out.println("SbuHead:"+sbuHead);
	}
	
}
