package com.yj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yj.Dept;
import com.yj.service.IDeptService;
import com.yj.service.impl.DeptServiceImpl;

@RestController
public class DeptController {
	
	@RequestMapping("/dept/sessionId")
	public Object id(HttpServletRequest request) {
		
		return request.getSession().getId();
	}
	//private IDeptService deptService = new DeptServiceImpl();
	
	@RequestMapping("/dept")
	public String get() {
		
		return "dept";
		
	}
	
	

}
