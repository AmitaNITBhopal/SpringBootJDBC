package com.example.SpringBootJDBC.controller;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
		  bookDtlsDAOImpl.create(bd.getTitle(), false); 
		  //return null; 
		  //bookDtlsDAOImpl.create("title1", 0);
	  }
	  
	  @PostMapping("/intest") 
	  public void postBookDtls() {
		  System.out.println("inside postBookDtls ");
		  bookDtlsDAOImpl.create("default", true); 
		  //return null; 
		  //bookDtlsDAOImpl.create("title1", 0);
	  }
	  
	  @PostMapping("/inElements") 
	  public void postBookDtls(String title, boolean status, String dateStr) {
		  System.out.println("inside postBookDtls inElements datestr " + dateStr);
		  
		  DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate date = LocalDate.parse(dateStr, format);
		  System.out.println("date is " + date.toString());
		  bookDtlsDAOImpl.create(title, status, date); 
		  //return null; 
		  //bookDtlsDAOImpl.create("title1", 0);
	  }
	 
}
