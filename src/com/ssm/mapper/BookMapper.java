package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.Book;

public interface BookMapper {
	//添加一本书
	public void addBook(Book book);
	
	//根据id删除一本书
	public void deleteBookById(Integer id);
	
	//根据ID查询书
	public Book findBookById(Integer id);
	
	//根据书名模糊查询书
	public List<Book> findBooksByKeyname(String keyname);
	
	//根据id编辑修改书的信息
	public void editBookInformationById(Book book);
	
	//根据用户id查询
	public List<Book> findBooksByUserId(Integer userId);
}
