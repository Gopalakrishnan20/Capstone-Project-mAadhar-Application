package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.UserCredentials;
import com.user.services.UserServices;

@RestController
@RequestMapping("/AadharApp")
public class UserController {
	
	@Autowired
	UserServices services;
	
	@PostMapping("/login")
	public boolean login(@RequestParam String email,@RequestParam String pass) {
		return services.login(email, pass);
	}
	
	@PostMapping("/register")
	public boolean register(@RequestBody UserCredentials uCred) {
		return services.register(uCred);
	}
	
	@PostMapping("/applyCard")
	public long applyCard(@RequestBody UserCredentials userCred) {
		return services.applyAadhar(userCred);
		
	}
	@PostMapping("/sendRequest")
	public boolean sendRequest(@RequestBody UserCredentials userCred,@RequestParam String reqName) {
		return services.sendRequest(userCred, reqName);
	}

}
