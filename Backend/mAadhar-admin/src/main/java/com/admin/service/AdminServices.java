package com.admin.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.engine.internal.Nullability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.CardDetails;
import com.admin.model.Credentials;
import com.admin.repository.AdminRepository;
import com.admin.repository.CardRepository;

@Service
public class AdminServices {
	
	@Autowired
	AdminRepository Repo;
	
	@Autowired
	CardRepository cardRepo;
	
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
	
	public void addCard(CardDetails data) {
		cardRepo.save(data);
	}
	public List<CardDetails> PendingReq(){
		return cardRepo.findByState("Pending");
	}
	
	public List<CardDetails> ApprovedReq(){
		return cardRepo.findByState("Approved");
	}
}
