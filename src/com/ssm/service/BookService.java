package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Book;

public interface BookService {
	public List<Book> findBooksByUserId(Integer userId);
}
