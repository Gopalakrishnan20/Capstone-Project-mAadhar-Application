package com.admin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.admin.model.CardDetails;

public interface CardRepository extends CrudRepository<CardDetails,Long> {

	List<CardDetails> findByState(String string);

	CardDetails findByName(String name);

}
