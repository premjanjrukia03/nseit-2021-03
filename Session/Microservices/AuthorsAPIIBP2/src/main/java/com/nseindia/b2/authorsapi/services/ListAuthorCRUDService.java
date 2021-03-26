package com.nseindia.b2.authorsapi.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.nseindia.b2.authorsapi.entities.Author;

// This service implementation provides services related to CRUD operations on a List of Authors
@Service
public class ListAuthorCRUDService implements AuthorService {

	List<Author> authorList = new ArrayList<Author>();
	AtomicInteger idCount = new AtomicInteger(0);

	@Override
	public Author add(Author author) {
		// TODO Validations
		// TODO Proper Response if not able to add an author
		author.setId((long) idCount.getAndIncrement());
		
		authorList.add(author);
		return author;
	}

	@Override
	public List<Author> readAll() {
		return authorList;
	}

	@Override
	public Author read(Long id) {

		// The following sorts the authorList because of Comparable implementation
		Collections.sort(authorList);
		Author a = new Author();
		a.setId(id);

		int i = Collections.binarySearch(authorList, a);

		if (i >= 0) {
			return authorList.get(i);
		}

		return null;
	}

	@Override
	public Author delete(Long id) {
		Collections.sort(authorList);
		Author a = new Author();
		a.setId(id);

		int i = Collections.binarySearch(authorList, a);

		if (i >= 0) {
			return authorList.remove(i);
		}
		return null;
	}

	@Override
	public Author update(Long id, Author author) {
		Collections.sort(authorList);
		Author a = new Author();
		a.setId(id);

		int i = Collections.binarySearch(authorList, a);

		if (i >= 0) {
			if (author.getId() != null)
				authorList.get(i).setId(author.getId());

			if (!author.getBooks().isEmpty())
				authorList.get(i).setBooks(author.getBooks());

			if (author.getGenre() != null)
				authorList.get(i).setGenre(author.getGenre());

			if (author.getName() != null)
				authorList.get(i).setName(author.getName());

			return authorList.get(i);
		}
		
		return null;
	}

}
