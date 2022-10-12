package com.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.model.UserCredentials;

@Repository
public interface UserRepository extends CrudRepository<UserCredentials, Long>{

	UserCredentials findByEmail(String email);

}
