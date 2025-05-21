package com.example.SpringBootJDBC.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootJDBC.Repository.BookDtlsDAOImpl;
import com.example.SpringBootJDBC.model.BookDtls;

@RestController
@RequestMapping("/BookDtls")
public class BookDtlsController {

	
	  @Autowired 
	  BookDtlsDAOImpl bookDtlsDAOImpl;
	  
	  @GetMapping("/str") 
	  public String GetStr() 
	  { 
		  return "abc";
	  }
	  
	  @GetMapping("/{id}") 
	  public List<BookDtls> Get(@PathVariable int id) 
	  { 
		  return bookDtlsDAOImpl.Get(id);
	  }
	  
	  @PostMapping("/in") 
	  public void postBookDtls(@RequestBody BookDtls bd) {
		  System.out.println("inside postBookDtls bd is " + bd);
		  bookDtlsDAOImpl.create(bd.getTitle(), 0); 
		  //return null; 
		  //bookDtlsDAOImpl.create("title1", 0);
	  }
	  
	  @PostMapping("/intest") 
	  public void postBookDtls() {
		  System.out.println("inside postBookDtls ");
		  bookDtlsDAOImpl.create("kkj", 0); 
		  //return null; 
		  //bookDtlsDAOImpl.create("title1", 0);
	  }
	 
}
