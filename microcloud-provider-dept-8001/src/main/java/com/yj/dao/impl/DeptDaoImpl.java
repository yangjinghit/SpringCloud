package com.yj.dao.impl;

import com.yj.Dept;
import com.yj.dao.IDeptDao;

public class DeptDaoImpl implements IDeptDao{

	@Override
	public Dept findById(Long id) {
		Dept dept = new Dept();
		dept.setDeptno(100l);
		dept.setDbname("dbname");
		dept.setDname("yangjing");
		return dept;
	}

}
