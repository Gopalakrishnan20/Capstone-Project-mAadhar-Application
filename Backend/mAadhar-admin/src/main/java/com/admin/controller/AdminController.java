package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.CardDetails;
import com.admin.model.Credentials;
import com.admin.model.UserDetails;
import com.admin.model.UserRequests;
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
	
	@GetMapping("/allData")
	public List<CardDetails> viewAllData(){
		return service.getAllCards();
	}
	
	@GetMapping("/pending")
	public List<CardDetails> viewPendingCardReq(){
		
		return service.PendingReq();
		
	}
	
	@GetMapping("/approved")
	public List<CardDetails> viewApprovedCards(){
		
		return service.ApprovedReq();		
	}
	
	@GetMapping("/delete/{id}")
	public boolean deleteCard(@PathVariable long id) {
		return service.deleteCard(id);		
	}
	
	@PostMapping("/add")
	public boolean addData(@RequestBody CardDetails card) {
		service.addCard(card);
		return true;
	}
	@PostMapping("/updateCard/{id}")
	public void updateState(@RequestBody CardDetails newData) {
		service.updateCardDetails(newData);
	}
	
	@PostMapping("/applyCard")
	public Long applyCard(@RequestBody UserDetails data) {
		CardDetails application = new CardDetails();
		application.setName(data.getName());
		application.setAddress(data.getAddress());
		application.setDob(data.getDob());
		application.setEmail(data.getEmail());
		application.setGender(data.getGender());
		application.setMobile(data.getMobileNo());
		application.setState("Pending");
		service.addCard(application);
		return service.find(data.getName());
		
		
	}
	@PostMapping("/submitRequest")
	public boolean submitRequest(@RequestBody UserRequests req) {
		req.setReqState("Pending");
		return service.submitRequest(req);
	}
	
	
}
