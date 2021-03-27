package com.nseindia.b2.authorsapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nseindia.b2.authorsapi.entities.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{

}
