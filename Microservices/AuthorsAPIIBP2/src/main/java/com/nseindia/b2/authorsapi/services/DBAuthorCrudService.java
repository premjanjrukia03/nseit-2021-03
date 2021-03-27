package com.nseindia.b2.authorsapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nseindia.b2.authorsapi.entities.Author;
import com.nseindia.b2.authorsapi.repositories.AuthorRepository;

@Service
public class DBAuthorCrudService implements AuthorService {
	
	@Autowired
	AuthorRepository authorRepo;
//		We have three operations that can be used for CRUD
//		authorRepo.save(null)  // This behaves both as Create and update
	//  With GeneratedValue we have made save to just add new values.
//		authorRepo.deleteById(null);
//		authorRepo.findById(null)
	@Override
	public Author add(Author author) {
		// This will not cause update to trigger, as null is something that jpa will not find in the db.
		// this is not a best practice, you should create a request model which doesn't include the id field.
		// Ids should always be immutable, you can delete them, but you should never update them.
		author.setId(null);
		return authorRepo.save(author);
	}

	@Override
	public List<Author> readAll() {
		List<Author> list = new ArrayList<Author>();
		authorRepo
			.findAll()
			.forEach(a ->{
					list.add(a);
				});
		return list;
	}

	@Override
	public Author read(Long id) {
		// Optional<Author> needs to know what to return if no Author with the given id is found
		// .orElse(value) will return the value if no Author is found
//		Author author = authorRepo.findById(id).orElse(new Author());
		Author author = authorRepo.findById(id).orElse(null);
		return author;
	}

	@Override
	public Author delete(Long id) {
		Author author = authorRepo.findById(id).orElse(null);
		// Books is not loaded because of lazy loading
		if (author!=null) {
			authorRepo.deleteById(id);
			// this might cause issues with lazy fetching
			return author;
		}
		
		return null;
	}

	@Override
	public Author update(Long id, Author author) {
		Author a = authorRepo.findById(id).orElse(null);
		 
		if (a!=null) {
			if(author.getName()!=null) {
				a.setName(author.getName());
			}
			if(author.getGenre()!=null) {
				a.setGenre(author.getGenre());
			}
			if (author.getBooks()!=null) {
				a.setBooks(author.getBooks());
			}
			return authorRepo.save(a);
		}
		 
		return null;
		
	}

}
