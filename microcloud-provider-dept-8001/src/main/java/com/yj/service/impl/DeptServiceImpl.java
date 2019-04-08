package com.yj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yj.Student;
import com.yj.dao.IDeptDao;
import com.yj.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService{

	@Autowired
	private IDeptDao deptDao;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return this.deptDao.findAll();
	}

}
