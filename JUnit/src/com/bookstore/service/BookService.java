package com.bookstore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookstore.model.Book;

public class BookService {

	private List<Book> listOfBook = new ArrayList<>();
	
	public void addBook(Book book) {
		listOfBook.add(book);
	}
	
	public List<Book> books(){
		return Collections.unmodifiableList(listOfBook);
	}
}
 