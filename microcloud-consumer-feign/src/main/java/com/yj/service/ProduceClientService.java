package com.yj.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PROVIDER-8001")
public interface ProduceClientService {

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public Object list() ;
}
