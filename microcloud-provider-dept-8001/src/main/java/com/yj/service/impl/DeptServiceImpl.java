package com.yj.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yj.Dept;
import com.yj.dao.IDeptDao;
import com.yj.dao.impl.DeptDaoImpl;
import com.yj.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService{

	private IDeptDao deptDAO = new DeptDaoImpl();
	
	@Override
	public Dept get(long id) {
		// TODO Auto-generated method stub
		
		
		return this.deptDAO.findById(id);
	}

}
