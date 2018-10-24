package com.cg.springdemotwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cg.springdemotwo.dao.IMobileDao;

@Service("mobileservice")
public class MobileServiceImpl implements IMobileService {
	
	@Autowired
	IMobileDao mobiledao;         //interface name and mobile id
    @Value("LG")
	String MobileName;
	
	public void setMobileName(String mobileName) {
		MobileName = mobileName;
	}

	@Override
	public void getAllMobile() {
		
		System.out.println("Mobile Service Impl");
		System.out.println("Mobile Service Impl"+ " "+MobileName);
	    mobiledao.getAllDaoMobile();
	}
	

}
