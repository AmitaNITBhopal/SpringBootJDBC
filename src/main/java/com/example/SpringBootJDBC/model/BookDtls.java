package com.example.SpringBootJDBC.model;

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
	
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(Date publishDate) {
		PublishDate = publishDate;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return title;
	}
	
}
