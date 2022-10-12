package com.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.Credentials;
import com.admin.service.AdminServices;

@RestController 
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminServices service;
	
	@PostMapping("/signin")
	public boolean signin(@RequestParam String uName,@RequestParam String pass) {
		
		Credentials c=service.readByUname(uName);
		if(c.getuName().matches(uName)&&c.getPass().matches(pass)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "Test";
	}
}
