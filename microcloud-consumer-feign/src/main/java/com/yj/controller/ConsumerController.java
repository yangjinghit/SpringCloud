package com.yj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yj.Student;
import com.yj.service.ProduceClientService;

@RestController
public class ConsumerController {
	

	@Autowired
	ProduceClientService service;
	
	@RequestMapping("/consumer/dept")
	public Object getDept() {
		
		return service.list();
	
		
	}
	

}
