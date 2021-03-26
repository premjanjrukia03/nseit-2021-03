package com.nseindia.b2.bookservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nseindia.b2.bookservice.entities.Book;
import com.nseindia.b2.bookservice.repositories.Repository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	Repository repo;

	@Override
	public List<Book> readAll() {
		List<Book> bookList = new ArrayList<Book>();

		repo.findAll().forEach(a -> {
			bookList.add(a);
		});

		return bookList;
	}

	
	@Override
	public Book read(Long id) {
		Book book = new Book();
		book = repo.findById(id).orElse(null);

		return book;
	}

	@Override
	public Book add(Book book) {
		book.setId(null);
		book = repo.save(book);
		return book;
	}

	@Override
	public Book update(Long id, Book book) {

		Book b = repo.findById(id).orElse(null);

		if (b != null) {
			if(book.getAuthors()!=null) {
				b.setAuthors(book.getAuthors());
			}
			if(book.getTitle()!=null) {
				b.setTitle(book.getTitle());
			}
			if(book.getPublishDate()!=null) {
				b.setPublishDate(book.getPublishDate());
			}
			if(book.getEditions()!=null) {
				b.setEditions(book.getEditions());
			}
			
			repo.save(b);
			return b;
		}
		return null;

	}

	@Override
	public Book delete(Long id) {
		Book book=repo.findById(id).orElse(null);
		
		if (book!=null) {
			repo.deleteById(id);
		}
		
		return book;
	}

}
