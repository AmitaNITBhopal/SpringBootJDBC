package com.example.SpringBootJDBC;

import java.sql.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BookDtls {
	int id;
	boolean status;
	String title;
	Date PublishDate;
}
