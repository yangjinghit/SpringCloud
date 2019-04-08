package com.yj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yj.Dept;
import com.yj.service.IDeptService;
import com.yj.service.impl.DeptServiceImpl;

@RestController
public class DeptController {
	
	//private IDeptService deptService = new DeptServiceImpl();
	
	@RequestMapping("/dept")
	public String get() {
		
		return "dept";
		
	}

}
