package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
//@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	

	//creating post mapping that post the book detail in the database  
	@PostMapping("/sas")
	public int saveBookdb(@RequestBody Book book) {
		bookService.saveBook(book);
		
		return book.getBookId();
		
	}
	
	@GetMapping("/getAll")
	public List<Book> getAllBooks(){
		return bookService.getAllbook();
		
	}
	
	
	@DeleteMapping("/book/{bookId}")  
	private void deleteBook(@PathVariable("bookId") int bookId)   
	{  
	bookService.delete(bookId);  
	}  
	
	
//	@PutMapping("/updatebook")
//	public void updateBooks(@RequestBody Book book) {
//		bookService.sa
//		
//	}
	
	@PutMapping("updateBook")
	public Book updateBook(@RequestBody Book book)
	{
		bookService.saveUpdateBook(book);
		return book;
	}
	
	
	
	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/book/{bookId}")  
	private Book getBooks(@PathVariable("bookId") int bookId)   
	{  
	return bookService.getBooksById(bookId);
	}  
	
	
	
}
