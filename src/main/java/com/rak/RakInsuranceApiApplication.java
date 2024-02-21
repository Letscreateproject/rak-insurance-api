package com.rak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RakInsuranceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakInsuranceApiApplication.class, args);
	}

}
