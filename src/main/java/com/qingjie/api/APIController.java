package com.qingjie.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingjie.client.UserClient;
import com.qingjie.dto.UserResponse;

@RestController
public class APIController {

	@Autowired
	private UserClient userClient;

	@GetMapping("/findAllUsers")
	public List<UserResponse> getAllUsers() {
		return userClient.getUsers();
	}

}
