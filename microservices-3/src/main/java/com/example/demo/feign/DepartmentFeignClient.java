package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import feign.Headers;

@Headers("Content-Type : application/json")
@FeignClient(name="emp-ws",url="http://localhost:8080/api1/employees")
public interface DepartmentFeignClient {
	
	@GetMapping("api1/employees")
	String employeeResponse();

}
