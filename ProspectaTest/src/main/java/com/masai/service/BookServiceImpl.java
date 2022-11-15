package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Book;
import com.masai.entity.BookDTO;
import com.masai.repositary.BookDao;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<BookDTO> getListByCategory(String category) {
		List<Book> bookList = bookDao.findAll();
		List<BookDTO> bookdtoList =new ArrayList<>();
		for (Book book : bookList) {
			if(book.getCategory().equals(category)) {
				BookDTO bookdto = new BookDTO(book.getTitle(), book.getDescription());
				bookdtoList.add(bookdto);
			}
		}
		return bookdtoList;
	}

	@Override
	public Book saveBook(Book book) {
		return bookDao.save(book);
		
	}

}
