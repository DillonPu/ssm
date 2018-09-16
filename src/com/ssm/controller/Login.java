package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.Book;
import com.ssm.pojo.User;
import com.ssm.service.BookService;
import com.ssm.service.LoginService;


@Controller

public class Login {
	/**
	 * @author AL
	 * 登录
	 */
	@Autowired
	private LoginService loginService;
	@Autowired
	private BookService bookService;
	
	@RequestMapping("login")
	public String login(String username,String password,Model model) {
		User user = this.loginService.findUserByNameAndPwd(username,password);
		
		if(user!=null) {
			Integer userId = user.getId();
			List<Book> books = bookService.findBooksByUserId(userId);
			for(Book book : books) {
				System.out.println(book);
			}
			model.addAttribute("user",user);
			model.addAttribute("books",books);
			return "my";
		}
		
		return "index";
		
	}
	
}
