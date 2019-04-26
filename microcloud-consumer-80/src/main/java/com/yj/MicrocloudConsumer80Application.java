package com.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicrocloudConsumer80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicrocloudConsumer80Application.class, args);
	}

}
