package com.admin.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.engine.internal.Nullability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.model.Credentials;
import com.admin.repository.AdminRepository;

@Service
public class AdminServices {
	
	@Autowired
	AdminRepository Repo;
	
	public void create(Credentials cred) {
		Repo.save(cred);		
	}
	
	public List<Credentials> readAll(){
		return (List<Credentials>) Repo.findAll();
	}
	
	public Credentials read(String uName) {
		return Repo.findByuName(uName);
	}
	
}
