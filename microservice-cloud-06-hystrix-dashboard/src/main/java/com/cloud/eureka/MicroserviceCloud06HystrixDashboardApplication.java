package com.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class MicroserviceCloud06HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCloud06HystrixDashboardApplication.class, args);
	}

}
