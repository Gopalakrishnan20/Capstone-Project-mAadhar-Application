package com.admin.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.engine.internal.Nullability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.CardDetails;
import com.admin.model.Credentials;
import com.admin.model.UserRequests;
import com.admin.repository.AdminRepository;
import com.admin.repository.CardRepository;
import com.admin.repository.RequestRepository;

@Service
public class AdminServices {
	
	@Autowired
	AdminRepository Repo;
	
	@Autowired
	CardRepository cardRepo;
	
	@Autowired
	RequestRepository reqRepo;
	
	public void create(Credentials cred) {
		Repo.save(cred);		
	}
	
	public List<Credentials> readAll(){
		return (List<Credentials>) Repo.findAll();
	}
	
	public Credentials read(String uName) {
		return Repo.findByuName(uName);
	}
	
	public List<CardDetails> getAllCards(){
		return (List<CardDetails>) cardRepo.findAll();
	}
	
	public void updateCardDetails(CardDetails newCardData) {
		Optional<CardDetails> oldData=cardRepo.findById(newCardData.getCitizenId());
		cardRepo.save(newCardData);
	}
	
	public boolean deleteCard(long citizenId) {
		cardRepo.deleteById(citizenId);
		return true;
	}
	
	public boolean addCard(CardDetails data) {
		cardRepo.save(data);
		return true;
	}
	public List<CardDetails> PendingReq(){
		return cardRepo.findByState("Pending");
	}
	
	public List<CardDetails> ApprovedReq(){
		return cardRepo.findByState("Approved");
	}
	public long find(String name) {
		return cardRepo.findByName(name).getCitizenId();
		
	}
	public Iterable<UserRequests> allUserRequests() {
		return reqRepo.findAll(); 		
	}
	public boolean submitRequest(UserRequests req) {
		reqRepo.save(req);
		return true;
	}
	public List<UserRequests> viewPending(){
		return reqRepo.findByReqState("Pending");
	}
	
}
