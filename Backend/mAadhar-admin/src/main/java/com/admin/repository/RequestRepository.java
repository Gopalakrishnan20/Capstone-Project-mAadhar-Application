package com.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.admin.model.UserRequests;

public interface RequestRepository extends CrudRepository<UserRequests, Long>{

	List<UserRequests> findByReqState(String string);

}
