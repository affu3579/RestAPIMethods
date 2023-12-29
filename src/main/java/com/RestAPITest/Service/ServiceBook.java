package com.RestAPITest.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
     public BookStoreEntity addBook(BookStoreEntity book2) {
    	 book.add(book2);
    	return book2;
     }
     
     
     public void deleteBoodById(int bookId) {
    	 
    	book= book.stream().filter(book->book.getId() != bookId).collect(Collectors.toList());
     }

	public void updateBook(BookStoreEntity book2 , int bookid) {
		// TODO Auto-generated method stub
		
	book=book.stream().map(book->{
			if(book.getId()==bookid) {
				book.setTitleName(book2.getTitleName());
				book.setAuthorName(book2.getAuthorName());
		
			}
			return book	;
		}).collect(Collectors.toList());
		
	}
     
     
}
