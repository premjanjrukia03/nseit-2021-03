package com.nseindia.b2.bookservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nseindia.b2.bookservice.entities.Book;

public interface Repository extends CrudRepository<Book, Long>{

}
