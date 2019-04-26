package com.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceCloud05Eureka6001Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCloud05Eureka6001Application.class, args);
	}

}
