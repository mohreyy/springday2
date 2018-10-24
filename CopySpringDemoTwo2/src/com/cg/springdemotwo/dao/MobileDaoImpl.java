package com.cg.springdemotwo.dao;

import org.springframework.stereotype.Repository;

@Repository("mobiledao")                                        //"mobiledao" is bean id name in mobile serviceimpl
public class MobileDaoImpl implements IMobileDao{

	@Override
	public void getAllDaoMobile() {
		System.out.println("dao");
		
	}

}
