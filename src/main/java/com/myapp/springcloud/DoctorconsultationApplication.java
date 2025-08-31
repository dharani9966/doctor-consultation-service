package com.myapp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DoctorconsultationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorconsultationApplication.class, args);
	}

}
