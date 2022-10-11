package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Credentials;

@Repository
public interface AdminRepository extends CrudRepository<Credentials, Long> {

	Credentials findByUname(String uname);

}
