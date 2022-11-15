package com.masai.service;

import java.util.List;

import com.masai.entity.Book;
import com.masai.entity.BookDTO;

public interface BookService {

	public List<BookDTO> getListByCategory(String category);
	
	public Book saveBook(Book book);
	
}
