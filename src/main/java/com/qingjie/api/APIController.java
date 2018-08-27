package com.qingjie.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingjie.client.UserClient;
import com.qingjie.dto.UserResponse;

@RestController
public class APIController {

	@Autowired
	private UserClient userClient;

	@GetMapping("/user/hello")
	public Map<String, String> sayHello() {
		return userClient.sayHello();
	}

}
