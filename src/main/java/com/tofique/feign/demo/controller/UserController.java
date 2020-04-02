package com.tofique.feign.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tofique.feign.demo.client.UserClient;
import com.tofique.feign.demo.domian.UserResponse;

@RestController

public class UserController {
	
	@Autowired
	private UserClient userClient;
	
	@GetMapping("/getAllUsers")
	public List<UserResponse> getAllUsers(){
		return userClient.getAllUsers();
	}
	
	
	
	

}
