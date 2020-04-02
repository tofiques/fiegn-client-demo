package com.tofique.feign.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.tofique.feign.demo.domian.UserResponse;

@FeignClient(url="${json.server}",name="USER-CLIENT")
public interface UserClient {
	
	@GetMapping("/users")
	public List<UserResponse> getAllUsers();

}
