package com.example.SpringBootJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		//context.getBean(BookDtls.class);
		//context.getBean("bookDtls");
		BookDtlsDAOImpl bookDtlsDAO = (BookDtlsDAOImpl) context.getBean("bookDtlsDAOImpl");
		bookDtlsDAO.create("x", 0);
	}

}
