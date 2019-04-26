package com.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicrocloudProviderDept8001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicrocloudProviderDept8001Application.class, args);
	}

}
