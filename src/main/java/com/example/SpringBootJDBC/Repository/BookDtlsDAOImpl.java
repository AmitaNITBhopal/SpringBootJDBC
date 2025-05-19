package com.example.SpringBootJDBC.Repository;


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
		String str = "select * from BookDtls where id=?"; 
		ArrayList arr = new ArrayList<Integer>();
		arr.add(id);
		
		BookDtlsMapper bookDtlsMapper = new BookDtlsMapper();
		
		List<BookDtls> list = (List<BookDtls>) jdbctemplate.query(str, arr.toArray(), bookDtlsMapper);
		return list;
	  }
	 

	@Override
	public int create(String title, int status) { 
		String str = "Insert into BookDtls (title, status) values (?,?)"; 
		int rows = jdbctemplate.update(str, title, status); 
		return rows;
	}
}
