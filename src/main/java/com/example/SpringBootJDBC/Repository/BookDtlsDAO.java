package com.example.SpringBootJDBC.Repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.SpringBootJDBC.model.BookDtls;


public interface BookDtlsDAO {
	
	public List<BookDtls> Get(int id);
	public int create(String title, boolean status);
}
