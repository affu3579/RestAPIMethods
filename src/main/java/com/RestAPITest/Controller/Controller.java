package com.RestAPITest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPITest.Entity.BookStoreEntity;
import com.RestAPITest.Service.ServiceBook;

@RestController
public class Controller {
	@Autowired
	private ServiceBook service;
	
	//get all books
	@GetMapping("/bookstore")
	public List<BookStoreEntity> getData() {
		
	return this.service.getBookStoreData();
	}
	
	//get specific book
	@GetMapping("/bookstore/{id}")
	public BookStoreEntity getOneBook(@PathVariable("id")int id) {
		return this.service.getBookById(id);
	}
	
	//add book
	@PostMapping("/bookstore")
	public BookStoreEntity addBooks(@RequestBody BookStoreEntity b) {
		BookStoreEntity book=this.service.addBook(b);
		System.out.println(b);
		return book;
		
	}
	
	//delete book by id
	@DeleteMapping("/bookstore/{bookId}")
	public void  deleteBook(@PathVariable("bookId") int bookId) {
		
		this.service.deleteBoodById(bookId);
	}
	
	//update book
	@PutMapping("/bookstore/{bookid}")
	public void updateBook(@RequestBody BookStoreEntity book ,@PathVariable("bookid") int bookid) {
		//TODO: process PUT request
	this.service.updateBook(book,bookid);
		
	}
	
}
