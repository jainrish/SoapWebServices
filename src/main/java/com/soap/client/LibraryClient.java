package com.soap.client;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.soap.model.Book;
import com.soap.model.Library;
import com.soap.service.LibraryService;

public class LibraryClient {

	public static void main(String args[]) {
		String serviceUrl = "http://localhost:8080/SoapWebServices/services/libraryService";
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(LibraryService.class);
		factory.setAddress(serviceUrl);
		LibraryService libraryService = (LibraryService)factory.create();
		
		Book book = new Book();
		book.setAuthor("Jaggi Mathyr");
		book.setId(1234);
		book.setTitle("Mathematics");
		book.setPages(12);
		
		List<Book> booklist = new ArrayList<Book>();
		
		Library library = new Library();
		library.setBooksCount(1);
		library.setId(12);
		library.setBooks(booklist);
		
		System.out.println(libraryService.getBooksCount());
	}

}
