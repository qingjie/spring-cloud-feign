package com.qingjie.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.qingjie.dto.UserResponse;

@FeignClient(url = "http://localhost:8092/rest", name = "USER-CLIENT")
public interface UserClient {

	@GetMapping("/hello1")
	public Map<String, String> sayHello();
}
