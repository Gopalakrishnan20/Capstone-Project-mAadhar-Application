package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Credentials;
import com.app.repository.AdminRepository;

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
	
	public Optional<Credentials> read(long id) {
		return Repo.findById(id);
	}
	public Credentials readByUname(String uname) {
		return Repo.findByUname(uname);
	}

}
