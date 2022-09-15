package com.application;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class CouponServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouponServicesApplication.class, args);
		
		System.out.println("Coupon Service Started..!!!");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
