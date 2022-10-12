package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public boolean signin(@RequestBody Credentials cred) {
		
		Credentials c=service.read(cred.getuName());
		if(c.getuName().matches(cred.getuName()) && c.getPass().matches(cred.getPass())) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	@GetMapping("/test")
	public List<Credentials> test() {
		List<Credentials> a=service.readAll();
		return a;
	}
}
