package com.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.model.UserCredentials;
import com.user.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	UserRepository Repo;
	
	public boolean login(String email, String pass) {
		UserCredentials uCred= Repo.findByEmail(email);
		if(uCred==null)
		{
			return false;
		}
		if(uCred.getEmail().matches(email)&&uCred.getPass().matches(pass))
		{
			return true;
		}
		else
			return false;
		
	}
	public boolean register(UserCredentials uCred) {
		Repo.save(uCred);
		return true;
	}
	public Iterable<UserCredentials> getAll(){
		return Repo.findAll();
	}

}
