package com.admin.repository;

import org.springframework.data.repository.CrudRepository;

import com.admin.model.UserRequests;

public interface RequestRepository extends CrudRepository<UserRequests, Long>{

}
