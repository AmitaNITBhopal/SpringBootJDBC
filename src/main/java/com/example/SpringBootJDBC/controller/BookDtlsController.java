package com.example.SpringBootJDBC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootJDBC.Repository.BookDtlsDAOImpl;
import com.example.SpringBootJDBC.model.BookDtls;

@RestController
@RequestMapping("/BookDtls")
public class BookDtlsController {

	/*
	 * @Autowired BookDtlsDAOImpl bookDtlsDAOImpl;
	 * 
	 * @GetMapping() public BookDtls Get(@PathVariable("id")int id) { return
	 * bookDtlsDAOImpl.Get(id); }
	 * 
	 * @PostMapping() public void postBookDtls(@RequestParam("title", title)) {
	 * bookDtlsDAOImpl.create(title, status); //return null; }
	 */
}
