package com.yj.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yj.Dept;
import com.yj.Student;
import com.yj.service.IDeptService;
import com.yj.service.impl.DeptServiceImpl;

@RestController
public class DeptController {
	
	private static final Log log = LogFactory.getLog(DeptController.class);
	
	@Autowired
	private IDeptService deptService;
	
	@RequestMapping("/dept/sessionId")
	public Object id(HttpServletRequest request) {
		
		return request.getSession().getId();
	}
	//private IDeptService deptService = new DeptServiceImpl();
	
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public Object list() {
		if(log.isTraceEnabled()) {
			log.trace("=============/dept/list=======");
		}
		return this.deptService.findAll();
		
	}
	
	

}
