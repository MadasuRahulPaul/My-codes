package com.application;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FoodItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodItemServiceApplication.class, args);
		
		System.out.println("Food Item Service Started...!!!");
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	//@Bean
	//@LoadBalanced
	//public RestTemplate restTemplate() {
		//return new RestTemplate();
	//}
}

