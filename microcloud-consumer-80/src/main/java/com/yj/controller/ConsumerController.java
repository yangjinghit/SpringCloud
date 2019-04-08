package com.yj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	public static final String URL ="http://127.0.0.1:8001/dept";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/consumer/dept")
	public String getDept() {
	
		String dept = this.restTemplate.getForObject(URL, String.class);
		return dept;
	
		
	}
	

}
