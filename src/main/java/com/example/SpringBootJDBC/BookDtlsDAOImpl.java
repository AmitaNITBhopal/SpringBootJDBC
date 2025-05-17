package com.example.SpringBootJDBC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDtlsDAOImpl implements BookDtlsDAO {
	
	
	  @Autowired 
	  public JdbcTemplate jdbctemplate;
	 	
	@Override
	public BookDtls Get(int id) { 
		String str = "select * from BookDtls where id=1"; 
		//jdbctemplate.query(str); 
		return null;
	  }
	 

	@Override
	public int create(String title, int status) { 
		String str = "Insert into BookDtls (title, status) values (?,?)"; 
		int rows = jdbctemplate.update(str, title, status); 
		return rows;
	}
}
