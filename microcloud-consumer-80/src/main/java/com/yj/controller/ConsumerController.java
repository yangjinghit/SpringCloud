package com.yj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	//	public static final String URL ="http://yangjing:Asdf12345@127.0.0.1:8001/dept";

	public static final String URL ="http://127.0.0.1:8001/dept";
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private HttpHeaders headers;
	
	@RequestMapping("/consumer/dept")
	public String getDept() {
	
		//String dept = this.restTemplate.getForObject(URL, String.class);
		
		String dept = this.restTemplate.exchange(URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), String.class)
				.getBody();
		return dept;
	
		
	}
	

}
