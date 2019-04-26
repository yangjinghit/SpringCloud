package com.yj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com/yj/service")
@EnableEurekaClient
@SpringBootApplication
public class MicrocloudConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocloudConsumerFeignApplication.class, args);
	}

}
