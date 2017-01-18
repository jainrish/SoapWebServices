package com.soap.service.impl;

import javax.jws.WebService;

import com.soap.model.Book;
import com.soap.service.LibraryService;

@WebService(endpointInterface="com.soap.service.LibraryService", serviceName="libraryService")
public class LibraryServiceImpl implements LibraryService{

	@Override
	public int getBooksCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String insertBook(Book book) {
		// TODO Auto-generated method stub
		return "Book successfully inserted";
	}

	@Override
	public String removeBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
