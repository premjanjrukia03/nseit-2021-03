package com.nseindia.b2.webapp.clirunners;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nseindia.b2.webapp.entities.Author;
import com.nseindia.b2.webapp.repositories.Repository;

@Component
public class Bootstrap implements CommandLineRunner {
	@Autowired
	Repository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Author author = new Author();
		author.setName("TestNmae");
		
		repo.save(author);

	}

}
