package com.RestAPITest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPITest.Entity.BookStoreEntity;
import com.RestAPITest.Service.ServiceBook;

@RestController
public class Controller {
	@Autowired
	private ServiceBook service;
	@GetMapping("/bookstore")
	public List<BookStoreEntity> getData() {
		
	return this.service.getBookStoreData();
	}
	
	@GetMapping("/bookstore/{id}")
	public BookStoreEntity getOneBook(@PathVariable("id")int id) {
		return this.service.getBookById(id);
	}
	
	

}
