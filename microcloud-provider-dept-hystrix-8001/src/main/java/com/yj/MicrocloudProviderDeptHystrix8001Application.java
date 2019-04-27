package com.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@EnableEurekaClient
@SpringBootApplication
public class MicrocloudProviderDeptHystrix8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicrocloudProviderDeptHystrix8001Application.class, args);
	}

}
