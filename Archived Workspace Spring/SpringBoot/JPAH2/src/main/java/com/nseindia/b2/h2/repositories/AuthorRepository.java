package com.nseindia.b2.h2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nseindia.b2.h2.entities.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{
}
