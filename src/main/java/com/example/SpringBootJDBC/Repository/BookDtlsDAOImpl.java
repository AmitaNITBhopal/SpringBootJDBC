package com.example.SpringBootJDBC.Repository;


import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.SpringBootJDBC.model.BookDtls;

@Repository
public class BookDtlsDAOImpl implements BookDtlsDAO {
	
	
	  @Autowired 
	  public JdbcTemplate jdbctemplate;
	 	
	@Override
	public List<BookDtls> Get(int id) { 
		System.out.println("inside Get");
		String str = "select * from BookDtls where id=?"; 
		
		BookDtlsMapper bookDtlsMapper = new BookDtlsMapper();
		
		List<BookDtls> list = (List<BookDtls>) jdbctemplate.query(str, bookDtlsMapper, id);
		return list;
	  }
	 

	@Override
	public int create(String title, boolean status) { 
		System.out.println("inside create");
		String str = "Insert into BookDtls (title, status) values (?,?)"; 
		int rows = jdbctemplate.update(str, title, status); 
		System.out.println("Rows effected " + rows);
		return rows;
	}
	
	public int updateTitle(String title, int id) {
		System.out.println("inside update");
		String str = "update BookDtls set title = ? where id = ?"; 
		int rows = jdbctemplate.update(str, title, id); 
		System.out.println("Rows effected " + rows);
		return rows;
	}
	
	public int create(String title, boolean status, LocalDate date) { 
		System.out.println("inside create with date");
		String str = "Insert into BookDtls (title, status, publishdate) values (?,?,?)"; 
		int rows = jdbctemplate.update(str, title, status, date); 
		System.out.println("Rows effected " + rows);
		return rows;
	}
}
