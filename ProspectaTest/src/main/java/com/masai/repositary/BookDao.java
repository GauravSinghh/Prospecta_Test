package com.masai.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.entity.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

}
