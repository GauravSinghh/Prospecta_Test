package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Book;
import com.masai.entity.BookDTO;
import com.masai.service.BookService;
import com.masai.service.BookServiceImpl;

@RestController
public class BookController {

	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@GetMapping("/getList/{category}")
	public ResponseEntity<List<BookDTO>> getListByCategoryHandler(@RequestParam String category){
		return new ResponseEntity<List<BookDTO>>(bookServiceImpl.getListByCategory(category),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Book> savebookHandler (@RequestBody Book book){
		return new ResponseEntity<Book>(bookServiceImpl.saveBook(book),HttpStatus.ACCEPTED);
	}
	
}
