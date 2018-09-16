package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.BookMapper;
import com.ssm.pojo.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> findBooksByUserId(Integer userId) {
		List<Book> books = bookMapper.findBooksByUserId(userId);
		return books;
	}

}
