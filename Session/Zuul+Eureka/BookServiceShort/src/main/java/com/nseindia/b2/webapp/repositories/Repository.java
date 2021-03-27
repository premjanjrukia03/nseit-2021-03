package com.nseindia.b2.webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nseindia.b2.webapp.entities.Book;

public interface Repository extends CrudRepository<Book, Long>{

}
