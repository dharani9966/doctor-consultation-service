package com.myapp.springcloud.restclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.myapp.springcloud.dto.Patient;

@FeignClient("API-GATEWAY-SERVICE-1")
public interface PatientRegRestClient {
	
	@GetMapping("/patient/{id}")
	Patient getpatientDetails(@PathVariable("id") int id);

}
