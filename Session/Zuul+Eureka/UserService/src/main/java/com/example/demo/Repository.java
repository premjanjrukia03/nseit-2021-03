package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.User;

public interface Repository extends CrudRepository<User, String>{

}
