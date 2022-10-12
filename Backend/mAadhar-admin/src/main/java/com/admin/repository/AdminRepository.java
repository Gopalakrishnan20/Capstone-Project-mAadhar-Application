package com.admin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.Credentials;

@Repository
public interface AdminRepository extends CrudRepository<Credentials, Long> {


	Credentials findByuName(String uName);

}