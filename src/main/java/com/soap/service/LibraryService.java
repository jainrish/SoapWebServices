package com.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.model.Book;

@WebService
public interface LibraryService {
	
	@WebMethod
	public int getBooksCount();
	
	@WebMethod
	public String insertBook(Book book);
	
	@WebMethod
	public String removeBook(int bookId);
}
