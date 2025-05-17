package com.example.SpringBootJDBC;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


public interface BookDtlsDAO {
	
	public BookDtls Get(int id);
	public int create(String title, int status);
}
