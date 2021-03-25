package com.nseindia.b2.authorservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nseindia.b2.authorservice.entities.Author;
import com.nseindia.b2.authorservice.repositories.Repository;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	Repository repo;

	@Override
	public List<Author> readAll() {
		List<Author> authorList = new ArrayList<Author>();

		repo.findAll().forEach(a -> {
			authorList.add(a);
		});

		return authorList;
	}

	
	@Override
	public Author read(Long id) {
		Author author = new Author();
		author = repo.findById(id).orElse(null);

		return author;
	}

	@Override
	public Author add(Author author) {
		author.setId(null);
		author = repo.save(author);
		return author;
	}

	@Override
	public Author update(Long id, Author author) {

		Author a = repo.findById(id).orElse(null);

		if (a != null) {
			if (author.getBooks()!=null) {
				a.setBooks(author.getBooks());
			} 
			if (author.getName()!=null) {
				a.setName(author.getName());
			}
			
			repo.save(a);
			return a;
		}
		return null;

	}

	@Override
	public Author delete(Long id) {
		Author author=repo.findById(id).orElse(null);
		
		if (author!=null) {
			repo.deleteById(id);
		}
		
		return author;
	}

}
