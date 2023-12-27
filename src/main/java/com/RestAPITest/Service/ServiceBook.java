package com.RestAPITest.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.RestAPITest.Entity.BookStoreEntity;
@Service
public class ServiceBook {

	private static List<BookStoreEntity> book=new ArrayList<>();
	static{
		book.add(new BookStoreEntity(10,"english","abc"));
		book.add(new BookStoreEntity(12, "maths", "bcd"));
		
	}
	public List<BookStoreEntity> getBookStoreData(){
		return book;
	}
	
	public BookStoreEntity getBookById(int id) {
		BookStoreEntity book1=null;
		book1=book.stream().filter(e->e.getId()==id).findFirst().get();
		return book1;
	}
	

}
