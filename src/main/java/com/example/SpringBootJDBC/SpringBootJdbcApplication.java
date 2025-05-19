package com.example.SpringBootJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.SpringBootJDBC.Repository.BookDtlsDAOImpl;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		//context.getBean(BookDtls.class);
		//context.getBean("bookDtls");
		BookDtlsDAOImpl bookDtlsDAO = context.getBean(BookDtlsDAOImpl.class);
		//bookDtlsDAO.create("x", 0);
		System.out.println(bookDtlsDAO.Get(1).get(0));
	}

}
