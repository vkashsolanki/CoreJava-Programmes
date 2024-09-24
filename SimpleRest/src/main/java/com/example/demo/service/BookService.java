package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	//saving a specific record by using the method save() of CrudRepository  
	public void saveBook(Book book) {
		bookRepository.save(book);
	}
	
	
	////getting all books record by using the method findaAll() of CrudRepository  
	
	public List<Book> getAllbook() {
		
	List<Book> list = new ArrayList<Book>();
	bookRepository.findAll().forEach(b -> list.add(b));
	
		return list;
	}
	
	// //saving a specific record by using the method save() of CrudRepository  
	
	public void saveUpdateBook(Book book)
	{
	bookRepository.save(book);	
	}
	
	
	
	// update a record
	public void updateBook(Book book, int bookId)
	{
		bookRepository.save(book);
	}
	//delete a record
	public void delete(int id)   
	{  
	bookRepository.deleteById(id);  
	}  
	
	//getting a specific record by using the method findById() of CrudRepository  
	public Book getBooksById(int bookId)   
	{  
	return bookRepository.findById(bookId).get();  
	}  
	
	
}
