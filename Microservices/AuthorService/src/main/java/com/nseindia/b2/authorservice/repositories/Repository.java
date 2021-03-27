package com.nseindia.b2.authorservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nseindia.b2.authorservice.entities.Author;

public interface Repository extends CrudRepository<Author, Long>{

}
